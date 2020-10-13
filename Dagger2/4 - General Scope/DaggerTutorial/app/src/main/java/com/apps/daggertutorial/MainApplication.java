package com.apps.daggertutorial;

import android.app.Application;

public class MainApplication extends Application {

    private CoffeeComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerCoffeeComponent.builder().Sugar(2).Milk(3).build();
    }

    public CoffeeComponent getComponent() {
        return component;
    }

}
