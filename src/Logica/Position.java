/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Manyor
 */
public class Position {

    private int idPosition;
    private String pName;
    private double salary;

    public Position() {
        this.idPosition = 0;
        this.pName = "";
        this.salary = 0;
    }

    public Position(int idPosition, String pName, double salary) {
        this.idPosition = idPosition;
        this.pName = pName;
        this.salary = salary;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
}
