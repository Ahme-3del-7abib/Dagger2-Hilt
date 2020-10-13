package com.ibtikar.apps.dagger_training.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.ibtikar.apps.dagger_training.R;
import com.ibtikar.apps.dagger_training.cofee_show.Coffee;
import com.ibtikar.apps.dagger_training.component.CoffeeComponent;
import com.ibtikar.apps.dagger_training.component.DaggerCoffeeComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    TextView view;
    private static final String TAG = "MainActivity";

    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.inject(this);


        view = findViewById(R.id.tv);

        view.setText(component.getCoffee().getCoffeeCup());

        Log.d(TAG, " ahmed onCreate: " + component.getCoffee().getCoffeeCup());
    }

}