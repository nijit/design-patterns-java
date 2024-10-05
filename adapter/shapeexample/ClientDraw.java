package org.example.designpattern.adapter.shapeexample;

public class ClientDraw {
    public static void main(String[] args) {
        GeometricShape gs = new RectangleAdapter();
        gs.draw();
    }
}
