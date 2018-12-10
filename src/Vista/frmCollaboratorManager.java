/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.Collaborator;
import Logica.Plus;
import Logica.PlusCollaborator;
import Logica.Position;
import static Vista.frmMain.dkpPrincipal;
import java.awt.Component;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manyor
 */
public class frmCollaboratorManager extends javax.swing.JInternalFrame {

    ArrayList<Plus> plusesArrayList;
    ArrayList<PlusCollaborator> plusesCollaborator;
    ArrayList<Collaborator> collaboratorArrayList;
    ArrayList<Position> positionArrayList;
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel modelTable = new DefaultTableModel();
    Collaborator collaObj = new Collaborator();
    String titulos[] = {"DNI", "NAME", "BIRTH DATE", "STAR DATE", "END DATE", "DIRECTION", "#PHONE", "EMAIL", "POSITION", "BOSS DNI"};
    DateFormat date = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
    frmAsignPlusesCollaborator asignarPlusWin;

    /**
     * Creates new form frmCollaboratorManager
     */
    public frmCollaboratorManager() {
        initComponents();
    }

    public frmCollaboratorManager(frmMain aThis, ArrayList<Collaborator> colArrayList, ArrayList<Position> posArrayList, ArrayList<Plus> plusArrayList) {
        initComponents();
        this.collaboratorArrayList = colArrayList;
        this.positionArrayList = posArrayList;
        this.plusesArrayList = plusArrayList;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDirection = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtBossDni = new javax.swing.JTextField();
        cmbPosition = new javax.swing.JComboBox<>();
        dtpStarDate = new org.jdesktop.swingx.JXDatePicker();
        dtpEndDAte = new org.jdesktop.swingx.JXDatePicker();
        dtpBirthDate = new org.jdesktop.swingx.JXDatePicker();
        btnAssigPlus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCollaborator = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }};

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
                    formInternalFrameDeactivated(evt);
                }
                public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
                }
                public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
                }
                public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                }
            });

            jLabel1.setText("Date of Birth:");

            jLabel2.setText("Name:");

            jLabel3.setText("DNI:");

            jLabel4.setText("Start Date:");

            jLabel5.setText("End Date:");

            jLabel6.setText("Direction:");

            jLabel7.setText("Phone Number:");

            jLabel8.setText("Email:");

            txtEmail.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtEmailActionPerformed(evt);
                }
            });

            jLabel9.setText("Position:");

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

            jLabel10.setText("Boss DNI:");

            txtBossDni.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtBossDniActionPerformed(evt);
                }
            });

            btnAssigPlus.setText("Assign plus");
            btnAssigPlus.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAssigPlusActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName)
                                .addComponent(txtId)
                                .addComponent(txtDirection)
                                .addComponent(dtpStarDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dtpEndDAte, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addComponent(dtpBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBossDni)
                                .addComponent(txtPhoneNumber)
                                .addComponent(txtEmail)
                                .addComponent(cmbPosition, 0, 258, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addComponent(btnAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnUpdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDelete)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAssigPlus)))
                    .addContainerGap(50, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtBossDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(dtpBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(dtpStarDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(dtpEndDAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete)
                        .addComponent(btnAssigPlus))
                    .addContainerGap(55, Short.MAX_VALUE))
            );

            tblCollaborator.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
            tblCollaborator.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tblCollaboratorMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(tblCollaborator);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (txtId.isEnabled()) {
            if (!txtId.getText().isEmpty() && !txtName.getText().isEmpty() && !dtpBirthDate.getDate().toString().isEmpty()
                    && !dtpStarDate.getDate().toString().isEmpty() && !txtDirection.getText().isEmpty() && !txtPhoneNumber.getText().isEmpty()
                    && !txtEmail.getText().isEmpty() && cmbPosition.getSelectedIndex() != 0) {
                Integer bossDNI;
                if (!txtBossDni.getText().isEmpty()) {
                    bossDNI = Integer.parseInt(txtBossDni.getText());
                } else {
                    bossDNI = 0;
                }

                collaObj = new Collaborator(Integer.parseInt(txtId.getText()), txtName.getText(), dtpBirthDate.getDate(), dtpStarDate.getDate(),
                        dtpEndDAte.getDate(), txtDirection.getText(), Integer.parseInt(txtPhoneNumber.getText()), txtEmail.getText(),
                        positionArrayList.get(getArrayPostion(cmbPosition.getSelectedItem().toString())), bossDNI);
                if (collaboratorArrayList.add(collaObj)) {
                    cleanFields();
                    fillTable();
                    cmbFillPos();
                    JOptionPane.showConfirmDialog(null, "Register added succesfully", "Confirm Message", JOptionPane.DEFAULT_OPTION);

                } else {
                    JOptionPane.showConfirmDialog(null, "Register process failed, Please try again", "Confirm Message", JOptionPane.DEFAULT_OPTION);
                }
            } else {

                JOptionPane.showConfirmDialog(null, "Please, complete required information", "Confirm Message", JOptionPane.DEFAULT_OPTION);
            }
        } else {

            JOptionPane.showConfirmDialog(null, "Please, finish edition Process", "Confirm Message", JOptionPane.DEFAULT_OPTION);

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
//        //TODO add your handling code here:
        txtId.setEnabled(true);
        if (!txtId.getText().isEmpty() && !txtName.getText().isEmpty() && !dtpBirthDate.getDate().toString().isEmpty()
                && !dtpStarDate.getDate().toString().isEmpty() && !txtDirection.getText().isEmpty() && !txtPhoneNumber.getText().isEmpty()
                && !txtEmail.getText().isEmpty() && cmbPosition.getSelectedIndex() != 0) {
            Integer bossDNI;

            if (!txtBossDni.getText().isEmpty()) {
                bossDNI = Integer.parseInt(txtBossDni.getText());
            } else {
                bossDNI = 0;
            }

            collaObj = new Collaborator(Integer.parseInt(txtId.getText()), txtName.getText(), dtpBirthDate.getDate(), dtpStarDate.getDate(),
                    dtpEndDAte.getDate(), txtDirection.getText(), Integer.parseInt(txtPhoneNumber.getText()), txtEmail.getText(),
                    positionArrayList.get(getArrayPostion(cmbPosition.getSelectedItem().toString())), bossDNI);

            try {
                collaboratorArrayList.set(tblCollaborator.getSelectedRow(), collaObj);
                cleanFields();
                JOptionPane.showConfirmDialog(null, "Register modified succesfully", "Confirm Message", JOptionPane.DEFAULT_OPTION);

                fillTable();
            } catch (HeadlessException e) {
                JOptionPane.showConfirmDialog(null, "Modify process failed, Please try again", "Confirm Message", JOptionPane.DEFAULT_OPTION);

            }

        } else {

            JOptionPane.showConfirmDialog(null, "Please, complettxtIdinformation", "Confirm Message", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtId.isEnabled()) {
            int a = tblCollaborator.getSelectedRow();

            if (a < 0) {

                JOptionPane.showMessageDialog(null,
                        "You must select a row");
            } else {

                int confirmar = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to delete this register?");

                if (JOptionPane.OK_OPTION == confirmar) {
                    try {
                        positionArrayList.remove(a);
                        modelTable.removeRow(a);
                        JOptionPane.showMessageDialog(null,
                                "Register deleted");
                        if (positionArrayList.size() > 1) {
                            fillTable();

                        }
                    } catch (HeadlessException e) {
                    }

                }
            }
        } else {

            JOptionPane.showConfirmDialog(this, "Please, finish edition Process", "Confirm Message", JOptionPane.DEFAULT_OPTION);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeactivated
        // TODO add your handling code here:


    }//GEN-LAST:event_formInternalFrameDeactivated

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        cmbFillPos();
        fillTable();

    }//GEN-LAST:event_formInternalFrameActivated

    private void txtBossDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBossDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBossDniActionPerformed

    private void tblCollaboratorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCollaboratorMouseClicked
        // TODO add your handling code here:
        if (tblCollaborator.getSelectedRow() > 0) {
            if (evt.getClickCount() == 2) {
                txtId.setEnabled(false);
                txtId.setText(String.valueOf(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getDNI()));
                txtName.setText(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getName());
                dtpBirthDate.setDate(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getBirthDate());
                dtpStarDate.setDate(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getStartDate());
                dtpEndDAte.setDate(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getEndDate());
                txtDirection.setText(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getDirection());
                txtPhoneNumber.setText(String.valueOf(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getPhoneNumbre()));
                txtEmail.setText(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getEmail());
                txtBossDni.setText(String.valueOf(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getBossDNI()));
                cmbPosition.setSelectedIndex(collaboratorArrayList.get(tblCollaborator.getSelectedRow()).getPosition().getIdPosition());
            }
        }
    }//GEN-LAST:event_tblCollaboratorMouseClicked

    private void btnAssigPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigPlusActionPerformed
        // TODO add your handling code here:

        if (!asignarPlusWin.isShowing()) {
            asignarPlusWin = new frmAsignPlusesCollaborator(null, collaboratorArrayList, plusesArrayList, plusesCollaborator);
            asignarPlusWin.setTitle(title);
            frmMain.dkpPrincipal.add(asignarPlusWin);
            asignarPlusWin.toFront();
            asignarPlusWin.setVisible(true);

        } else {
            asignarPlusWin.moveToFront();
        }


    }//GEN-LAST:event_btnAssigPlusActionPerformed

    ////This method is used to full fill table based in Arraylist
    private void fillTable() {
        if (collaboratorArrayList.size() > 0) {
            modelTable = new DefaultTableModel(null, titulos);
            for (int i = 0; i < collaboratorArrayList.size(); i++) {

                modelTable.addRow(new Object[]{collaboratorArrayList.get(i).getDNI(), collaboratorArrayList.get(i).getName(),
                    date.format(collaboratorArrayList.get(i).getBirthDate()), date.format(collaboratorArrayList.get(i).getStartDate()),
                    date.format(collaboratorArrayList.get(i).getEndDate()), collaboratorArrayList.get(i).getDirection(),
                    collaboratorArrayList.get(i).getPhoneNumbre(), collaboratorArrayList.get(i).getEmail(),
                    collaboratorArrayList.get(i).getPosition().getpName(), collaboratorArrayList.get(i).getBossDNI()});
            }

            this.tblCollaborator.setModel(modelTable);
        }

    }

    private int getArrayPostion(String text) {

        String arrayCombo[] = text.split("-");
        Integer pos = Integer.parseInt(arrayCombo[0]);

        for (int i = 0; i < positionArrayList.size(); i++) {
            if (positionArrayList.get(i).getIdPosition() == pos) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    //This method is used to clear field data
    private void cleanFields() {
        txtId.setText(null);
        txtName.setText(null);
        dtpBirthDate.setDate(null);
        dtpStarDate.setDate(null);
        dtpEndDAte.setDate(null);
        txtDirection.setText(null);
        txtPhoneNumber.setText(null);
        txtEmail.setText(null);
        cmbPosition.removeAllItems();
        txtBossDni.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAssigPlus;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbPosition;
    private org.jdesktop.swingx.JXDatePicker dtpBirthDate;
    private org.jdesktop.swingx.JXDatePicker dtpEndDAte;
    private org.jdesktop.swingx.JXDatePicker dtpStarDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCollaborator;
    private javax.swing.JTextField txtBossDni;
    private javax.swing.JTextField txtDirection;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

    private void cmbFillPos() {
        comboBoxModel.removeAllElements();
        comboBoxModel.addElement("Please, select an option...");
        for (int i = 0; i < positionArrayList.size(); i++) {
            comboBoxModel.addElement(positionArrayList.get(i).getIdPosition() + "-" + positionArrayList.get(i).getpName());
        }
        cmbPosition.setModel(comboBoxModel);
    }
}
