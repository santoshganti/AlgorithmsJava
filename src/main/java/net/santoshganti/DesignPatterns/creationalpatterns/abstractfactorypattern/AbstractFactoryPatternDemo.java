package net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern;


import net.santoshganti.Base.shape.Shape;
import net.santoshganti.Base.shape.ShapeType;
import net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern.AbstractShapeFactories.AbstractFactory;
import net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern.factoryproducer.FactoryProducer;

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
