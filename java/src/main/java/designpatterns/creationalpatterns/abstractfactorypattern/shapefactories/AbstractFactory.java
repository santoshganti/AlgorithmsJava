package designpatterns.creationalpatterns.abstractfactorypattern.shapefactories;

import designpatterns.creationalpatterns.abstractfactorypattern.shape.Shape;
import designpatterns.creationalpatterns.abstractfactorypattern.shape.ShapeType;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType shapeType);
}
