package org.example.designpattern.factorydp;

public class Windows implements OS{

    @Override
    public void spec() {
        System.out.println("I am Windows.");
    }
}
