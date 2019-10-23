package creationaldesignpatterns.abstractfactorypattern.shapefactories;

import creationaldesignpatterns.abstractfactorypattern.shape.RoundedRectangle;
import creationaldesignpatterns.abstractfactorypattern.shape.RoundedSquare;
import creationaldesignpatterns.abstractfactorypattern.shape.Shape;
import creationaldesignpatterns.abstractfactorypattern.shape.ShapeType;

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
