package org.example.designpattern.singleton;

public class DemoEnumSingleton {
    public static void main(String[] args) {
        Abc obj1 = Abc.INSTANCE;
        obj1.i = 10;
        obj1.show();

        Abc obj2 = Abc.INSTANCE;
        obj2.i = 100;
        obj2.show();

        //when you work with deserialization readObject will give you new Object even if it is a single ton class, so go for enum. enum supports in java version 1.5 +

        System.out.println(System.identityHashCode(obj1)+" "+System.identityHashCode(obj2));

    }
}

enum Abc{ //special type of class
    INSTANCE;
    public int i;
    public void show(){
        System.out.println(i);
    }
}
