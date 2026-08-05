package org.tnsif.acc.interviewquestions.patterns;

/**
 * Program 6: Implement the Singleton design pattern.
 *
 * Ensures only ONE instance of a class ever exists, with a global
 * access point (getInstance()).
 *
 * Approach used here: thread-safe lazy initialization using
 * double-checked locking (efficient + safe in multi-threaded code).
 */
public class Singleton {

    // volatile ensures visibility of changes across threads
    private static volatile Singleton instance;

    private int value; // just some example state

    // Private constructor prevents external instantiation
    private Singleton() {
        value = 0;
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        if (instance == null) {                 // first check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) {          // second check (with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setValue(10);

        Singleton s2 = Singleton.getInstance(); // returns the SAME instance
        System.out.println("s2 value: " + s2.getValue()); // prints 10

        System.out.println("s1 == s2 : " + (s1 == s2)); // true, same object
    }
}
