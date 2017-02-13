package com.example.ajoysarkar.careerguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class conversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        // Setting up onClickListeners for send button
        Button loginButton = (Button) findViewById(R.id.useThisButton);
        loginButton.setOnClickListener(useThisButtonListener);
    }

    private OnClickListener useThisButtonListener = new OnClickListener() {
        public void onClick(View v) {
            EditText userTypedMessage = (EditText) findViewById(R.id.nameEditText);
            String nick = userTypedMessage.getText().toString();
            if (nick.compareTo("") != 0) {
                startNewIntent(nick);
            }
        }
    };

    public void startNewIntent(String nick) {
        Intent i = new Intent(this, Messaging.class);
        i.putExtra("nick", nick);
        startActivityForResult(i, 9);
    }



}
