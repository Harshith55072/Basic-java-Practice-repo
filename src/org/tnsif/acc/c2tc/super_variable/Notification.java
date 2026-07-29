package org.tnsif.acc.c2tc.super_variable;

// Demonstrates super.variable to access the parent's field when the
// child class has its own field with the same name (variable hiding).
class Notification {
    String message = "Default Notification";
}

class PushNotification extends Notification {
    String message = "Push Notification";

    void showNotification() {
        System.out.println("Child message : " + message);
        System.out.println("Parent message : " + super.message);
    }
}
