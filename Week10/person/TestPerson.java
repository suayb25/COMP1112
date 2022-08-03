/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author talha
 */
public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Ali", 17);
        Student s1 = new Student(17, "Ali", "CS");
        Instructor i1 = new Instructor(45, "Ahmet");
        GradStudent s2 = new GradStudent(17, "Ali", "CS", i1);

        //why the following is not correct?
        //i1.setDepartment("CS");
        //to reach the setDepartment method, we must obtain a new, instructor object
        ((Instructor) i1).setDepartment("CS");

        Instructor i2 = new Instructor(45, "Ahmet");
        i2.setDepartment("EE");

        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString()); // see that, all outputs including this, runs Person's toString method super.toString()
        System.out.println(i1.toString());

        //lets compare two person, well we have one person, one student with the same and age, lets compare them
        System.out.println("p1==s1 " + p1.equals(s1)); //discuss the result

        System.out.println("s1==s2 " + s1.equals(s2)); //discuss the result
        //we have two student instances, lets compare them
        System.out.println("s2==s1 " + s2.equals(s1));//discuss the result
        System.out.println("s1==s2 " + s1.equals(s2));//discuss the result
        ((GradStudent) s2).setAdvisor((Instructor) i1);

    }
}
