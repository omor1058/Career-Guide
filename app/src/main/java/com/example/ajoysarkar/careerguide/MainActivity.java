package com.example.ajoysarkar.careerguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    public int currentimageindex=0;
    //    Timer timer;
//    TimerTask task;
    ImageView slidingimage;

    private int[] IMAGE_IDS = {
            R.drawable.banner, R.drawable.image1, R.drawable.image2,
            R.drawable.image1
    };
    public void bestUniversity(View view){
        startActivity(new Intent(getApplicationContext(), bestUniversity.class));
    }
    public void aboutUs(View view){
        startActivity(new Intent(getApplicationContext(), aboutUs.class));
    }
    public void tips(View view){
        startActivity(new Intent(getApplicationContext(), CareerTips.class));
    }
public void discussion(View view){
    startActivity(new Intent(getApplicationContext(), conversion.class));
}
//    public void tips(View view){
//        setContentView(R.layout.);
//
//    }
public void contact(View view){
    startActivity(new Intent(getApplicationContext(), ContactUs.class));
}
    public void cv(View view){
        startActivity(new Intent(getApplicationContext(), cvSample.class));
    }
    public void jobTest(View view){
        startActivity(new Intent(getApplicationContext(), jobTest.class));
    }
    public void video(View view){
        startActivity(new Intent(getApplicationContext(), video.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler mHandler = new Handler();

        // Create runnable for posting
        final Runnable mUpdateResults = new Runnable() {
            public void run() {

                AnimateandSlideShow();

            }
        };

        int delay = 1000; // delay for 1 sec.

        int period = 4000; // repeat every 4 sec.

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {

                mHandler.post(mUpdateResults);

            }

        }, delay, period);



    }

    public void onClick(View v) {

        finish();
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    /**
     * Helper method to start the animation on the splash screen
     */
    private void AnimateandSlideShow() {


        slidingimage = (ImageView)findViewById(R.id.ImageView3_Left);
        slidingimage.setImageResource(IMAGE_IDS[currentimageindex%IMAGE_IDS.length]);

        currentimageindex++;

        Animation rotateimage = AnimationUtils.loadAnimation(this, R.anim.fade_in);


        slidingimage.startAnimation(rotateimage);



    }


}