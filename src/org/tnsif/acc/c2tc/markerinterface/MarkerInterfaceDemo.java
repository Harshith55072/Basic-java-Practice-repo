package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        Registerable s = new Student(12, "Sushma", 20000, "Java Programming");
        Registerable s1 = new Student(13, "Anil", 30000, "Java Programming");

        
        if (s instanceof Registerable) {
            System.out.println("Student is registered for this course");
        } else {
            System.out.println("Student is not registered for this course");
        }

        if (s1 instanceof Registerable) {
            System.out.println("Student is registered for this course");
        } else {
            System.out.println("Student is not registered for this course");
        }
    }
}
