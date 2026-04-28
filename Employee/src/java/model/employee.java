/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class employee {
    private int id;
    private String name;
    private String mobile;
    private double salary;

    public employee() {
    }

    public employee(int id, String name, String mobile, double salary) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.salary = salary;
    }

    public employee(String name, String mobile, double salary) {
        this.name = name;
        this.mobile = mobile;
        this.salary = salary;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    
}
