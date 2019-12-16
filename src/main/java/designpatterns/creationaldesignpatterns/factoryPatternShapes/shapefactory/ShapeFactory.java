package designpatterns.creationaldesignpatterns.factoryPatternShapes.shapefactory;

import designpatterns.creationaldesignpatterns.factoryPatternShapes.shapes.ShapeType;
import designpatterns.creationaldesignpatterns.factoryPatternShapes.shapes.Circle;
import designpatterns.creationaldesignpatterns.factoryPatternShapes.shapes.Rectangle;
import designpatterns.creationaldesignpatterns.factoryPatternShapes.shapes.Shape;
import designpatterns.creationaldesignpatterns.factoryPatternShapes.shapes.Square;

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
