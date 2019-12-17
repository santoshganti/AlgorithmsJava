package designpatterns.creationalpatterns.builder.model;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
