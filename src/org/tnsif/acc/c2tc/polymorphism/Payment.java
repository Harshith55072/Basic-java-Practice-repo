package org.tnsif.acc.c2tc.polymorphism;

// Base class with a method that subclasses override (runtime polymorphism)
class Payment {
    void makePayment() {
        System.out.println("Processing payment using generic method");
    }
}

class UpiPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment is done using UPI");
    }
}

class CardPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment made using credit/debit card");
    }
}

class WalletPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment is done via Wallet");
    }
}
