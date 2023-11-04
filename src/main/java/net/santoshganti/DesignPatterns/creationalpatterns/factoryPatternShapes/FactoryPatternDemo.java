package net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternShapes;

import net.santoshganti.Base.shape.Shape;
import net.santoshganti.Base.shape.ShapeType;
import net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternShapes.shapefactory.ShapeFactory;

/**
 * Creates an object hence a creational design pattern
 * <p>
 * Create objects without exposing the creation logic and refer to newly created
 * objects
 * using common interface.
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
        shape3.draw();
    }
}
