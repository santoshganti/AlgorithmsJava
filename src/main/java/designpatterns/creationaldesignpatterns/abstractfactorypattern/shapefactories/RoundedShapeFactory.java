package designpatterns.creationaldesignpatterns.abstractfactorypattern.shapefactories;

import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.RoundedRectangle;
import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.RoundedSquare;
import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.Shape;
import designpatterns.creationaldesignpatterns.abstractfactorypattern.shape.ShapeType;

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
