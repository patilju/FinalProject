/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyAdminRole;

import Business.MedicineItems.MedicineItem;
import Business.Pharmacy.Pharmacy;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhrit
 */
public class AdminUpdateMedicineItem extends javax.swing.JPanel {

    /**
     * Creates new form AdminUpdateFoodItem
     */
    JPanel userProcessContainer;
    Pharmacy pharmacy;
    MedicineItem medicineItem;
    public AdminUpdateMedicineItem(JPanel userProcessContainer, MedicineItem mi) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.medicineItem = mi;
        PharmacyAUMINameText.setText(mi.getMedicineName());
        PharmacyAUMIPriceSpin.setValue(mi.getMedicinePrice());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PharmacyAUMINameLabel = new javax.swing.JLabel();
        PharmacyAUMIPriceLabel = new javax.swing.JLabel();
        PharmacyAUMIPriceSpin = new javax.swing.JSpinner();
        PharmacyAMUISubmitButton = new javax.swing.JButton();
        PharmacyAMUIUpdateMedicineLabel = new javax.swing.JLabel();
        PharmacyAUMIBackButton = new javax.swing.JButton();
        PharmacyAUMINameText = new javax.swing.JTextField();
        PharmacyAMUILabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        PharmacyAUMINameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAUMINameLabel.setText("             Name:");
        add(PharmacyAUMINameLabel);
        PharmacyAUMINameLabel.setBounds(51, 88, 80, 50);

        PharmacyAUMIPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAUMIPriceLabel.setText("               Price:");
        add(PharmacyAUMIPriceLabel);
        PharmacyAUMIPriceLabel.setBounds(47, 165, 80, 50);

        PharmacyAUMIPriceSpin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PharmacyAUMIPriceSpin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(PharmacyAUMIPriceSpin);
        PharmacyAUMIPriceSpin.setBounds(147, 165, 460, 60);

        PharmacyAMUISubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAMUISubmitButton.setText("Submit");
        PharmacyAMUISubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAMUISubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAMUISubmitButtonActionPerformed(evt);
            }
        });
        add(PharmacyAMUISubmitButton);
        PharmacyAMUISubmitButton.setBounds(430, 290, 170, 60);

        PharmacyAMUIUpdateMedicineLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PharmacyAMUIUpdateMedicineLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PharmacyAMUIUpdateMedicineLabel.setText("Update Medicine");
        add(PharmacyAMUIUpdateMedicineLabel);
        PharmacyAMUIUpdateMedicineLabel.setBounds(233, 35, 197, 30);

        PharmacyAUMIBackButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAUMIBackButton.setText("< Back");
        PharmacyAUMIBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAUMIBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAUMIBackButtonActionPerformed(evt);
            }
        });
        add(PharmacyAUMIBackButton);
        PharmacyAUMIBackButton.setBounds(150, 290, 110, 60);

        PharmacyAUMINameText.setEditable(false);
        PharmacyAUMINameText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PharmacyAUMINameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(PharmacyAUMINameText);
        PharmacyAUMINameText.setBounds(147, 87, 460, 60);

        PharmacyAMUILabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAMUILabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PharmacyAdminUpdateMedicine-Dhriti.jpg"))); // NOI18N
        add(PharmacyAMUILabel);
        PharmacyAMUILabel.setBounds(10, 20, 1460, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacyAMUISubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAMUISubmitButtonActionPerformed
        // TODO add your handling code here:

        if((Integer)PharmacyAUMIPriceSpin.getValue() > 0)
        {
            medicineItem.setMedicinePrice((Integer)PharmacyAUMIPriceSpin.getValue());
            JOptionPane.showMessageDialog(null, "Medicine " + medicineItem.getMedicineName()+ " updated successfully!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Price must be greater than 0!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_PharmacyAMUISubmitButtonActionPerformed

    private void PharmacyAUMIBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAUMIBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminManageMedicine dwjp = (AdminManageMedicine) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_PharmacyAUMIBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PharmacyAMUILabel;
    private javax.swing.JButton PharmacyAMUISubmitButton;
    private javax.swing.JLabel PharmacyAMUIUpdateMedicineLabel;
    private javax.swing.JButton PharmacyAUMIBackButton;
    private javax.swing.JLabel PharmacyAUMINameLabel;
    private javax.swing.JTextField PharmacyAUMINameText;
    private javax.swing.JLabel PharmacyAUMIPriceLabel;
    private javax.swing.JSpinner PharmacyAUMIPriceSpin;
    // End of variables declaration//GEN-END:variables
}
