package org.Lesson303_9.EncapsulationAndInheritance;

public class Student {

    private int studentID;
    private String firstName;
    private String lastName;
    private String studentEmail;
    private String studentPhone;

    public Student(){
        studentID = 0;
        firstName = "";
        lastName = "";
        studentEmail = "";
        studentPhone = "";
    }

    public Student (int studentID,
                    String firstName,
                    String lastName,
                    String studentEmail,
                    String studentPhone){
    this.studentID = studentID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentEmail = studentEmail;
    this.studentPhone = studentPhone;
    }

    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
            this.studentID += studentID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }
    public String getStudentPhone() {
        return studentPhone;
    }
}


