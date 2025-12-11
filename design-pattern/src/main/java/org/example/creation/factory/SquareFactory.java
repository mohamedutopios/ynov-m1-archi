package org.example.creational.factory;

public class SquareFactory extends ShapeFactory {
    @Override
    public Shape createShape() {

        return new Square();
    }
}
