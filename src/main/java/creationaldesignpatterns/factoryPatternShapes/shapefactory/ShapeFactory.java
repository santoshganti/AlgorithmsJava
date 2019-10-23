package creationaldesignpatterns.factoryPatternShapes.shapefactory;

import creationaldesignpatterns.factoryPatternShapes.shapes.ShapeType;
import creationaldesignpatterns.factoryPatternShapes.shapes.Circle;
import creationaldesignpatterns.factoryPatternShapes.shapes.Rectangle;
import creationaldesignpatterns.factoryPatternShapes.shapes.Shape;
import creationaldesignpatterns.factoryPatternShapes.shapes.Square;

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
