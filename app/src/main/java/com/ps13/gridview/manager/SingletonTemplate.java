package com.ps13.gridview.manager;

import android.content.Context;

import com.ps13.gridview.util.Contextor;

/**
 * Created by PS13 on 27/7/2559.
 */
public class SingletonTemplate {
    private static SingletonTemplate instance;

    public static SingletonTemplate getInstance() {
        if (instance == null)
            instance = new SingletonTemplate();
        return instance;
    }

    private Context mContext;

    private SingletonTemplate() {
        mContext = Contextor.getInstance().getContext();
    }
}
