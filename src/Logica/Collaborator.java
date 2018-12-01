/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author Manyor
 */
public class Collaborator {
    private int DNI;
    private String name;
    private Date birthDate;
    private Date startDate;
     private Date endDate;
     private String direction;
     private int phoneNumbre;
     private String email;
     Position position;
     private int bossDNI;
     
     
    public Collaborator(int DNI, String name, Date birthDate, Date startDate, Date endDate, String direction, int phoneNumbre, String email, Position position, int bossDNI) {
        this.DNI = DNI;
        this.name = name;
        this.birthDate = birthDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.direction = direction;
        this.phoneNumbre = phoneNumbre;
        this.email = email;
        this.position = position;
        this.bossDNI = bossDNI;
    }

    public Collaborator() {
        this.DNI = 0;
        this.name = null;
        this.birthDate = null;
        this.startDate = null;
        this.endDate = null;
        this.direction = null;
        this.phoneNumbre = 0;
        this.email = null;
        this.position = null;
        this.bossDNI = 0;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getPhoneNumbre() {
        return phoneNumbre;
    }

    public void setPhoneNumbre(int phoneNumbre) {
        this.phoneNumbre = phoneNumbre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getBossDNI() {
        return bossDNI;
    }

    public void setBossDNI(int bossDNI) {
        this.bossDNI = bossDNI;
    }
    
    
}
