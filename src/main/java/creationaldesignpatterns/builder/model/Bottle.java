package creationaldesignpatterns.builder.model;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
