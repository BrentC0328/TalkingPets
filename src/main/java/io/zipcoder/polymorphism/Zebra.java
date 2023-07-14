package io.zipcoder.polymorphism;

public class Zebra extends Pet{

    public Zebra(String name) {
        super(name);
    }

    public String speak() {
        return "Neigh but in zebra accent";
    }
}
