package org.tnsif.acc.c2tc.methodoverriding_super;

// Demonstrates using super.method() to call the parent's overridden version
// alongside the child's own version.
class PaymentGateway {
    void process() {
        System.out.println("Processing payment using standard gateway");
    }
}

class Gpay extends PaymentGateway {
    @Override
    void process() {
        System.out.println("Processing payment via Google Pay");
    }

    void completeTransaction() {
        super.process(); // calls PaymentGateway's version
        process();       // calls Gpay's own overridden version
    }
}
