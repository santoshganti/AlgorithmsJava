package net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern.AbstractShapeFactories;

import net.santoshganti.Base.shape.Shape;
import net.santoshganti.Base.shape.ShapeType;
import net.santoshganti.Base.shapes.Rectangle;
import net.santoshganti.Base.shapes.Square;

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
