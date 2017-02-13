package com.example.ajoysarkar.careerguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class scholars extends AppCompatActivity {


    public void scinfo(View view){
        startActivity(new Intent(getApplicationContext(), scinfo.class));
    }
    public void whysc(View view){
        startActivity(new Intent(getApplicationContext(), whysc.class));
    }
    public void scname(View view) {
        startActivity(new Intent(getApplicationContext(), scname.class));
    }
    public void gre(View view){
        startActivity(new Intent(getApplicationContext(),gre.class));
    }
    public void ielts(View view){
        startActivity(new Intent(getApplicationContext(), ielts.class));
    }
    public void toefl(View view){
        startActivity(new Intent(getApplicationContext(), toefl.class));
    }
    public void gmat(View view){
        startActivity(new Intent(getApplicationContext(), gmat.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholars);
    }
}
