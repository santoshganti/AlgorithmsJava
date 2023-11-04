package net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern.AbstractShapeFactories;

import net.santoshganti.Base.shape.Shape;
import net.santoshganti.Base.shape.ShapeType;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType shapeType);
}
