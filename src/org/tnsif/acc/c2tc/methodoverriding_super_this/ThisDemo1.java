package org.tnsif.acc.c2tc.methodoverriding_super_this;

public class ThisDemo1 {

    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Hema");
        person.setAge(26);
        // Fixed: getName()/getAge() results were being discarded before (no-op).
        // displayDetails() already prints both, so we just call that.
        person.displayDetails();

        person.setName("Tejas");
        person.setAge(24);
        person.displayDetails();
    }
}
