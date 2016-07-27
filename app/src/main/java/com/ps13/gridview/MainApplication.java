package com.ps13.gridview;

import android.app.Application;

import com.ps13.gridview.util.Contextor;

/**
 * Created by PS13 on 27/7/2559.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
