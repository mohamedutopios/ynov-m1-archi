package org.example.structural.decorator;

public class Client {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getDescription() + " cost : " + coffee.getCost());


        Coffee coffeemilk = new MilkDecorator(coffee);
        System.out.println(coffeemilk.getDescription() + " cost : " + coffeemilk.getCost());


        Coffee coffeeSugarMilk = new SugarDecorator(coffeemilk);
        System.out.println(coffeeSugarMilk.getDescription() + " cost : " + coffeeSugarMilk.getCost());


        Coffee coffeeSugar = new SugarDecorator(coffee);
        System.out.println(coffeeSugar.getDescription() + " cost : " + coffeeSugar.getCost());

    }


}
