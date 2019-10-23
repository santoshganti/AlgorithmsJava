package creationaldesignpatterns.builder.model;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
