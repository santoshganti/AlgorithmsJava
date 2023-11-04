package net.santoshganti.DesignPatterns.creationalpatterns.abstractfactorypattern.AbstractShapeFactories;

import net.santoshganti.Base.shape.Shape;
import net.santoshganti.Base.shape.ShapeType;
import net.santoshganti.Base.shapes.RoundedRectangle;
import net.santoshganti.Base.shapes.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE: {
                return new RoundedRectangle();
            }

            case SQUARE: {
                return new RoundedSquare();
            }

            default: {
                return null;
            }
        }
    }
}
