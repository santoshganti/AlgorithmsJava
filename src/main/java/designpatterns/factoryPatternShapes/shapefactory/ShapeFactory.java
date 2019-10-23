package designpatterns.factoryPatternShapes.shapefactory;

import designpatterns.factoryPatternShapes.shapes.ShapeType;
import designpatterns.factoryPatternShapes.shapes.Circle;
import designpatterns.factoryPatternShapes.shapes.Rectangle;
import designpatterns.factoryPatternShapes.shapes.Shape;
import designpatterns.factoryPatternShapes.shapes.Square;

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
