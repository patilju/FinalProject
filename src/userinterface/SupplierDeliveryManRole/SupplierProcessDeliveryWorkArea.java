/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierDeliveryManRole;

import Business.SupplierOrders.SupplierOrders;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nupoorkorde
 */
public class SupplierProcessDeliveryWorkArea extends javax.swing.JPanel {
JPanel userProcessContainer;
    SupplierOrders supplierOrders;
    /**
     * Creates new form SupplierProcessDeliveryWorkArea
     */
    public SupplierProcessDeliveryWorkArea(JPanel userProcessContainer, SupplierOrders so) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierOrders = so;
        SupplierPDWAText.addItem("Delivered");
        SupplierPDWAText.addItem("Not Delivered");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SupplierPDWASubmitResultButton = new javax.swing.JButton();
        SupplierPDWALabel1 = new javax.swing.JLabel();
        SupplierPDWABackButton = new javax.swing.JButton();
        SupplierPDWAText = new javax.swing.JComboBox<>();
        SupplierPDWALabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        SupplierPDWASubmitResultButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SupplierPDWASubmitResultButton.setText("Submit Result");
        SupplierPDWASubmitResultButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SupplierPDWASubmitResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierPDWASubmitResultButtonActionPerformed(evt);
            }
        });
        add(SupplierPDWASubmitResultButton);
        SupplierPDWASubmitResultButton.setBounds(340, 120, 131, 38);

        SupplierPDWALabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SupplierPDWALabel1.setText("Result");
        add(SupplierPDWALabel1);
        SupplierPDWALabel1.setBounds(40, 54, 90, 30);

        SupplierPDWABackButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SupplierPDWABackButton.setText("Back");
        SupplierPDWABackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SupplierPDWABackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierPDWABackButtonActionPerformed(evt);
            }
        });
        add(SupplierPDWABackButton);
        SupplierPDWABackButton.setBounds(150, 130, 80, 30);

        SupplierPDWAText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SupplierPDWAText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SupplierPDWAText);
        SupplierPDWAText.setBounds(145, 49, 320, 40);

        SupplierPDWALabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MicrosoftTeams-image (3).png"))); // NOI18N
        add(SupplierPDWALabel);
        SupplierPDWALabel.setBounds(0, 0, 1130, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void SupplierPDWASubmitResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierPDWASubmitResultButtonActionPerformed
        switch(SupplierPDWAText.getSelectedIndex())
        {
            case 0 : supplierOrders.setStatus(true);
            break;
            case 1 : supplierOrders.setStatus(false);
            break;
        }
        System.out.println(SupplierPDWAText.getSelectedIndex());
        System.out.println(supplierOrders.isStatus());
        System.out.println(supplierOrders.getTotalAmount());
        JOptionPane.showMessageDialog(null, "Order status updated successfully!");
    }//GEN-LAST:event_SupplierPDWASubmitResultButtonActionPerformed

    private void SupplierPDWABackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierPDWABackButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SupplierDeliveryManWorkArea dwjp = (SupplierDeliveryManWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_SupplierPDWABackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SupplierPDWABackButton;
    private javax.swing.JLabel SupplierPDWALabel;
    private javax.swing.JLabel SupplierPDWALabel1;
    private javax.swing.JButton SupplierPDWASubmitResultButton;
    private javax.swing.JComboBox<String> SupplierPDWAText;
    // End of variables declaration//GEN-END:variables
}
