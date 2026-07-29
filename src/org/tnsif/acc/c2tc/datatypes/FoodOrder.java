package org.tnsif.acc.c2tc.datatypes;

public class FoodOrder {

    public static void main(String[] args) {

        // Primitive datatypes
        int orderId = 101;
        double price = 299.99;
        boolean isDelivered = false;
        char rating = 'A';
        float deliveryDistance = 5.3f;
        long deliveryBoyPhone = 9835365252L;
        byte deliverTime = 45;
        short restaurantId = 12;

        // Non-primitive datatypes
        String customerName = "Anjali"; // fixed typo (was "Anajli")
        String[] foodItems = {"Burger", "Fries", "Coke"};

        System.out.println("Order Summary");
        System.out.println("Customer Name :" + customerName);
        System.out.println("Order Id :" + orderId);
        System.out.println("Restaurant ID :" + restaurantId);
        System.out.println("Delivery Boy Contact :" + deliveryBoyPhone);
        System.out.println("Food items :");
        for (String item : foodItems) {
            System.out.println(" - " + item);
        }

        System.out.println("Total Price :" + price);
        System.out.println("Delivery Distance :" + deliveryDistance);
        System.out.println("Expected Time :" + deliverTime); // fixed typo (was "Expcted")
        System.out.println("Delivery status :" + isDelivered);
        System.out.println("Rating :" + rating);
    }
}
