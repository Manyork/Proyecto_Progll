/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.Plus;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manyor
 */
public class frmPlusesManager extends javax.swing.JInternalFrame {

    ArrayList<Plus> plusesArrayList;
    DefaultTableModel modelList = new DefaultTableModel();
    String titulos[] = {"ID", "Title", "Percent"};
    Plus plusObj = new Plus();

    /**
     * Creates new form frmGestionPluses
     */
    public frmPlusesManager() {
        initComponents();
    }

    public frmPlusesManager(frmMain aThis, ArrayList<Plus> arrayList) {
        initComponents();
        this.plusesArrayList = arrayList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPluses = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }};
            jPanel1 = new javax.swing.JPanel();
            btnAdd = new javax.swing.JButton();
            btnUpdate = new javax.swing.JButton();
            btnDelete = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();
            txtTitle = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            txtId = new javax.swing.JTextField();
            txtPercent = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();

            setClosable(true);
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

            tblPluses.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            tblPluses.setGridColor(new java.awt.Color(255, 255, 255));
            tblPluses.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tblPlusesMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(tblPluses);

            jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            btnAdd.setText("Add");
            btnAdd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAddActionPerformed(evt);
                }
            });

            btnUpdate.setText("Update");
            btnUpdate.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnUpdateActionPerformed(evt);
                }
            });

            btnDelete.setText("Delete");
            btnDelete.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnDeleteActionPerformed(evt);
                }
            });

            jLabel1.setText("Id:");

            jLabel2.setText("Title:");

            txtId.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtIdActionPerformed(evt);
                }
            });

            txtPercent.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtPercentActionPerformed(evt);
                }
            });

            jLabel3.setText("%:");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnUpdate)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnDelete)
                    .addGap(24, 24, 24))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addContainerGap(24, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (txtId.isEnabled()) {
            if (!txtId.getText().isEmpty() && !txtTitle.getText().isEmpty() && !txtPercent.getText().isEmpty()) {
                plusObj = new Plus(Integer.parseInt(txtId.getText()), txtTitle.getText(), Float.parseFloat(txtPercent.getText()));
                if (!alreadyExist(Integer.parseInt(txtId.getText()))) {
                    if (plusesArrayList.add(plusObj)) {
                        cleanFields();
                        fillTable();
                        JOptionPane.showConfirmDialog(null, "Register added succesfully", "Confirm Message", JOptionPane.DEFAULT_OPTION);

                    } else {
                        JOptionPane.showConfirmDialog(null, "Register process failed, Please try again", "Confirm Message", JOptionPane.DEFAULT_OPTION);
                    }

                } else {
                    JOptionPane.showConfirmDialog(null, "This plus already exist", "Confirm Message", JOptionPane.DEFAULT_OPTION);

                }
            } else {

                JOptionPane.showConfirmDialog(null, "Please, complete required information", "Confirm Message", JOptionPane.DEFAULT_OPTION);
            }
        } else {

            JOptionPane.showConfirmDialog(null, "Please, finish edition Process", "Confirm Message", JOptionPane.DEFAULT_OPTION);

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //TODO add your handling code here:
        txtId.setEnabled(true);
        if (!txtId.getText().isEmpty() && !txtTitle.getText().isEmpty() && !txtPercent.getText().isEmpty()) {
            plusObj = new Plus(Integer.parseInt(txtId.getText()), txtTitle.getText(), Float.parseFloat(txtPercent.getText()));

            try {
                plusesArrayList.set(tblPluses.getSelectedRow(), plusObj);
                cleanFields();
                JOptionPane.showConfirmDialog(null, "Register modified succesfully", "Confirm Message", JOptionPane.DEFAULT_OPTION);

                fillTable();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Modify process failed, Please try again", "Confirm Message", JOptionPane.DEFAULT_OPTION);

            }

        } else {

            JOptionPane.showConfirmDialog(null, "Please, complete required information", "Confirm Message", JOptionPane.DEFAULT_OPTION);
        }


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtId.isEnabled()) {
            int a = tblPluses.getSelectedRow();

            if (a < 0) {

                JOptionPane.showMessageDialog(null,
                        "You must select a row");
            } else {

                int confirmar = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to delete this register?");

                if (JOptionPane.OK_OPTION == confirmar) {
                    try {
                        plusesArrayList.remove(a);
                        modelList.removeRow(a);
                        JOptionPane.showMessageDialog(null,
                                "Register deleted");
                        if (plusesArrayList.size() > 1) {
                            fillTable();

                        }
                    } catch (Exception e) {
                    }

                }
            }
        } else {

            JOptionPane.showConfirmDialog(this, "Please, finish edition Process", "Confirm Message", JOptionPane.DEFAULT_OPTION);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPercentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPercentActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        if (plusesArrayList.size() > 0) {
            fillTable();
        }
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblPlusesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlusesMouseClicked
        // TODO add your handling code here:
        if (tblPluses.getSelectedRow() >= 0) {
            if (evt.getClickCount() == 2) {
                txtId.setEnabled(false);
                txtId.setText(String.valueOf(plusesArrayList.get(tblPluses.getSelectedRow()).getIdPlus()));
                txtTitle.setText(plusesArrayList.get(tblPluses.getSelectedRow()).getpTitle());
                txtPercent.setText(String.valueOf(plusesArrayList.get(tblPluses.getSelectedRow()).getPercIncrement()));
            }
        }
    }//GEN-LAST:event_tblPlusesMouseClicked

    ////This method is used to full fill table based in Arraylist
    private void fillTable() {
        if (plusesArrayList.size() > 0) {
            modelList = new DefaultTableModel(null, titulos);
            for (int i = 0; i < plusesArrayList.size(); i++) {

                modelList.addRow(new Object[]{plusesArrayList.get(i).getIdPlus(), plusesArrayList.get(i).getpTitle(), plusesArrayList.get(i).getPercIncrement()});
            }

            this.tblPluses.setModel(modelList);
        }

    }

    //This method is used to clear field data
    private void cleanFields() {
        txtId.setText(null);
        txtTitle.setText(null);
        txtPercent.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPluses;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPercent;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

    private boolean alreadyExist(int id) {
      
       if(plusesArrayList.size()>0){
        for (int i = 0; i < plusesArrayList.size(); i++) {
           if(plusesArrayList.get(i).getIdPlus()==id){
               return true;
                          }
            
        }
       }
        
        return false;
    }

}
