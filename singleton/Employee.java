package org.example.designpattern.singleton;

public class Employee {

//    private static Employee emp = new Employee(); //Eager creation of object
    private static Employee emp;
    private Employee(){
        System.out.println("Employee Constructor, instance created!");
    }

    public static Employee getInstance(){ //Adding synchronized here will solve the multithreading problem, but huge performance issue.
//        emp = new Employee(); if we write like this instance will create again and again , it won't be singleton. So add an if check.
        if(emp==null){ // you can test by commenting this if statement.
            emp = new Employee(); // This is lazy instantiation of object.
        }
        return emp;
    }

    //we can avoid synchronized using double-checked locking

    public static Employee getInstanceDoubleCheckedLocking(){
        if(emp==null){
            synchronized (Employee.class){
                if(emp==null){
                    emp = new Employee();
                }
            }
        }
        return emp;
    }

}
