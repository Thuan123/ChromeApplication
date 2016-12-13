package com.example.thuan.chromeapplication;

import android.app.Activity;
import android.os.Bundle;

import us.costan.chrome.ChromeView;


public class MainActivity extends Activity {
    ChromeView chromeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chromeView = (ChromeView)findViewById(R.id.view);
        chromeView.getSettings().setJavaScriptEnabled(true);
        chromeView.loadUrl("http://www.google.com");
    }
}
