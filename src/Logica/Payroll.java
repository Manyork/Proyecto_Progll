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
public class Payroll {

    private int idPayroll;
    private Date creatrionDate;
    private String month;
    private Date payDate;
    Collaborator idCollaborator;
    Position salary;
    private float totalPlus;
    private float totalSalary;
    private float deductionsCCSS;
    private float deductionsBP;
    private float netSalary;

    public Payroll(int idPayroll, Date creatrionDate, String month, Date payDate, Collaborator idCollaborator, Position salary, float totalPlus, float totalSalary, float deductionsCCSS, float deductionsBP, float netSalary) {
        this.idPayroll = idPayroll;
        this.creatrionDate = creatrionDate;
        this.month = month;
        this.payDate = payDate;
        this.idCollaborator = idCollaborator;
        this.salary = salary;
        this.totalPlus = totalPlus;
        this.totalSalary = totalSalary;
        this.deductionsCCSS = deductionsCCSS;
        this.deductionsBP = deductionsBP;
        this.netSalary = netSalary;
    }

    public Payroll() {
        this.idPayroll = 0;
        this.creatrionDate = null;
        this.month = null;
        this.payDate = null;
        this.idCollaborator = null;
        this.salary = null;
        this.totalPlus = 0;
        this.totalSalary = 0;
        this.deductionsCCSS = 0;
        this.deductionsBP = 0;
        this.netSalary = 0;
    }

    public int getIdPayroll() {
        return idPayroll;
    }

    public void setIdPayroll(int idPayroll) {
        this.idPayroll = idPayroll;
    }

    public Date getCreatrionDate() {
        return creatrionDate;
    }

    public void setCreatrionDate(Date creatrionDate) {
        this.creatrionDate = creatrionDate;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Collaborator getIdCollaborator() {
        return idCollaborator;
    }

    public void setIdCollaborator(Collaborator idCollaborator) {
        this.idCollaborator = idCollaborator;
    }

    public Position getSalary() {
        return salary;
    }

    public void setSalary(Position salary) {
        this.salary = salary;
    }

    public float getTotalPlus() {
        return totalPlus;
    }

    public void setTotalPlus(float totalPlus) {
        this.totalPlus = totalPlus;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public float getDeductionsCCSS() {
        return deductionsCCSS;
    }

    public void setDeductionsCCSS(float deductionsCCSS) {
        this.deductionsCCSS = deductionsCCSS;
    }

    public float getDeductionsBP() {
        return deductionsBP;
    }

    public void setDeductionsBP(float deductionsBP) {
        this.deductionsBP = deductionsBP;
    }

    public float getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(float netSalary) {
        this.netSalary = netSalary;
    }

}
