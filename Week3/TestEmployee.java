package com.company;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 1000);
        Employee e2 = new Employee("Micheal", 2000);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("-----------------");
        Employee.raiseRate = 0.12;//We can change static variable's value by calling the Class name itself.
        e1.raiseSalary();
        e2.raiseSalary();
        System.out.println("Bigger salary: " + e1.compareSalary(e2).getSalary());
        e1.raiseSalary();
        e2.raiseSalary();
        System.out.println("Bigger salary: " + e1.compareSalary(e2).getSalary());
        System.out.println("-----------------");
        e1 = e2;
        System.out.println("e1's salary: "+e1);
        System.out.println("e2's salary: "+e2);
    }
}