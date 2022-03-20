package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TestEmployee2 {

    public static ArrayList<Employee> arrOfEmployee;
    public static int numberOfEmployees;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many employees there are: ");
        arrOfEmployee = new ArrayList<>();
        numberOfEmployees = input.nextInt();
        fillEmployeeArray();
        double monthlyPayment = calculateMonthlyPayment();
        System.out.println("Total cost for employees: " + monthlyPayment);

    }

    public static void fillEmployeeArray() {
        Random rnd = new Random();
        for (int i = 0; i < numberOfEmployees; i++) {
            Employee e = new Employee("E" + i, 10000 + (rnd.nextDouble() * 500));//+ 0-500
            System.out.println((i + 1) + ". employees salary is : " + e.getSalary());
            arrOfEmployee.add(e);
        }
    }

    public static double calculateMonthlyPayment() {
        double totalCost = 0;
        for (int i = 0; i < arrOfEmployee.size(); i++) {
            totalCost += arrOfEmployee.get(i).getSalary();
        }
        return totalCost;
    }

}