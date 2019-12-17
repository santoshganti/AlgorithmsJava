package designpatterns.creationalpatterns.abstractfactorypattern.shapefactories;

import designpatterns.creationalpatterns.abstractfactorypattern.shape.Rectangle;
import designpatterns.creationalpatterns.abstractfactorypattern.shape.Shape;
import designpatterns.creationalpatterns.abstractfactorypattern.shape.ShapeType;
import designpatterns.creationalpatterns.abstractfactorypattern.shape.Square;

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
