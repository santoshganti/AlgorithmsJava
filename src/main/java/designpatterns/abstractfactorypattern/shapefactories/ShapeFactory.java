package designpatterns.abstractfactorypattern.shapefactories;

import designpatterns.abstractfactorypattern.shape.Rectangle;
import designpatterns.abstractfactorypattern.shape.Shape;
import designpatterns.abstractfactorypattern.shape.ShapeType;
import designpatterns.abstractfactorypattern.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {

        switch (shapeType) {
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
