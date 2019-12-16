package designpatterns.creationaldesignpatterns.builder.model;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
