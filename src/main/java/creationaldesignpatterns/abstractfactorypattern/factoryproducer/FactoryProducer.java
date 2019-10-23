package creationaldesignpatterns.abstractfactorypattern.factoryproducer;

import creationaldesignpatterns.abstractfactorypattern.shapefactories.AbstractFactory;
import creationaldesignpatterns.abstractfactorypattern.shapefactories.RoundedShapeFactory;
import creationaldesignpatterns.abstractfactorypattern.shapefactories.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
