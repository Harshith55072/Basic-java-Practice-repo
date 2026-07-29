package org.tnsif.acc.c2tc.inheritance_multilevel;

// Multilevel inheritance: Device -> Phone -> SmartPhone (a chain of 3 levels)
class Device {
    void deviceType() {
        System.out.println("I am an electronic device");
    }
}

class Phone extends Device {
    void brand() {
        System.out.println("Brand : Samsung");
    }
}

class SmartPhone extends Phone {
    void feature() {
        System.out.println("Features: Touchscreen, Camera, Internet");
    }
}

public class MultilevelInheritanceDemo {

    public static void main(String[] args) {
        SmartPhone smart = new SmartPhone();
        smart.deviceType();
        smart.brand();
        smart.feature();
    }
}
