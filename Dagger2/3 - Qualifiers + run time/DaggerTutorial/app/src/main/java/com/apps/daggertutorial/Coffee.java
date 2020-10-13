package com.apps.daggertutorial;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Coffee {

    private static final String TAG = "Coffee";
    // for field injection
    @Inject
    public Farm farm;

    private River river;

    int sugar;
    int milk;

    // Constructor injection
    @Inject
    public Coffee(River river,
                  @Sugar int sugar, @Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    // for field injection
    public String getCoffeeCup() {
        return farm.getBeans() + " + " + river.getWater() + "Sugar : " + sugar + "Milk  : " + milk;
    }

    // Method injection
    @Inject
    public void connectElectricity() {
        Log.d(TAG, "Connect electricity");
    }
}
