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
public class Puestos {
    private int idPuesto;
    private String pNombre;
    private double salario;
       public Puestos() {
        this.idPuesto = 0;
        this.pNombre = "";
        this.salario = 0;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

    public Puestos(int idPuesto, String pNombre, double salario) {
        this.idPuesto = idPuesto;
        this.pNombre = pNombre;
        this.salario = salario;
    }
    
    
}
