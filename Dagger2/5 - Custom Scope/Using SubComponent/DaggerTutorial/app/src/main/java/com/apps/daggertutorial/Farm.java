package com.apps.daggertutorial;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;


public class Farm {

    private static final String TAG = "Farm";

    @Inject
    public Farm() {
        Log.d(TAG, "Farm: ");
    }

    public String getBeans() {
        return "Beans";
    }

}
