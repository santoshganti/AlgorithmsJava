package designpatterns.creationalpatterns.abstractfactorypattern.shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("In draw method of Square");
    }
}
