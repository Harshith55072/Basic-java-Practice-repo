package org.tnsif.acc.c2tc.polymorphism;

// Demonstrates runtime polymorphism: same reference type (Payment),
// different actual objects, different behavior per makePayment() call.
public class PaymentTest {

    public static void main(String[] args) {
        Payment payment; // reference to parent class

        payment = new UpiPayment();
        payment.makePayment();

        payment = new CardPayment();
        payment.makePayment();

        payment = new WalletPayment();
        payment.makePayment();
    }
}
