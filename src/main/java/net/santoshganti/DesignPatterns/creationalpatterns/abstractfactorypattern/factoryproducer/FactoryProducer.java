package net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern.factoryproducer;

import net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern.AbstractShapeFactories.AbstractFactory;
import net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern.AbstractShapeFactories.RoundedShapeFactory;
import net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern.AbstractShapeFactories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
