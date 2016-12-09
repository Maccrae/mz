package com.example.administrator.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private MyFragment f1;
    private MyFragment f2;


    private Button buttonx;
    private Button buttony;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonx = (Button) findViewById(R.id.button1);
        buttony = (Button) findViewById(R.id.button2);

        buttonx.setOnClickListener(this);
        buttony.setOnClickListener(this);


        initFragment1();
    }


    private void initFragment1(){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();




       if(f1 == null){
            f1 = new MyFragment("没有新消息");
        }
        transaction.replace(R.id.frame_layout, f1);


        transaction.commit();
    }


    private void initFragment2(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();


      if(f2 == null) {
           f2 = new MyFragment("您还没有关注……");
        }
        transaction.replace(R.id.frame_layout, f2);

        transaction.commit();
    }





    @Override
    public void onClick(View v) {
        if(v == buttonx){
            initFragment1();
        }else if(v == buttony){
            initFragment2();
        }
    }
}

