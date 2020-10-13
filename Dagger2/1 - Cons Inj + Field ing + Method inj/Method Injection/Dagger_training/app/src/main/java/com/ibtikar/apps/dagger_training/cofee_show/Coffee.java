package com.ibtikar.apps.dagger_training.cofee_show;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {

    private static final String TAG = "Coffee";

    @Inject
    public Coffee() {
    }

    public void showCoffeeName() {
        Log.d(TAG, "showWelcomeToast " + " Simplex");
    }

    @Inject
    public void showWelcomeMessage() {
        Log.d(TAG, "showWelcomeToast: " + " Hello Ahmed :)");
    }

}
