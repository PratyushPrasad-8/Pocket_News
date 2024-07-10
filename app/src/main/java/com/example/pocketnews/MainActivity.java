package com.example.pocketnews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    WebView wbView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wbView=findViewById(R.id.wbView);

        wbView.loadUrl("https://indianexpress.com");
        wbView.setWebViewClient(new WebViewClient());
        wbView.getSettings().setJavaScriptEnabled(true);
    }
}