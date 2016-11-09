package com.phonegap.eventApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import org.apache.cordova.CordovaActivity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by xizhouli on 11/8/16.
 */

public class SplashActivity extends CordovaActivity {
    private static final long Delay = 3000;
    private boolean scheduled = false;
    private Timer splashTimer;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nima);
        splashTimer = new Timer();
        splashTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                SplashActivity.this.finish();
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        },Delay);
        scheduled = true;
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        if(scheduled){
            splashTimer.cancel();
        }
        splashTimer.purge();
    }

}
