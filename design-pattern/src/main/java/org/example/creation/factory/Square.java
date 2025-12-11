package org.example.creation.factory;

import org.example.creation.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
