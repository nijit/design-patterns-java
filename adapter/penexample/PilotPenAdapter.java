package org.example.designpattern.adapter.penexample;

public class PilotPenAdapter implements Pen{
    PilotPen pp = new PilotPen();
    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
