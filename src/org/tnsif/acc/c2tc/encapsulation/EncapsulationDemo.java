package org.tnsif.acc.c2tc.encapsulation;

// Encapsulation: private fields, accessed only via public getters/setters
class Human {
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
}

public class EncapsulationDemo {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(26);
        obj.setName("Neha");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        obj.setAge(22);
        obj.setName("Sindhu");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
