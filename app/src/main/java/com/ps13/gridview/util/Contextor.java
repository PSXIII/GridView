package com.ps13.gridview.util;

import android.content.Context;

/**
 * Created by PS13 on 27/7/2559.
 */

public class Contextor {
    private static Contextor instance;

    public static Contextor getInstance(){
        if (instance == null)
            instance = new Contextor();
        return instance;
    }

    private Context mContext;

    public Contextor() {

    }

    public void init(Context context) {
        mContext = context;
    }

    public Context getContext() {
        return mContext;
    }
}
