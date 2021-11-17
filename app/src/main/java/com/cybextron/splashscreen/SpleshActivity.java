package com.cybextron.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;

public class SpleshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);

        // using Handler()
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SpleshActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);

        // using CountDownTimer()
        new CountDownTimer(2000, 1000) {
            public void onTick(long millisUntilFinished) {
            }
            public void onFinish() {
                Intent intent = new Intent(SpleshActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();

        // using Thread()
        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(SpleshActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }).start();

    }
}