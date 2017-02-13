package com.example.ajoysarkar.careerguide;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContactUs extends AppCompatActivity {

    EditText name,email,phone,massage;
    String Getname,GetEmail,GetPhone,GetMassage ;
    Button contact ;
    String DataParseUrl = "http://abid.net16.net/jakia/Data_insert.php" ;
    Boolean CheckEditText ;
    String Response;
    HttpResponse response ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        phone = (EditText)findViewById(R.id.phone);
        massage = (EditText)findViewById(R.id.massage);

        contact = (Button)findViewById(R.id.contact) ;

        contact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                GetCheckEditTextIsEmptyOrNot();

                if(CheckEditText){

                    SendDataToServer(Getname, GetEmail, GetPhone,GetMassage);

                }
                else {

                    Toast.makeText(ContactUs.this, "Please fill all form fields.", Toast.LENGTH_LONG).show();

                }

            }
        });
    }

    public void GetCheckEditTextIsEmptyOrNot(){

        Getname = name.getText().toString();
        GetEmail = email.getText().toString();
        GetPhone = phone.getText().toString();
        GetMassage = massage.getText().toString();

        if(TextUtils.isEmpty(Getname) || TextUtils.isEmpty(GetEmail) || TextUtils.isEmpty(GetPhone)|| TextUtils.isEmpty(GetMassage))
        {

            CheckEditText = false;

        }
        else {

            CheckEditText = true ;
        }

    }

    public void SendDataToServer(final String name, final String email, final String phone,final  String massage){
        class SendPostReqAsyncTask extends AsyncTask<String, Void, String> {
            @Override
            protected String doInBackground(String... params) {

                String QuickName = name ;
                String QuickEmail = email ;
                String QuickPhone = phone;
                String QuickMassage = massage;


                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

                nameValuePairs.add(new BasicNameValuePair("name", QuickName));
                nameValuePairs.add(new BasicNameValuePair("email", QuickEmail));
                nameValuePairs.add(new BasicNameValuePair("phone", QuickPhone));
                nameValuePairs.add(new BasicNameValuePair("massage", QuickMassage));


                try {
                    HttpClient httpClient = new DefaultHttpClient();

                    HttpPost httpPost = new HttpPost(DataParseUrl);

                    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                    HttpResponse response = httpClient.execute(httpPost);

                    HttpEntity entity = response.getEntity();


                } catch (ClientProtocolException e) {

                } catch (IOException e) {

                }
                return "Data Submit Successfully";
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);

                Toast.makeText(ContactUs.this, "Data Submit Successfully", Toast.LENGTH_LONG).show();

            }
        }
        SendPostReqAsyncTask sendPostReqAsyncTask = new SendPostReqAsyncTask();
        sendPostReqAsyncTask.execute(name, email, phone,massage);
    }

}