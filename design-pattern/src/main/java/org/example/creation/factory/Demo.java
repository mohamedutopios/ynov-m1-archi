package org.example.creation.factory;

public class Demo {

    public static void main(String[] args) {

        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory squareFactory = new SquareFactory();
        ShapeFactory circleFactory = new CircleFactory();

        Shape rectangle = rectangleFactory.createShape();

        Shape circle = circleFactory.createShape();

        Shape square = squareFactory.createShape();

        square.draw();
        rectangle.draw();
        circle.draw();

        ShapeFactorySimple shapeFactorySimple = new ShapeFactorySimple();

        Shape cirle = shapeFactorySimple.getShape("circle");

        Shape r = shapeFactorySimple.getShape("rectangle");

        Shape s = shapeFactorySimple.getShape("square");

        cirle.draw();
        r.draw();
        s.draw();

    }
}
