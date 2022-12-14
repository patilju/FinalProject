/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliveryManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nupoorkorde
 */
public class SystemAdminUpdateCustomer extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminUpdateCustomer
     */
    private JPanel userProcessContainerSAUC;
    private EcoSystem ecosystemSAUC;
    private Customer customerSAUC;
    
    public SystemAdminUpdateCustomer(JPanel userProcessContainer, Customer customer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainerSAUC = userProcessContainer;
        this.customerSAUC = customer;
        this.ecosystemSAUC = ecosystem;;
        SystemAUCNameText.setText(customer.getName());
        SystemAUCPhoneNumberText.setText(customer.getPhone());
        SystemAUCAddressText.setText(customer.getAddress());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SystemAUCBackButton = new javax.swing.JButton();
        SystemAUCSubmitButton = new javax.swing.JButton();
        SystemAUCLabel1 = new javax.swing.JLabel();
        SystemAUCNameLabel = new javax.swing.JLabel();
        SystemAUCNameText = new javax.swing.JTextField();
        SystemAUCPhoneNumberText = new javax.swing.JTextField();
        SystemAUCPhoneNumberLabel = new javax.swing.JLabel();
        SystemAUCAddressLabel = new javax.swing.JLabel();
        SystemAUCAddressText = new javax.swing.JTextField();
        SystemAUCLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        SystemAUCBackButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAUCBackButton.setText("< Back");
        SystemAUCBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemAUCBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAUCBackButtonActionPerformed(evt);
            }
        });
        add(SystemAUCBackButton);
        SystemAUCBackButton.setBounds(26, 24, 42, 21);

        SystemAUCSubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAUCSubmitButton.setText("Submit");
        SystemAUCSubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemAUCSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAUCSubmitButtonActionPerformed(evt);
            }
        });
        add(SystemAUCSubmitButton);
        SystemAUCSubmitButton.setBounds(255, 191, 160, 39);

        SystemAUCLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SystemAUCLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SystemAUCLabel1.setText("Update Customer");
        add(SystemAUCLabel1);
        SystemAUCLabel1.setBounds(90, 10, 350, 29);

        SystemAUCNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAUCNameLabel.setText("Name:");
        add(SystemAUCNameLabel);
        SystemAUCNameLabel.setBounds(65, 90, 144, 15);

        SystemAUCNameText.setEditable(false);
        SystemAUCNameText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAUCNameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemAUCNameText);
        SystemAUCNameText.setBounds(255, 89, 160, 17);

        SystemAUCPhoneNumberText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAUCPhoneNumberText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemAUCPhoneNumberText);
        SystemAUCPhoneNumberText.setBounds(255, 123, 160, 17);

        SystemAUCPhoneNumberLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAUCPhoneNumberLabel.setText("Phone Number:");
        add(SystemAUCPhoneNumberLabel);
        SystemAUCPhoneNumberLabel.setBounds(65, 124, 144, 15);

        SystemAUCAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAUCAddressLabel.setText("Address:");
        add(SystemAUCAddressLabel);
        SystemAUCAddressLabel.setBounds(65, 158, 144, 15);

        SystemAUCAddressText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAUCAddressText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemAUCAddressText);
        SystemAUCAddressText.setBounds(255, 157, 160, 17);

        SystemAUCLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Update_Customer.png"))); // NOI18N
        add(SystemAUCLabel);
        SystemAUCLabel.setBounds(0, 80, 570, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void SystemAUCBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAUCBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainerSAUC.remove(this);
        CardLayout layout = (CardLayout) userProcessContainerSAUC.getLayout();
        layout.previous(userProcessContainerSAUC);
    }//GEN-LAST:event_SystemAUCBackButtonActionPerformed

    private void SystemAUCSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAUCSubmitButtonActionPerformed
        // TODO add your handling code here:
        if(validateThisSAUC())
        {
            customerSAUC.setAddress(SystemAUCAddressText.getText());
            customerSAUC.setPhone(SystemAUCPhoneNumberText.getText());
            JOptionPane.showMessageDialog(null, "Details for " + customerSAUC.getName()+ " updated successfully!");
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_SystemAUCSubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SystemAUCAddressLabel;
    private javax.swing.JTextField SystemAUCAddressText;
    private javax.swing.JButton SystemAUCBackButton;
    private javax.swing.JLabel SystemAUCLabel;
    private javax.swing.JLabel SystemAUCLabel1;
    private javax.swing.JLabel SystemAUCNameLabel;
    private javax.swing.JTextField SystemAUCNameText;
    private javax.swing.JLabel SystemAUCPhoneNumberLabel;
    private javax.swing.JTextField SystemAUCPhoneNumberText;
    private javax.swing.JButton SystemAUCSubmitButton;
    // End of variables declaration//GEN-END:variables

    private boolean validateThisSAUC() {
        String regex = "\\d{10}";
        if(("".equals(SystemAUCPhoneNumberText.getText())) || ("".equals(SystemAUCAddressText.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(SystemAUCPhoneNumberText.getText().matches(regex)))
        {
            JOptionPane.showMessageDialog(null,"Phone number must have only 10 digits!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
}
