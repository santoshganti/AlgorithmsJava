package net.santoshganti.DesignPatterns.creationalpatterns.builder.burgers;

import net.santoshganti.DesignPatterns.creationalpatterns.builder.model.Burger;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
