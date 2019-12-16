package designpatterns.creationaldesignpatterns.abstractfactorypattern.shapefactories;

import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.Shape;
import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.ShapeType;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType shapeType);
}
