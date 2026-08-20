package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Cherry");
        set.add("Banana");
        set.add("Apple");
        // set.add(null); // TreeSet does NOT allow null - throws NullPointerException
        //                // (it needs to compare elements to keep them sorted)
        System.out.println("TreeSet " + set);
    }
}
