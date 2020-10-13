package com.apps.daggertutorial;


import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface CoffeeComponent {

    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder Sugar(@Sugar int sugar);

        @BindsInstance
        Builder Milk(@Milk int milk);

        Builder appComponent(AppComponent component);

        CoffeeComponent build();
    }
}
