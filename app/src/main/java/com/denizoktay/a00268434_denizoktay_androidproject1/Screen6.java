package com.denizoktay.a00268434_denizoktay_androidproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Screen6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);
        Thread splashTread = new Thread() {

            public void run() {
                try {
                    sleep(5000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                    Intent i = new Intent(Screen6.this,Screen3.class);
                    startActivity(i);
                }
            }
        };
        splashTread.start();

    }
}
