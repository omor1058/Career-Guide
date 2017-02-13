package com.example.ajoysarkar.careerguide;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {
    private VideoView myVideoView;
    private int position = 0;
    private ProgressDialog progressDialog;
    private MediaController mediaControls;
    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                String video_path = "https://www.youtube.com/watch?v=M6vCJ8NVk-Q";

                Uri uri = Uri.parse(video_path);

                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                String video_path = "https://www.youtube.com/watch?v=-vH6Vvzx8sk&t=100s";

                Uri uri = Uri.parse(video_path);

                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);

            }

        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                String video_path = "https://www.youtube.com/watch?v=lLIagEEkjtg";

                Uri uri = Uri.parse(video_path);

                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);

            }

        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                String video_path = "https://www.youtube.com/watch?v=fnl2V9aVfwY";

                Uri uri = Uri.parse(video_path);

                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);

            }

        });
        b5.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                String video_path = "https://www.youtube.com/watch?v=Siyi8ka6mDk";

                Uri uri = Uri.parse(video_path);

                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);

            }

        });
        b6.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

                String video_path = "https://www.youtube.com/watch?v=04VOi7GCY5o";

                Uri uri = Uri.parse(video_path);

                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                startActivity(intent);

            }

        });
//        //set the media controller buttons
//        if (mediaControls == null) {
//
//            mediaControls = new MediaController(video.this);
//        }
//
//        //initialize the VideoView
//        myVideoView = (VideoView) findViewById(R.id.videoView);
//
//        // create a progress bar while the video file is loading
//        progressDialog = new ProgressDialog(video.this);
//        // set a title for the progress bar
//        progressDialog.setTitle("JavaCodeGeeks Android Video View Example");
//        // set a message for the progress bar
//        progressDialog.setMessage("Loading...");
//        //set the progress bar not cancelable on users' touch
//        progressDialog.setCancelable(false);
//        // show the progress bar
//        progressDialog.show();
//
//        try {
//            //set the media controller in the VideoView
//            myVideoView.setMediaController(mediaControls);
//
//            //set the uri of the video to be played
//            myVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.movie));
//
//        } catch (Exception e) {
//            Log.e("Error", e.getMessage());
//            e.printStackTrace();
//        }
//
//        myVideoView.requestFocus();
//        //we also set an setOnPreparedListener in order to know when the video file is ready for playback
//        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//
//            public void onPrepared(MediaPlayer mediaPlayer) {
//                // close the progress bar and play the video
//                progressDialog.dismiss();
//                //if we have a position on savedInstanceState, the video playback should start from here
//                myVideoView.seekTo(position);
//                if (position == 0) {
//                    myVideoView.start();
//                } else {
//                    //if we come from a resumed activity, video playback will be paused
//                    myVideoView.pause();
//                }
//            }
//        });
//
//    }
//
//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//        super.onSaveInstanceState(savedInstanceState);
//        //we use onSaveInstanceState in order to store the video playback position for orientation change
//        savedInstanceState.putInt("Position", myVideoView.getCurrentPosition());
//        myVideoView.pause();
//    }
//
//    @Override
//    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        //we use onRestoreInstanceState in order to play the video playback from the stored position
//        position = savedInstanceState.getInt("Position");
//        myVideoView.seekTo(position);
    }
}