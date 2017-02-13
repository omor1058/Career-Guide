package com.example.ajoysarkar.careerguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class eeeTip extends AppCompatActivity {

    public void eeeinfo(View view){
        startActivity(new Intent(getApplicationContext(), eeeinfo.class));
    }
    public void whyeee(View view){
        startActivity(new Intent(getApplicationContext(), whyeee.class));
    }
    public void eeefield(View view) {
        startActivity(new Intent(getApplicationContext(), eeefield.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee_tip);
    }
}
