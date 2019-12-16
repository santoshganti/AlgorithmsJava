package designpatterns.creationaldesignpatterns.abstractfactorypattern.factoryproducer;

import designpatterns.creationaldesignpatterns.abstractfactorypattern.shapefactories.AbstractFactory;
import designpatterns.creationaldesignpatterns.abstractfactorypattern.shapefactories.RoundedShapeFactory;
import designpatterns.creationaldesignpatterns.abstractfactorypattern.shapefactories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
