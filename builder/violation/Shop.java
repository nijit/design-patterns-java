package org.example.designpattern.builder.violation;

public class Shop {
    public static void main(String[] args) {
        Phone p = new Phone("Nokia", 23, 12.1, "red");
        System.out.println(p);
        //Problem ?
        // I need to maintain the order in the constructor always, I cannot miss any argument if I do not want to set.
        // Go for Builder design pattern.
    }
}
