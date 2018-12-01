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
public class PlusCollaborator {
Plus idPlus;
Collaborator idCollaborator;

    public PlusCollaborator(Plus idPlus, Collaborator idCollaborator) {
        this.idPlus = idPlus;
        this.idCollaborator = idCollaborator;
    }
  public PlusCollaborator() {
        this.idPlus = null;
        this.idCollaborator = null;
    }

    public Plus getIdPlus() {
        return idPlus;
    }

    public void setIdPlus(Plus idPlus) {
        this.idPlus = idPlus;
    }

    public Collaborator getIdCollaborator() {
        return idCollaborator;
    }

    public void setIdCollaborator(Collaborator idCollaborator) {
        this.idCollaborator = idCollaborator;
    }

}
