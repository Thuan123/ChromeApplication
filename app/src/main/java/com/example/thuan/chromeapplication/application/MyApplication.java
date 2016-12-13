package com.example.thuan.chromeapplication.application;

/**
 * Created by thuan on 12/12/2016.
 */

import android.app.Application;

import us.costan.chrome.ChromeView;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ChromeView.initialize(this);
    }
}