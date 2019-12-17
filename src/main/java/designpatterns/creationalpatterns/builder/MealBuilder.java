package designpatterns.creationalpatterns.builder;

import designpatterns.creationalpatterns.builder.burgers.ChickenBurger;
import designpatterns.creationalpatterns.builder.burgers.VegBurger;
import designpatterns.creationalpatterns.builder.drinks.Coke;
import designpatterns.creationalpatterns.builder.drinks.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.additem(new VegBurger());
        meal.additem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.additem(new ChickenBurger());
        meal.additem(new Pepsi());
        return meal;
    }
}
