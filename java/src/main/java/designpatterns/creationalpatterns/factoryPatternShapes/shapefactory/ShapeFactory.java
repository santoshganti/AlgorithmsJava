package designpatterns.creationalpatterns.factoryPatternShapes.shapefactory;

import designpatterns.creationalpatterns.factoryPatternShapes.shapes.ShapeType;
import designpatterns.creationalpatterns.factoryPatternShapes.shapes.Circle;
import designpatterns.creationalpatterns.factoryPatternShapes.shapes.Rectangle;
import designpatterns.creationalpatterns.factoryPatternShapes.shapes.Shape;
import designpatterns.creationalpatterns.factoryPatternShapes.shapes.Square;

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
