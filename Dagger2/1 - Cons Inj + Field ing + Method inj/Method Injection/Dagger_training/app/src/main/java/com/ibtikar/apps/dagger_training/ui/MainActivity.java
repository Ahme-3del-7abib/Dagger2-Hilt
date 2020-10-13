package com.ibtikar.apps.dagger_training.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;;

import com.ibtikar.apps.dagger_training.R;
import com.ibtikar.apps.dagger_training.cofee_show.Coffee;
import com.ibtikar.apps.dagger_training.component.CoffeeComponent;
import com.ibtikar.apps.dagger_training.component.DaggerCoffeeComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.inject(this);

        coffee.showCoffeeName();

    }

}