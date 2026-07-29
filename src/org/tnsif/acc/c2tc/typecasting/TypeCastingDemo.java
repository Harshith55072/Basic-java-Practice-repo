package org.tnsif.acc.c2tc.typecasting;

public class TypeCastingDemo {

    public static void main(String[] args) {
        // Shopping cart example

        // Widening (small -> large): int * double = double, done automatically
        int quantity = 3;
        double pricePerItem = 99.50;
        double totalPrice = quantity * pricePerItem;

        // Narrowing (large -> small): needs an explicit cast, may lose precision
        double discount = 10.75;
        int roundedDiscount = (int) discount;

        double finalAmount = totalPrice - roundedDiscount;

        System.out.println("Online Shopping Summary");
        System.out.println("Items Bought :" + quantity);
        System.out.println("Price per item :" + pricePerItem);
        System.out.println("Final Amount to pay after discount :" + finalAmount);
    }
}
