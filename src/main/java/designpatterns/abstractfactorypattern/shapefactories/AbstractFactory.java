package designpatterns.abstractfactorypattern.shapefactories;

import designpatterns.abstractfactorypattern.shape.Shape;
import designpatterns.abstractfactorypattern.shape.ShapeType;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType shapeType);
}
