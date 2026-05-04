/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Student {

    private int id;
    private String roll;
    private String name;

    private String subject;
    private String mark;
    private String department;

    public Student() {
    }

    public Student(int id, String roll, String name, String subject, String mark, String department) {
        this.id = id;
        this.roll = roll;
        this.name = name;
        this.subject = subject;
        this.mark = mark;
        this.department = department;
    }

    public Student(String roll, String name, String subject, String mark, String department) {
        this.roll = roll;
        this.name = name;
        this.subject = subject;
        this.mark = mark;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    

}
