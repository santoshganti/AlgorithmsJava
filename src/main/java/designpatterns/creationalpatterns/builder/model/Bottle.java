package designpatterns.creationalpatterns.builder.model;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
