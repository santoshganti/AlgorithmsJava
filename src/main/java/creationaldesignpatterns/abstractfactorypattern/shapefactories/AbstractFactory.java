package creationaldesignpatterns.abstractfactorypattern.shapefactories;

import creationaldesignpatterns.abstractfactorypattern.shape.Shape;
import creationaldesignpatterns.abstractfactorypattern.shape.ShapeType;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType shapeType);
}
