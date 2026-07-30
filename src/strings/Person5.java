

class Person5
{

}
class Employee extends Person5
{

}
class Manager extends Employee
{

}
 class InstanceOfDemo1 {
    public static void main(String[] args) {
        Person5 person=new Person5();
        Employee emp=new Employee();
        Manager manager=new Manager();
        System.out.println(emp instanceof Employee);//t
        System.out.println(emp instanceof Person5);//t
        System.out.println(emp instanceof Manager);//f
        System.out.println(manager instanceof Manager);//t
        System.out.println(manager instanceof Employee);//t
        System.out.println(manager instanceof Person5);//t
        System.out.println(person instanceof Person5);//t
        System.out.println(person instanceof Manager);//f
    }

}