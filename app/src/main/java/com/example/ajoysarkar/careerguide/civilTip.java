package com.example.ajoysarkar.careerguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class civilTip extends AppCompatActivity {

    public void civilinfo(View view){
        startActivity(new Intent(getApplicationContext(), civilinfo.class));
    }
    public void civilwork(View view){
        startActivity(new Intent(getApplicationContext(), civilwork.class));
    }
    public void civilstep(View view) {
        startActivity(new Intent(getApplicationContext(), civilstep.class));
    }
    public void civilcareer(View view){
        startActivity(new Intent(getApplicationContext(),civilcareer.class));
    }

    public void wherestudy(View view){
        startActivity(new Intent(getApplicationContext(), wherestudy.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_tip);
    }
}
