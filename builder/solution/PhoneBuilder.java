package org.example.designpattern.builder.solution;

public class PhoneBuilder {

    public String name;
    public int price;
    public double screenSize;
    public String color;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Phone getPhone(){
        return new Phone(name, price, screenSize, color);
    }

}
