package creationaldesignpatterns.factoryPatternShapes.shapes;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle draw method");
    }
}