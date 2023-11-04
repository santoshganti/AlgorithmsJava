package net.santoshganti.DesignPatterns.creationalpatterns.builder;

import net.santoshganti.DesignPatterns.creationalpatterns.builder.burgers.ChickenBurger;
import net.santoshganti.DesignPatterns.creationalpatterns.builder.burgers.VegBurger;
import net.santoshganti.DesignPatterns.creationalpatterns.builder.drinks.Coke;
import net.santoshganti.DesignPatterns.creationalpatterns.builder.drinks.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.additem(new VegBurger());
        meal.additem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.additem(new ChickenBurger());
        meal.additem(new Pepsi());
        return meal;
    }
}
