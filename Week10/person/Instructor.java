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
public class Instructor extends Person{

    private String department;

    public Instructor(int age, String name) {
        super(name, age);
    }

    //we might be calling super.toString()
    //but we want to show that protected field of parent is accessible from child.
    @Override
    public String toString() {
        return "Instructor name= " + name + " department= " + department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
