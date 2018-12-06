/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.Collaborator;
import Logica.Plus;
import Logica.PlusCollaborator;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manyor
 */
public class frmAsignPlusesCollaborator extends javax.swing.JInternalFrame {

    ArrayList<Plus> plusesArrayList;
    ArrayList<PlusCollaborator> PlusCollaborator;
    ArrayList<Collaborator> collaboratorArrayList;
    DefaultComboBoxModel comboBoxCollab = new DefaultComboBoxModel();
    DefaultListModel lista1 = new DefaultListModel();

    DefaultTableModel temp;

    /**
     * Creates new form frmAsignPlusesCollaborator
     */
    public frmAsignPlusesCollaborator() {
        initComponents();
    }

    public frmAsignPlusesCollaborator(frmMain aThis, ArrayList<Collaborator> collArrayList, ArrayList<Plus> plusArrayList, ArrayList<PlusCollaborator> plusesColla) {
        initComponents();
        this.collaboratorArrayList = collArrayList;
        this.plusesArrayList = plusArrayList;
        this.PlusCollaborator = plusesColla;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbCollaborators = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblasignar = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        cmbCollaborators.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCollaboratorsItemStateChanged(evt);
            }
        });

        jLabel1.setText("Select a Collaborator:");

        tblasignar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SELECT PLUS", "IDPLUS", "TITLE", "%INCREMET"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblasignar);
        if (tblasignar.getColumnModel().getColumnCount() > 0) {
            tblasignar.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton5.setText("Add Plus");

        jButton6.setText("Remove Plus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCollaborators, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCollaborators, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        cmbFillPos();
    }//GEN-LAST:event_formInternalFrameActivated

    private void cmbCollaboratorsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCollaboratorsItemStateChanged
        // TODO add your handling code here:
        cmbFillTable(Integer.parseInt(cmbCollaborators.getSelectedItem().toString()));
        
    }//GEN-LAST:event_cmbCollaboratorsItemStateChanged
    private void cmbFillPos() {
        comboBoxCollab.addElement("Please, select an option...");
        for (int i = 0; i < collaboratorArrayList.size(); i++) {
            comboBoxCollab.addElement(collaboratorArrayList.get(i).getDNI());
        }
        cmbCollaborators.setModel(comboBoxCollab);
    }

    private void cmbFillTable(int DNI) {
        boolean rpt;
        temp = (DefaultTableModel) tblasignar.getModel();
        for (int i = 0; i < plusesArrayList.size(); i++) {
           rpt= isAssginned(DNI, plusesArrayList.get(i).getIdPlus());
          temp.addRow(new Object[]{rpt, plusesArrayList.get(i).getIdPlus(), plusesArrayList.get(i).getpTitle(), plusesArrayList.get(i).getPercIncrement()});
        }
        tblasignar.setModel(temp);
    }

    private boolean isAssginned(int dni, int idPlus) {

        for (int i = 0; i < PlusCollaborator.size(); i++) {
            if (Integer.parseInt(PlusCollaborator.get(i).getIdCollaborator().toString()) == dni && Integer.parseInt(PlusCollaborator.get(i).getIdPlus().toString()) == idPlus) {
            return true;
            }
           
        }

        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCollaborators;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblasignar;
    // End of variables declaration//GEN-END:variables
}
