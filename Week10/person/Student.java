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
public class Student extends Person {

    protected String department;
    private String status;

    public Student(int age, String name, String department) {
        super(name, age);
        this.department = department;
        this.status = "S";
    }

    public String getDepartment() {
        return department;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return super.toString() + " student " + department;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student st = (Student) obj;
            //check if the name && ages are the same, parent class is already doing this
            boolean result = super.equals(st);
            return (result && this.department.equals(st.department) && this.status.equals(st.status));
        }
        return false;
    }
}
