package org.tnsif.acc.c2tc.instanceof_demo;

// instanceof used to safely downcast before calling a subclass-specific method.
class PaymentMethod {
    void makePayment() {
        System.out.println("Processing payment");
    }
}

class CreditCard extends PaymentMethod {
    void swipeCard() {
        System.out.println("Swiping credit card");
    }
}

class Paypal extends PaymentMethod {
    void loginToPaypal() {
        System.out.println("Logging into PayPal");
    }
}

public class InstanceofDemo2 {

    public static void main(String[] args) {
        PaymentMethod payment = new Paypal();

        if (payment instanceof CreditCard) {
            CreditCard cc = (CreditCard) payment;
            cc.swipeCard();
        } else if (payment instanceof Paypal) {
            Paypal pp = (Paypal) payment;
            pp.loginToPaypal();
        }
    }
}
