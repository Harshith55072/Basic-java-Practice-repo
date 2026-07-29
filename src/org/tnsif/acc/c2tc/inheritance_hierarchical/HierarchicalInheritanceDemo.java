package org.tnsif.acc.c2tc.inheritance_hierarchical;

// Hierarchical inheritance: multiple subclasses (Developer, Tester) share one parent (Employee)
class Employee {
    void company() {
        System.out.println("Company : TNSIF");
    }
}

class Developer extends Employee {
    void role() {
        System.out.println("Role : Software Developer");
    }
}

class Tester extends Employee {
    void role() {
        System.out.println("Role : QA Tester");
    }
}

public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.company();
        dev.role();

        Tester test = new Tester();
        test.company();
        test.role();
    }
}
