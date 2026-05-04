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
    private String email;
    private String mobile;
    private double salary;
    private String desig;

    public employee() {
    }

    public employee(int id, String name, String email, String mobile, double salary, String desig) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
        this.desig = desig;
    }

    public employee(String name, String email, String mobile, double salary, String desig) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
        this.desig = desig;
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

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }
    
    

    
}
