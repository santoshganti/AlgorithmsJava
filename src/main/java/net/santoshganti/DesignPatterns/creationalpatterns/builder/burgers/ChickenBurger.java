package net.santoshganti.DesignPatterns.creationalpatterns.builder.burgers;


import net.santoshganti.DesignPatterns.creationalpatterns.builder.model.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
