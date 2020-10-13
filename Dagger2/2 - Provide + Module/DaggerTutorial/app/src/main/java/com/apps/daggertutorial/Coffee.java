package com.apps.daggertutorial;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";
    // for field injection
    @Inject
    public Farm farm;

    private River river;

    // Constructor injection
    @Inject
    public Coffee(River river) {
        this.river = river;
    }

    // for field injection
    public String getCoffeeCup() {
        return farm.getBeans() + " + " + river.getWater();
    }

    // Method injection
    @Inject
    public void connectElectricity() {
        Log.d(TAG, "Connect electricity");
    }
}
