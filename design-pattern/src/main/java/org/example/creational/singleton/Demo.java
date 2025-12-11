package org.example.creational.singleton;

public class Demo {

    public static void main(String[] args) {
        OrderManagementService[] instances = new OrderManagementService[10];

        for (int i = 0; i < 10; i++) {
            instances[i] = OrderManagementService.getInstance();
            System.out.println("Instance " + i + " : " + instances[i]);
        }

        boolean sameInstance = true;
        for (int i = 1; i < instances.length; i++) {
            if (instances[i] != instances[0]) {
                sameInstance = false;
                break;
            }
        }

        System.out.println("\nToutes les instances sont identiques ? " + sameInstance);
    }



}
