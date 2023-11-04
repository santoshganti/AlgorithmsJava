package net.santoshganti.DesignPatterns.creationalpatterns.builder.drinks;


import net.santoshganti.DesignPatterns.creationalpatterns.builder.model.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
