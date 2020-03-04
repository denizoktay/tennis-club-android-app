package com.denizoktay.a00268434_denizoktay_androidproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        WebView myBrowser = findViewById(R.id.webView);
        myBrowser.setWebViewClient(new WebViewClient());
        myBrowser.loadUrl("https://en.wikipedia.org/wiki/Steffi_Graf");

    }
}
