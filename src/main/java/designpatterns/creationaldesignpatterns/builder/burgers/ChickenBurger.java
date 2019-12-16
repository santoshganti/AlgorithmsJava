package designpatterns.creationaldesignpatterns.builder.burgers;

import designpatterns.creationaldesignpatterns.builder.model.Burger;

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
