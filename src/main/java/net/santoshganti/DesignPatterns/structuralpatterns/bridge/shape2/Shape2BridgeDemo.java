package net.santoshganti.DesignPatterns.structuralpatterns.bridge.shape2;

public class Shape2BridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red = new Red();
        Shape circle = new Circle(red);

        Shape greenCirlce = new Circle(new Green());

        square.applyColor();
        circle.applyColor();
        greenCirlce.applyColor();
    }
}
