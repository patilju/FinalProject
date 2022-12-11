/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierAdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Pharmacy.Pharmacy;
import Business.Supplier.Supplier;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.PharmacyAdminRole.AdminManageMedicine;
import userinterface.PharmacyAdminRole.AdminManageOrders;

/**
 *
 * @author dhrit
 */
public class SupplierAdminWorkAreaJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
    UserAccount user;
    EcoSystem system;
    Supplier supplier;
    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public SupplierAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount user, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.user = user;
        this.system = system;
        for(Supplier r : system.getSupplierDirectory().getSupplierList())
        {
            for(Employee e : r.getEmployeeDirectory().getEmployeeList())
            {
                if(user.getEmployee() == e)
                {
                    this.supplier = r;
                    SupplierAdminSAWALabel3.setText(r.getName());
                }
            } 
        }
        SupplierAdminSAWANameText.setText(this.supplier.getName());
        SupplierAdminSAWAAddressText.setText(this.supplier.getAddress());
      
        //valueLabel.setText();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SupplierAdminSAWALabel1 = new javax.swing.JLabel();
        SupplierAdminSAWALabel2 = new javax.swing.JLabel();
        SupplierAdminSAWALabel3 = new javax.swing.JLabel();
        SupplierAdminSAWALabel4 = new javax.swing.JLabel();
        SupplierAdminSAWANameText = new javax.swing.JTextField();
        SupplierAdminSAWALabel5 = new javax.swing.JLabel();
        SupplierAdminSAWAAddressText = new javax.swing.JTextField();
        SupplierAdminSAWAViewButton = new javax.swing.JButton();
        SupplierAdminSAWAManageButton = new javax.swing.JButton();
        SupplierAdminSAWASubmitButton = new javax.swing.JButton();
        SupplierAdminSAWALabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        SupplierAdminSAWALabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SupplierAdminSAWALabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SupplierAdminSAWALabel1.setText("My Work Area - Administrative Role");
        add(SupplierAdminSAWALabel1);
        SupplierAdminSAWALabel1.setBounds(210, 10, 980, 70);

        SupplierAdminSAWALabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminSAWALabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SupplierAdminSAWALabel2.setText("Supplier");
        add(SupplierAdminSAWALabel2);
        SupplierAdminSAWALabel2.setBounds(490, 90, 180, 40);

        SupplierAdminSAWALabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminSAWALabel3.setText("<value>");
        add(SupplierAdminSAWALabel3);
        SupplierAdminSAWALabel3.setBounds(800, 90, 200, 30);

        SupplierAdminSAWALabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminSAWALabel4.setText("             Supplier Name:");
        add(SupplierAdminSAWALabel4);
        SupplierAdminSAWALabel4.setBounds(490, 300, 210, 70);

        SupplierAdminSAWANameText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SupplierAdminSAWANameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SupplierAdminSAWANameText);
        SupplierAdminSAWANameText.setBounds(770, 290, 400, 70);

        SupplierAdminSAWALabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminSAWALabel5.setText("                                 Address:");
        add(SupplierAdminSAWALabel5);
        SupplierAdminSAWALabel5.setBounds(420, 410, 290, 60);

        SupplierAdminSAWAAddressText.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        SupplierAdminSAWAAddressText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SupplierAdminSAWAAddressText);
        SupplierAdminSAWAAddressText.setBounds(770, 410, 400, 70);

        SupplierAdminSAWAViewButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminSAWAViewButton.setText("View Orders");
        SupplierAdminSAWAViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierAdminSAWAViewButtonActionPerformed(evt);
            }
        });
        add(SupplierAdminSAWAViewButton);
        SupplierAdminSAWAViewButton.setBounds(420, 150, 210, 70);

        SupplierAdminSAWAManageButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminSAWAManageButton.setText("Manage Medicine");
        SupplierAdminSAWAManageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierAdminSAWAManageButtonActionPerformed(evt);
            }
        });
        add(SupplierAdminSAWAManageButton);
        SupplierAdminSAWAManageButton.setBounds(800, 160, 230, 70);

        SupplierAdminSAWASubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminSAWASubmitButton.setText("Submit");
        SupplierAdminSAWASubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierAdminSAWASubmitButtonActionPerformed(evt);
            }
        });
        add(SupplierAdminSAWASubmitButton);
        SupplierAdminSAWASubmitButton.setBounds(660, 610, 170, 70);

        SupplierAdminSAWALabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ONLINE_ADMINISTRATIVE_FINAL_IMAGE.jpg"))); // NOI18N
        add(SupplierAdminSAWALabel);
        SupplierAdminSAWALabel.setBounds(10, 10, 1450, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void SupplierAdminSAWAManageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierAdminSAWAManageButtonActionPerformed
        // TODO add your handling code here:
        AdminManageSupplierMedicine amm = new AdminManageSupplierMedicine(userProcessContainer, supplier);
        userProcessContainer.add("UserCustomer", amm);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_SupplierAdminSAWAManageButtonActionPerformed

    private void SupplierAdminSAWAViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierAdminSAWAViewButtonActionPerformed
        // TODO add your handling code here:
        AdminManageSupplierOrders amo = new AdminManageSupplierOrders(userProcessContainer, supplier);
        userProcessContainer.add("UserCustomer", amo);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_SupplierAdminSAWAViewButtonActionPerformed

    private void SupplierAdminSAWASubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierAdminSAWASubmitButtonActionPerformed
        // TODO add your handling code here:
        if(("".equals(SupplierAdminSAWANameText.getText())) || ("".equals(SupplierAdminSAWAAddressText.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all values!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(SupplierAdminSAWANameText.getText() == null ? supplier.getName() != null : !SupplierAdminSAWANameText.getText().equals(supplier.getName()))
        {
            if(system.getSupplierDirectory().checkIfSupplierIsUnique(SupplierAdminSAWANameText.getText()))
            {
                supplier.setName(SupplierAdminSAWANameText.getText());
                supplier.setAddress(SupplierAdminSAWAAddressText.getText());
                JOptionPane.showMessageDialog(null, "Supplier details updated!");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Supplier name not unique!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        SupplierAdminSAWALabel3.setText(supplier.getName());
    }//GEN-LAST:event_SupplierAdminSAWASubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SupplierAdminSAWAAddressText;
    private javax.swing.JLabel SupplierAdminSAWALabel;
    private javax.swing.JLabel SupplierAdminSAWALabel1;
    private javax.swing.JLabel SupplierAdminSAWALabel2;
    private javax.swing.JLabel SupplierAdminSAWALabel3;
    private javax.swing.JLabel SupplierAdminSAWALabel4;
    private javax.swing.JLabel SupplierAdminSAWALabel5;
    private javax.swing.JButton SupplierAdminSAWAManageButton;
    private javax.swing.JTextField SupplierAdminSAWANameText;
    private javax.swing.JButton SupplierAdminSAWASubmitButton;
    private javax.swing.JButton SupplierAdminSAWAViewButton;
    // End of variables declaration//GEN-END:variables
}