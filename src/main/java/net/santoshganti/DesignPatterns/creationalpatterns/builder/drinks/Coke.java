package net.santoshganti.DesignPatterns.creationalpatterns.builder.drinks;


import net.santoshganti.DesignPatterns.creationalpatterns.builder.model.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
