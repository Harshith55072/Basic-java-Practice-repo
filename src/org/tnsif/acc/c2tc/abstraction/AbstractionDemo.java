package org.tnsif.acc.c2tc.abstraction;

// Demonstrates abstraction through a multi-level abstract class chain.
// (Renamed from placeholder names MaheshDemo/Suresh/Ramesh to names that
// actually describe what each class represents.)
public class AbstractionDemo {

    public static void main(String[] args) {
        SmartPhoneBase obj = new NextGenSmartPhone();
        obj.calling();
        obj.aiIntegration();
        obj.healthMonitoring();
        obj.satelliteComm();
    }
}

abstract class SmartPhoneBase {
    void calling() {
        System.out.println("Phone is having calling feature");
    }

    abstract void aiIntegration();

    abstract void satelliteComm();

    abstract void healthMonitoring();
}

abstract class AdvancedSmartPhone extends SmartPhoneBase {
    @Override
    void aiIntegration() {
        System.out.println("Phone is integrated with AI Integration");
    }

    @Override
    abstract void satelliteComm();

    @Override
    abstract void healthMonitoring();
}

class NextGenSmartPhone extends AdvancedSmartPhone {
    @Override
    void satelliteComm() {
        System.out.println("Phone is integrated with Satellite Communication");
    }

    @Override
    void healthMonitoring() {
        System.out.println("Phone is integrated with Health Monitoring");
    }
}
