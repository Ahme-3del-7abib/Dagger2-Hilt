package com.ibtikar.apps.dagger_training.component;

import com.ibtikar.apps.dagger_training.cofee_show.Coffee;
import com.ibtikar.apps.dagger_training.ui.MainActivity;

import dagger.Component;

@Component
public interface CoffeeComponent {

    Coffee showToast();

    void inject(MainActivity mainActivity);

}
