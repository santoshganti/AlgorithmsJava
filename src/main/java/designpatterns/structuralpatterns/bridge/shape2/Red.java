package designpatterns.structuralpatterns.bridge.shape2;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Red color");
    }
}
