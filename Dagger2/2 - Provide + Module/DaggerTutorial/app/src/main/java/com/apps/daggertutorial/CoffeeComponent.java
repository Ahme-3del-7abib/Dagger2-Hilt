package com.apps.daggertutorial;


import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {


    Coffee getCoffee();

    void inject(MainActivity mainActivity);
}
