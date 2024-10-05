package org.example.designpattern.factorydp;

public class OSFactory {
    public OS getInstance(String flag){
        if(flag.equalsIgnoreCase("Win")) return new Windows();
        else if (flag.equalsIgnoreCase("Apple")) return new IOS();
        else return new Android();
    }
}
