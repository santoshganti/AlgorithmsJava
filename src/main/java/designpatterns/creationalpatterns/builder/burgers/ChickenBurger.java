package designpatterns.creationalpatterns.builder.burgers;

import designpatterns.creationalpatterns.builder.model.Burger;

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
