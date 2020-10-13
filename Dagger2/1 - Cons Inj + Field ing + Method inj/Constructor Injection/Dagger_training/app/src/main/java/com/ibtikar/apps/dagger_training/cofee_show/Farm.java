package com.ibtikar.apps.dagger_training.cofee_show;

import javax.inject.Inject;

public class Farm {

    @Inject
    public Farm() {

    }

    public String getBeans() {
        return "Beans";
    }
}
