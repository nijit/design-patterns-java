package org.example.functionalinterfacelambda;

public class DemoFIandLambda {
    public static void main(String[] args) {

        /*An anonymous class in Java is a class without a name that is used to create an instance of an object with certain modifications on the fly. These classes are usually used when you need to extend a class or implement an interface just once, without formally declaring a separate named class. Anonymous classes are defined and instantiated in a single expression using the new keyword.

                Key Characteristics of Anonymous Classes:
        They cannot have a constructor because they do not have a name.
        They are typically used when you want to override methods of a class or interface.*/

//        FunctionalInterfaceDemo f = new FunctionalInterfaceDemo() {
//            public void show() {
//                System.out.println("show");
//            }
//        }; Anonymous Class

//        FunctionalInterfaceDemo f = () -> {
//                System.out.println("show");
//            }
//        ;

        FunctionalInterfaceDemo f = () -> System.out.println("show");
        f.show();

        WithInputFI f2 = input -> System.out.println("showing with : "+ input);
        f2.showWithInput("nijit");

        WithReturn wr = (i,j) -> i+j;
        System.out.println(wr.sum(1,3));
    }
}
