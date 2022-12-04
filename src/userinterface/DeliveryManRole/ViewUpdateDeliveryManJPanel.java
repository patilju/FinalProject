/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vini
 */
public class ViewUpdateDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateDeliveryManJPanel
     */
    public JPanel container;
    public DeliveryMan deliveryMan;
    public DeliveryManDirectory deliveryManDirectory;
    private final EcoSystem system;
    private String currentPhoneNo;
    
    
    public ViewUpdateDeliveryManJPanel(EcoSystem system, JPanel container, DeliveryMan deliveryMan, DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.container = container;
        this.deliveryMan = deliveryMan;
        this.deliveryManDirectory = deliveryManDirectory;
        this.system = system;
        this.currentPhoneNo = deliveryMan.getDeliPhoneNo();
        
        txtDeliNo.setText(deliveryMan.getDeliveryID());
        txtDeliName.setText(deliveryMan.getDeliName());
        txtDeliContact.setText(deliveryMan.getDeliPhoneNo());
        disableEdit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDeliContact = new javax.swing.JLabel();
        txtDeliContact = new javax.swing.JTextField();
        txtDeliName = new javax.swing.JTextField();
        txtDeliNo = new javax.swing.JTextField();
        lblDeliName = new javax.swing.JLabel();
        lblDeliNo = new javax.swing.JLabel();
        lblAddDeli = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        btnEnableUpdate = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblDeliContact.setBackground(new java.awt.Color(204, 255, 255));
        lblDeliContact.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDeliContact.setForeground(new java.awt.Color(0, 51, 51));
        lblDeliContact.setText("Contact No :");

        txtDeliContact.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDeliContact.setForeground(new java.awt.Color(0, 51, 51));
        txtDeliContact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDeliName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDeliName.setForeground(new java.awt.Color(0, 51, 51));
        txtDeliName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDeliNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDeliNo.setForeground(new java.awt.Color(0, 51, 51));
        txtDeliNo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDeliName.setBackground(new java.awt.Color(204, 255, 255));
        lblDeliName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDeliName.setForeground(new java.awt.Color(0, 51, 51));
        lblDeliName.setText("Name:");

        lblDeliNo.setBackground(new java.awt.Color(204, 255, 255));
        lblDeliNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblDeliNo.setForeground(new java.awt.Color(0, 51, 51));
        lblDeliNo.setText("Username :");

        lblAddDeli.setBackground(new java.awt.Color(204, 255, 255));
        lblAddDeli.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAddDeli.setForeground(new java.awt.Color(0, 51, 51));
        lblAddDeli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddDeli.setText("Create Delivery Person");

        btnBack1.setBackground(new java.awt.Color(204, 255, 255));
        btnBack1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(0, 51, 51));
        btnBack1.setText("Back");
        btnBack1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        btnEnableUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnEnableUpdate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEnableUpdate.setForeground(new java.awt.Color(0, 51, 51));
        btnEnableUpdate.setText(" Update");
        btnEnableUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnableUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableUpdateActionPerformed(evt);
            }
        });

        btnSaveChanges.setBackground(new java.awt.Color(204, 255, 255));
        btnSaveChanges.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(0, 51, 51));
        btnSaveChanges.setText("Save");
        btnSaveChanges.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(lblAddDeli))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDeliName)
                            .addComponent(lblDeliContact)
                            .addComponent(lblDeliNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDeliName)
                            .addComponent(txtDeliContact)
                            .addComponent(txtDeliNo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnSaveChanges, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEnableUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                                .addGap(0, 388, Short.MAX_VALUE)))))
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblAddDeli)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeliNo)
                    .addComponent(txtDeliNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeliName)
                    .addComponent(txtDeliName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDeliContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnBack1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnableUpdate))
                    .addComponent(lblDeliContact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveChanges)
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDeliveryManJPanel manageDeliJPanel = (ManageDeliveryManJPanel) component;
        manageDeliJPanel.populateDeliveryManTable();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);

    }//GEN-LAST:event_btnBack1ActionPerformed
    public void disableEdit() {
        txtDeliNo.setEditable(false);
        txtDeliName.setEditable(false);
        txtDeliContact.setEditable(false);
    }
    private void btnEnableUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableUpdateActionPerformed
        // TODO add your handling code here:
        txtDeliName.setEditable(true);
        txtDeliContact.setEditable(true);
     
        btnEnableUpdate.setEnabled(false);
    }//GEN-LAST:event_btnEnableUpdateActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        String custID = txtDeliNo.getText();
        String custName = txtDeliName.getText();
        String custContact = txtDeliContact.getText();
        boolean allSet = true;

        if( custName.isEmpty() || custContact.isEmpty()  ) {
            allSet = false;
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!system.validateMobileNo(custContact)) {
            allSet = false;
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
        }   
        
        if (!deliveryManDirectory.isContactNoUnique(custContact)) {
            if(!currentPhoneNo.equals(custContact)){
                allSet = false;
                JOptionPane.showMessageDialog(null, "Entered Contact No is already mapped to another Customer.");
            }
        }
        if(allSet == true){
            deliveryManDirectory.updateDeliveryMan(custID, custName, custContact);
            JOptionPane.showMessageDialog(null, "Customer details updated!");
            disableEdit();
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnEnableUpdate;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel lblAddDeli;
    private javax.swing.JLabel lblDeliContact;
    private javax.swing.JLabel lblDeliName;
    private javax.swing.JLabel lblDeliNo;
    private javax.swing.JTextField txtDeliContact;
    private javax.swing.JTextField txtDeliName;
    private javax.swing.JTextField txtDeliNo;
    // End of variables declaration//GEN-END:variables
}
