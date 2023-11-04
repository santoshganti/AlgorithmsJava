package net.santoshganti.DesignPatterns.creationalpatterns.builder.model;

public interface Item {
    String name();

    Packing packing();

    float price();
}
