package org.example.designpattern.adapter.shapeexample;

public class RectangleAdapter implements GeometricShape{
    Rectangle rectangle = new Rectangle();
    @Override
    public void draw() {
        rectangle.drawRectangle();
    }
}
