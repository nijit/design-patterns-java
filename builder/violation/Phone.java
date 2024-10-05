package org.example.designpattern.builder.violation;

public class Phone {
    public String name;
    public int price;
    public double screenSize;
    public String color;

    public Phone(String name, int price, double screenSize, String color) {
        this.name = name;
        this.price = price;
        this.screenSize = screenSize;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                ", color='" + color + '\'' +
                '}';
    }
}
