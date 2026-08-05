package org.tnsif.acc.c2tc.instanceof_demo;

// instanceof: checking an object's type at runtime, including up the
// inheritance chain (Manager is-an Employee is-a Person5).
class Person5 {
}

class Employee extends Person5 {
}

class Manager extends Employee {
}

public class InstanceofDemo1 {

    public static void main(String[] args) {
        Person5 person = new Person5();
        Employee emp = new Employee();
        Manager manager = new Manager();

        System.out.println(emp instanceof Employee);   // true
        System.out.println(emp instanceof Person5);     // true
        System.out.println(emp instanceof Manager);      // false
        System.out.println(manager instanceof Manager);  // true
        System.out.println(manager instanceof Employee); // true
        System.out.println(manager instanceof Person5);  // true
        System.out.println(person instanceof Person5);   // true
        System.out.println(person instanceof Manager);   // false
    }
}
