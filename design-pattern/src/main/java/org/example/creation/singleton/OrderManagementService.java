package org.example.creational.singleton;
public class OrderManagementService {

    private static OrderManagementService orderManagementService;

    private OrderManagementService(){}

    public static OrderManagementService getInstance() {

        if(orderManagementService == null) {
            orderManagementService = new OrderManagementService();
        }
        return orderManagementService;
    }

    public void displayOrder() {
        System.out.println("Order Management Service");
    }

    @Override
    public String toString() {
        return "Instance hash: " + this.hashCode();
    }

}
