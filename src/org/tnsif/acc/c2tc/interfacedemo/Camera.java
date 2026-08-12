package org.tnsif.acc.c2tc.interfacedemo;

public interface Camera {
    public default void takePhoto() {
        System.out.println("Taking photo");
    }
}
