package org.example.designpattern.factorydp;

public class MyOS {

    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS os = osf.getInstance("afdasf"); // earlier we were directly creating objects here for Windows/IOS/Android, Now we have given the object creation reponsibility to OSFactory. That is Factory DP. it is like a factory who manage the creation of Objects.
        os.spec();
    }
}
