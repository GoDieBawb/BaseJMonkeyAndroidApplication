package com.bigbawb.baseapplication;

/**
 * Created by Bob on 6/29/2018.
 */

import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jme3.app.AndroidHarness;

import java.util.logging.Level;
import java.util.logging.LogManager;

public class MainActivity extends AndroidHarness {

    /*
     * Note that you can ignore the errors displayed in this file,
     * the android project will build regardless.
     * Install the 'Android' plugin under Tools->Plugins->Available Plugins
     * to get error checks and code completion for the Android project files.
     */

    public MainActivity() {
        this.mouseEventsEnabled  = true;
        //splashPicID = R.drawable.splash;
        // Set the application class to run
        appClass = "mygame.Main";
        // Try ConfigType.FASTEST; or ConfigType.LEGACY if you have problems
        //eglConfigType = ConfigType.BEST;
        // Exit Dialog title & message
        exitDialogTitle = "Exit?";
        exitDialogMessage = "Press Yes";
        // Enable verbose logging
        //eglConfigVerboseLogging = false;
        // Choose screen orientation
        //screenOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
        // Enable MouseEvents being generated from TouchEvents (default = true)
        //mouseEventsEnabled = true;
        // Set the default logging level (default=Level.INFO, Level.ALL=All Debug Info)
        LogManager.getLogManager().getLogger("").setLevel(Level.INFO);
    }

    @Override
    public void onCreate(Bundle bundle) {

        super.onCreate(bundle);

    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {

        return true;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.runFinalization();
        android.os.Process.killProcess(android.os.Process.myPid());
    }

}