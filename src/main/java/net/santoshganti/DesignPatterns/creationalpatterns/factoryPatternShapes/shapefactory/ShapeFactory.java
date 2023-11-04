package net.santoshganti.DesignPatterns.creationalpatterns.factoryPatternShapes.shapefactory;

import net.santoshganti.Base.shape.Shape;
import net.santoshganti.Base.shape.ShapeType;
import net.santoshganti.Base.shapes.Circle;
import net.santoshganti.Base.shapes.Rectangle;
import net.santoshganti.Base.shapes.Square;

public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE: {
                return new Circle();
            }

            case RECTANGLE: {
                return new Rectangle();
            }

            case SQUARE: {
                return new Square();
            }

            default: {
                return null;
            }
        }
    }
}
