package com.cml.webviewapk;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;


import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    final String URL_TO_LOAD = "https://www.google.com/";

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);


        webView = findViewById(R.id.WebView);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());
        getWindow().getDecorView().setBackgroundColor(Color.BLACK);
        // webView.setRotation(180);

        WebSettings webSettings = this.webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setAppCacheEnabled(true);
        webView.loadUrl(URL_TO_LOAD);



        //  textView.setText(message);
    }
    public void onBackPressed(){
        if (this.webView.canGoBack()){
            this.webView.goBack();
        }
        else super.onBackPressed();
    }
}
