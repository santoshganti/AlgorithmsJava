package designpatterns.abstractfactorypattern.shapefactories;

import designpatterns.abstractfactorypattern.shape.RoundedRectangle;
import designpatterns.abstractfactorypattern.shape.RoundedSquare;
import designpatterns.abstractfactorypattern.shape.Shape;
import designpatterns.abstractfactorypattern.shape.ShapeType;

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
