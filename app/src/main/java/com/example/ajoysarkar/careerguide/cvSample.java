package com.example.ajoysarkar.careerguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class cvSample extends AppCompatActivity {

    public void CV1(View view){
        startActivity(new Intent(getApplicationContext(), Chronological.class));

    }
    public void CV2(View view){
        startActivity(new Intent(getApplicationContext(), Functional.class));

    }
    public void CV3(View view){
        startActivity(new Intent(getApplicationContext(), Combined.class));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv_sample);

    }
}