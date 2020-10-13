package com.ibtikar.apps.dagger_training.cofee_show;

import javax.inject.Inject;

public class River {

    @Inject
    public River() {

    }

    public String getWater(){
        return "Water";
    }
}
