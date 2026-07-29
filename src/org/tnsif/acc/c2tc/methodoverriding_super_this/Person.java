package org.tnsif.acc.c2tc.methodoverriding_super_this;

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    void displayDetails() {
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }
}
