package com.example.ajoysarkar.careerguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CareerTips extends AppCompatActivity {
    public void cseTips(View view){
        startActivity(new Intent(getApplicationContext(), cseTip.class));

    }
    public void civil(View view){
        startActivity(new Intent(getApplicationContext(), civilTip.class));

    }
    public void eee(View view){
        startActivity(new Intent(getApplicationContext(), eeeTip.class));

    }

    public void architecture(View view){
        startActivity(new Intent(getApplicationContext(), architectureTip.class));

    }
    public void scholar(View view) {
        startActivity(new Intent(getApplicationContext(), scholars.class));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_tips);
    }
}
