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
public class GradStudent extends Student {

    private Instructor advisor;


    public GradStudent(int age, String name, String department, Instructor advisor) {
        super(age, name, department);
        this.advisor = advisor;
    }

    public void setAdvisor(Instructor advisor) {
        this.advisor = advisor;
    }

    @Override
    public String toString() {
        String res = super.toString() + " gradStudent advisor= ";
        if (advisor == null) {
            return res + " TBA";
        } else {
            return res + advisor.toString();
        }
    }

    //requires implementation of equals method in Instructor class
    //otherwise it calls Person class's equals method.
    //there is no equals method in Instructor debug to see.
    @Override
    public boolean equals(Object o) {
        if (o instanceof GradStudent) {
            GradStudent g = (GradStudent) o;
            if (super.equals(g) && this.advisor.equals(g.advisor)) {
                return true;
            }
        }
        return false;
    }
}
