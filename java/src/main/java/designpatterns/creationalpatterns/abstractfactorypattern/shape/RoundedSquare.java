package designpatterns.creationalpatterns.abstractfactorypattern.shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rounded square draw() method");
    }
}
