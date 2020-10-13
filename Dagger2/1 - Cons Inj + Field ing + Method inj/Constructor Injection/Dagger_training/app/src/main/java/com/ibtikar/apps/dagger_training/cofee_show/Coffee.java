package com.ibtikar.apps.dagger_training.cofee_show;

import javax.inject.Inject;

public class Coffee {

    Farm farm;
    River river;

    @Inject
    public Coffee(Farm farm, River river) {
        this.river = river;
        this.farm = farm;
    }


    public String getCoffeeCup() {
        return farm.getBeans() + " " + river.getWater();
    }
}
