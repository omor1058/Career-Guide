package com.example.ajoysarkar.careerguide;

import android.os.Environment;

/**
 * Created by omorf on 12/9/2016.
 */

public class CheckForSDCard {
    //Check If SD Card is present or not method
    public boolean isSDCardPresent() {
        if (Environment.getExternalStorageState().equals(

                Environment.MEDIA_MOUNTED)) {
            return true;
        }
        return false;
    }
}
