package com.service4startup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Splash_Screeen extends AppCompatActivity {
    private ProgressBar pbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash__screeen);
        pbar = (ProgressBar)findViewById(R.id.progBar);
        Thread splashScreen =  new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent splash = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(splash);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splashScreen.start();
    }
}
