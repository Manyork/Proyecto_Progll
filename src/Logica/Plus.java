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
public class Plus {
    private int idPlus;
    private String pTitle;
    private float percIncrement;
        
       public Plus() {
        this.idPlus = 0;
        this.pTitle = null;
        this.percIncrement = 0;
    }

    public Plus(int idPlus, String pTitle, float percIncrement) {
        this.idPlus = idPlus;
        this.pTitle = pTitle;
        this.percIncrement = percIncrement;
    }

    public int getIdPlus() {
        return idPlus;
    }

    public void setIdPlus(int idPlus) {
        this.idPlus = idPlus;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public float getPercIncrement() {
        return percIncrement;
    }

    public void setPercIncrement(float percIncrement) {
        this.percIncrement = percIncrement;
    }


    
}
