package com.apps.daggertutorial;


import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {


    @Provides
    River provideRiver() {
        return new River();
    }

}
