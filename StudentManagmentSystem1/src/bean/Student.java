/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Hp
 */
public class Student extends Person {

    private String schoolName;
    private double scholarship;
   // Student[] students;

   /* public Student[] getStudent() {
        return students;
    }

    public void setStudent(Student[] student) {
        this.students = student;
    }
*/
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    

}
