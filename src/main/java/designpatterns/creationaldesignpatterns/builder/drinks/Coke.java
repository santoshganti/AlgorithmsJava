package designpatterns.creationaldesignpatterns.builder.drinks;

import designpatterns.creationaldesignpatterns.builder.model.ColdDrink;

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
