package com.apps.daggertutorial;

import android.app.Application;

public class MainApplication extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public AppComponent getComponent() {
        return component;
    }

}
