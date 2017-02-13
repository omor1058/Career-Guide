package com.example.ajoysarkar.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class bestUniversity extends AppCompatActivity {

    public void cuet(View view){
        startActivity(new Intent(getApplicationContext(), cuet.class));
    }
    public void du(View view){
        startActivity(new Intent(getApplicationContext(), DU.class));
    }
    public void kuet(View view) {
        startActivity(new Intent(getApplicationContext(), kuet.class));
    }
    public void buet(View view) {
        startActivity(new Intent(getApplicationContext(), buet.class));
    }
    public void iut(View view) {
        startActivity(new Intent(getApplicationContext(), iut.class));
    }
    public void sust(View view) {
        startActivity(new Intent(getApplicationContext(), sust.class));
    }
    public void lu(View view) {
        startActivity(new Intent(getApplicationContext(), lu.class));
    }
    public void ju(View view) {
        startActivity(new Intent(getApplicationContext(), ju.class));
    }
    public void nu(View view) {
        startActivity(new Intent(getApplicationContext(), nu.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_university);

    }
    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(bestUniversity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}