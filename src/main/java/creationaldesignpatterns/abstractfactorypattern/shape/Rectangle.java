package creationaldesignpatterns.abstractfactorypattern.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("In Rectangle draw method");
    }
}
