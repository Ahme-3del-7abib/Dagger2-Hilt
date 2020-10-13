package com.apps.daggertutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component = ((MainApplication) getApplication()).getComponent();

        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder().appComponent(component).Sugar(3).Milk(2).build();
        coffeeComponent.inject(this);
        coffee.getCoffeeCup();

    }
}