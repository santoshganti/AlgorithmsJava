package creationaldesignpatterns.abstractfactorypattern;

import creationaldesignpatterns.abstractfactorypattern.factoryproducer.FactoryProducer;
import creationaldesignpatterns.abstractfactorypattern.shape.Shape;
import creationaldesignpatterns.abstractfactorypattern.shape.ShapeType;
import creationaldesignpatterns.abstractfactorypattern.shapefactories.AbstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape(ShapeType.RECTANGLE);
        shape3.draw();

        Shape shape4 = shapeFactory1.getShape(ShapeType.SQUARE);
        shape4.draw();
    }
}
