package designpatterns.structuralpatterns.bridge.shape1;

public class RedSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("apply red color");
    }
}
