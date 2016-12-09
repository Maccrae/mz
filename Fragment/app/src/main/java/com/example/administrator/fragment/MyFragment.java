package com.example.administrator.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/12/9.
 */

public class MyFragment extends Fragment {
    private TextView textView;
    private String information;

    public MyFragment(String information){
        this.information = information;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment,container,false);
        textView = (TextView) view.findViewById(R.id.fragment_tv);
        textView.setText(information);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText( information);
            }
        });
        return view;
    }
}
