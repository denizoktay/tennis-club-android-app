package com.denizoktay.a00268434_denizoktay_androidproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        Button myButton2 = findViewById(R.id.button2);

        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Screen2.this,Screen6.class);
                startActivity(i);
            }
        });

        Button myButton3 = findViewById(R.id.button3);

        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Screen2.this,Screen4.class);
                startActivity(i);
            }
        });



        Button myButton6 = findViewById(R.id.button6);

        myButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Screen2.this,Screen7.class);
                startActivity(i);
            }
        });




        try {
            Bundle extras = getIntent().getExtras();
            String sentText = extras.getString("Name");
            TextView tvNameReceived = findViewById(R.id.textView6);
            tvNameReceived.setText("Hi "+sentText+",");
        } catch (RuntimeException e) {

            e.printStackTrace();
        }

    }
    public void goScreen5(View view)
    {
        Intent i = new Intent(Screen2.this, Screen5.class);
        startActivity(i);
    }
    public void openPhone (View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:" + "0906468000"));
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);

    }

}
