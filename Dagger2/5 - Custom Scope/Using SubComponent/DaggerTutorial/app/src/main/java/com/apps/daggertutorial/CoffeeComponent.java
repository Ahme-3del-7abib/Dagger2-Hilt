package com.apps.daggertutorial;


import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent()
public interface CoffeeComponent {

    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        Builder Sugar(@Sugar int sugar);

        @BindsInstance
        Builder Milk(@Milk int milk);

        CoffeeComponent build();
    }
}
