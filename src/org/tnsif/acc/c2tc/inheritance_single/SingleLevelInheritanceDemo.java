package org.tnsif.acc.c2tc.inheritance_single;

// Single-level inheritance: one parent (Course), one child (Student)
class Course {
    String courseName = "Java Programming"; // fixed typo (was "Programmming")

    void showCourse() {
        System.out.println("Course :" + courseName);
    }
}

class Student extends Course {
    String name = "Ali";

    void showStudent() {
        System.out.println("Student : " + name);
    }
}

public class SingleLevelInheritanceDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.showCourse();
        student.showStudent();
    }
}
