package com.example.ajoysarkar.careerguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class architectureTip extends AppCompatActivity {

    public void archinfo(View view){
        startActivity(new Intent(getApplicationContext(), archinfo.class));
    }
    public void archstep(View view){

        startActivity(new Intent(getApplicationContext(), archstep.class));
    }
    public void whyarch(View view) {
        startActivity(new Intent(getApplicationContext(), whyarch.class));
    }
    public void admission(View view){
        startActivity(new Intent(getApplicationContext(),admission.class));
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture_tip);
    }
}
