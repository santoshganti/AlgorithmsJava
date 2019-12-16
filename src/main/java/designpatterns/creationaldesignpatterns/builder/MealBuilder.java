package designpatterns.creationaldesignpatterns.builder;

import designpatterns.creationaldesignpatterns.builder.burgers.ChickenBurger;
import designpatterns.creationaldesignpatterns.builder.burgers.VegBurger;
import designpatterns.creationaldesignpatterns.builder.drinks.Coke;
import designpatterns.creationaldesignpatterns.builder.drinks.Pepsi;

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
