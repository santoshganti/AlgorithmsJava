package designpatterns.creationalpatterns.abstractfactorypattern.shapefactories;

import designpatterns.creationalpatterns.abstractfactorypattern.shape.RoundedRectangle;
import designpatterns.creationalpatterns.abstractfactorypattern.shape.RoundedSquare;
import designpatterns.creationalpatterns.abstractfactorypattern.shape.Shape;
import designpatterns.creationalpatterns.abstractfactorypattern.shape.ShapeType;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType){
            case RECTANGLE:{
                return  new RoundedRectangle();
            }

            case SQUARE:{
                return new RoundedSquare();
            }

            default:{
                return null;
            }
        }
    }
}
