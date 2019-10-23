package designpatterns.abstractfactorypattern.factoryproducer;

import designpatterns.abstractfactorypattern.shapefactories.AbstractFactory;
import designpatterns.abstractfactorypattern.shapefactories.RoundedShapeFactory;
import designpatterns.abstractfactorypattern.shapefactories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
