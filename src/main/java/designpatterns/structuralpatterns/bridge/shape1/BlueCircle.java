package designpatterns.structuralpatterns.bridge.shape1;

public class BlueCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("apply blue color");
    }
}
