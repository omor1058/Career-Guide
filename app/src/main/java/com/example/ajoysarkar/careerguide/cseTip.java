package com.example.ajoysarkar.careerguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cseTip extends AppCompatActivity {


    public void cseinfo(View view){
        startActivity(new Intent(getApplicationContext(), cseinfo.class));
    }
    public void whycse(View view){
        startActivity(new Intent(getApplicationContext(), whycse.class));
    }

    public void career1(View view){
        startActivity(new Intent(getApplicationContext(), career1.class));
    }
    public void programming(View view){
        startActivity(new Intent(getApplicationContext(), programming.class));
    }
    public void nonprog(View view) {
        startActivity(new Intent(getApplicationContext(), nonprog.class));
    }
    public void careerprog(View view){
        startActivity(new Intent(getApplicationContext(),careerprog.class));
    }
    public void math(View view){
        startActivity(new Intent(getApplicationContext(), math.class));
    }
    public void freelance(View view){
        startActivity(new Intent(getApplicationContext(), freelance.class));
    }
    public void starting(View view){
        startActivity(new Intent(getApplicationContext(), starting.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_tip);
    }
}
