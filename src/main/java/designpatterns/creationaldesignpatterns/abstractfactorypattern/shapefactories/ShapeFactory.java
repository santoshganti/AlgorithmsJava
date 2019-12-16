package designpatterns.creationaldesignpatterns.abstractfactorypattern.shapefactories;

import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.Rectangle;
import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.Shape;
import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.ShapeType;
import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.Square;

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
