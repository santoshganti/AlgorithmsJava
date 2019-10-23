package creationaldesignpatterns.abstractfactorypattern.shapefactories;

import creationaldesignpatterns.abstractfactorypattern.shape.Rectangle;
import creationaldesignpatterns.abstractfactorypattern.shape.Shape;
import creationaldesignpatterns.abstractfactorypattern.shape.ShapeType;
import creationaldesignpatterns.abstractfactorypattern.shape.Square;

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
