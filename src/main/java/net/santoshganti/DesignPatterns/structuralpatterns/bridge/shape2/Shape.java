package net.santoshganti.DesignPatterns.structuralpatterns.bridge.shape2;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
