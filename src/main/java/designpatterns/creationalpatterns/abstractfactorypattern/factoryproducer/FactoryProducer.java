package designpatterns.creationalpatterns.abstractfactorypattern.factoryproducer;

import designpatterns.creationalpatterns.abstractfactorypattern.shapefactories.AbstractFactory;
import designpatterns.creationalpatterns.abstractfactorypattern.shapefactories.RoundedShapeFactory;
import designpatterns.creationalpatterns.abstractfactorypattern.shapefactories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
