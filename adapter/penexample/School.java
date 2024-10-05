package org.example.designpattern.adapter.penexample;

public class School {
    public static void main(String[] args) {
//        PilotPen pp = new PilotPen(); AssignmentWork is expecting Pen interface so we can't send Pilot pen object.
        PilotPenAdapter ppa = new PilotPenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(ppa);
        aw.writeAssignment("I am tired");
    }
}
