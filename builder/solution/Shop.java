package org.example.designpattern.builder.solution;


public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setColor("Green").setName("Nokia").getPhone();
        System.out.println(p);
        //Now i don't need to depend on the order of the variable, I need to care about the argument which I don't use.
    }
}
