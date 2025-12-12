package org.example.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", avec du lait ";
    }

}
