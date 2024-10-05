package org.example.designpattern.singleton;

public class Demo {
    public static void main(String[] args) {

//        Employee emp1 = Employee.getInstance();
//        Employee emp2 = Employee.getInstance();
//        System.out.println(emp1 +  "  " + emp2);
        //Above will be having problem with multiple threads.

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Employee emp1 = Employee.getInstanceDoubleCheckedLocking(); //getInstance() method will create problem.
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Employee emp2 = Employee.getInstanceDoubleCheckedLocking();
            }
        });
        t1.start();
        t2.start();


        //Problem: create multiple object.
//        EmployeeNormal en1 = new EmployeeNormal();
//        EmployeeNormal en2 = new EmployeeNormal();
//        System.out.println(en1 + "  " + en2);
    }
}
