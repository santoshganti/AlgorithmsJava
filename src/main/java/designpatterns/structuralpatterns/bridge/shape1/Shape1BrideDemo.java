package designpatterns.structuralpatterns.bridge.shape1;

public class Shape1BrideDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();
    }
}
