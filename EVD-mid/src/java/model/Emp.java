/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author User
 */
public class Emp {
    private int id;
    private String name;
    private String email;
    private double salary;
    private String joinDate;

    public Emp() {
    }

    public Emp(int id, String name, String email, double salary, String joinDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    public Emp(String name, String email, double salary, String joinDate) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.joinDate = joinDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    
    
    
    
}
