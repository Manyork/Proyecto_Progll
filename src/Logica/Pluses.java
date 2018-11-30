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
public class Pluses {
    private int idPlus;
    private String pTitulo;
    private float porcIncremento;
        
       public Pluses() {
        this.idPlus = 0;
        this.pTitulo = null;
        this.porcIncremento = 0;
    }

    public Pluses(int idPlus, String pTitulo, float porcIncremento) {
        this.idPlus = idPlus;
        this.pTitulo = pTitulo;
        this.porcIncremento = porcIncremento;
    }

    public int getIdPlus() {
        return idPlus;
    }

    public void setIdPlus(int idPlus) {
        this.idPlus = idPlus;
    }

    public String getpTitulo() {
        return pTitulo;
    }

    public void setpTitulo(String pTitulo) {
        this.pTitulo = pTitulo;
    }

    public float getPorcIncremento() {
        return porcIncremento;
    }

    public void setPorcIncremento(float porcIncremento) {
        this.porcIncremento = porcIncremento;
    }

    
}
