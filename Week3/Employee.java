package com.company;

import java.util.Date;

public class Employee {

    private int eNumber = 1000;
    private String name;
    private double salary;
    private Date lastRaiseDate;
    private static int count;
    public static double raiseRate = 0;//"by a certain percentage". You need to define a variable that belongs to the Employee class.
    //Because the value should be the same for all employee objects.

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.lastRaiseDate = null;//We don't knw this, we will automatically create this.
        this.eNumber += this.count; //eNumber = eNumber+count;
        this.count++;
    }

    public double raiseSalary() {
        if (lastRaiseDate == null) {
            salary = salary + (salary * raiseRate);
            lastRaiseDate = new Date();
        } else {
            int diffInDays = (int) (new Date().getTime() - lastRaiseDate.getTime()) / (1000 * 60 * 60 * 24);//
            //getTime() returns in milliseconds and we need to change it to days after we get the difference.
            //We divide the difference by (1000*60*60*24) to have the difference in days.
            int diffInMonths = diffInDays / 30;
            if (diffInMonths >= 12) {
                salary = salary + (salary * raiseRate);
                lastRaiseDate = new Date(); //We reset lastRaiseDate after the raise.
            }
        }
        return salary;
    }


    //We return the employee who has higher salary.
    public Employee compareSalary(Employee e) {
        if (this.salary >= e.salary) {
            return this;
        }
        return e;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eNumber=" + eNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", lastRaiseDate=" + lastRaiseDate +
                '}';
    }
}