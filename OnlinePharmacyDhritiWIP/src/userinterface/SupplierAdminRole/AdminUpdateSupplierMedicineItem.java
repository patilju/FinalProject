/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierAdminRole;


import Business.Supplier.Supplier;
import Business.SupplierMedicineItem.SupplierMedicineItem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dhrit
 */
public class AdminUpdateSupplierMedicineItem extends javax.swing.JPanel {

    /**
     * Creates new form AdminUpdateSupplierMedicineItem
     */
     JPanel userProcessContainer;
    Supplier supplier;
    SupplierMedicineItem supplierMedicineItem;
    public AdminUpdateSupplierMedicineItem(JPanel userProcessContainer, SupplierMedicineItem smi) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierMedicineItem = smi;
        SupplierAdminAUSMNameText.setText(smi.getName());
        SupplierAdminAUSMPriceSpin.setValue(smi.getPrice());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SupplierAdminAUSMLabel1 = new javax.swing.JLabel();
        SupplierAdminAUSMBackButton = new javax.swing.JButton();
        SupplierAdminAUSMNameText = new javax.swing.JTextField();
        SupplierAdminAUSMNameLabel = new javax.swing.JLabel();
        SupplierAdminAUSMPriceLabel = new javax.swing.JLabel();
        SupplierAdminAUSMPriceSpin = new javax.swing.JSpinner();
        SupplierAdminAUSMSubmitButton = new javax.swing.JButton();
        SupplierAdminAUSMLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        SupplierAdminAUSMLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SupplierAdminAUSMLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupplierAdminAUSMLabel1.setText("Update Medicine");
        add(SupplierAdminAUSMLabel1);
        SupplierAdminAUSMLabel1.setBounds(447, 10, 610, 90);

        SupplierAdminAUSMBackButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminAUSMBackButton.setText("< Back");
        SupplierAdminAUSMBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SupplierAdminAUSMBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierAdminAUSMBackButtonActionPerformed(evt);
            }
        });
        add(SupplierAdminAUSMBackButton);
        SupplierAdminAUSMBackButton.setBounds(420, 460, 180, 60);

        SupplierAdminAUSMNameText.setEditable(false);
        SupplierAdminAUSMNameText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SupplierAdminAUSMNameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SupplierAdminAUSMNameText);
        SupplierAdminAUSMNameText.setBounds(850, 170, 320, 60);

        SupplierAdminAUSMNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminAUSMNameLabel.setText("                                                      Name:");
        add(SupplierAdminAUSMNameLabel);
        SupplierAdminAUSMNameLabel.setBounds(410, 170, 340, 60);

        SupplierAdminAUSMPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminAUSMPriceLabel.setText("                                                                     Price:");
        add(SupplierAdminAUSMPriceLabel);
        SupplierAdminAUSMPriceLabel.setBounds(350, 320, 420, 50);

        SupplierAdminAUSMPriceSpin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SupplierAdminAUSMPriceSpin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SupplierAdminAUSMPriceSpin);
        SupplierAdminAUSMPriceSpin.setBounds(850, 310, 320, 60);

        SupplierAdminAUSMSubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminAUSMSubmitButton.setText("Submit");
        SupplierAdminAUSMSubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SupplierAdminAUSMSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierAdminAUSMSubmitButtonActionPerformed(evt);
            }
        });
        add(SupplierAdminAUSMSubmitButton);
        SupplierAdminAUSMSubmitButton.setBounds(820, 460, 200, 60);

        SupplierAdminAUSMLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/UPDATE_MEDICINE_IMAGE_FINAL.jpg"))); // NOI18N
        add(SupplierAdminAUSMLabel);
        SupplierAdminAUSMLabel.setBounds(20, 10, 1480, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void SupplierAdminAUSMBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierAdminAUSMBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminManageSupplierMedicine dwjp = (AdminManageSupplierMedicine) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_SupplierAdminAUSMBackButtonActionPerformed

    private void SupplierAdminAUSMSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierAdminAUSMSubmitButtonActionPerformed
        // TODO add your handling code here:

        if((Integer)SupplierAdminAUSMPriceSpin.getValue() > 0)
        {
            supplierMedicineItem.setPrice((Integer)SupplierAdminAUSMPriceSpin.getValue());
            JOptionPane.showMessageDialog(null, "Medicine " + supplierMedicineItem.getName()+ " updated successfully!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Price must be greater than 0!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SupplierAdminAUSMSubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SupplierAdminAUSMBackButton;
    private javax.swing.JLabel SupplierAdminAUSMLabel;
    private javax.swing.JLabel SupplierAdminAUSMLabel1;
    private javax.swing.JLabel SupplierAdminAUSMNameLabel;
    private javax.swing.JTextField SupplierAdminAUSMNameText;
    private javax.swing.JLabel SupplierAdminAUSMPriceLabel;
    private javax.swing.JSpinner SupplierAdminAUSMPriceSpin;
    private javax.swing.JButton SupplierAdminAUSMSubmitButton;
    // End of variables declaration//GEN-END:variables
}
