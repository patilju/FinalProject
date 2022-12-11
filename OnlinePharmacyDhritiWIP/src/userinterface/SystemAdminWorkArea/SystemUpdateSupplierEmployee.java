/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nupoorkorde
 */
public class SystemUpdateSupplierEmployee extends javax.swing.JPanel {

    /**
     * Creates new form SystemUpdateSupplierEmployee
     */
    private JPanel userProcessContainerSUE;
    private Employee employeeSUE;
    private EcoSystem ecosystemSUE;
    private UserAccount userSUE;
    public SystemUpdateSupplierEmployee(JPanel userProcessContainer, Employee employee, EcoSystem system) {
        initComponents();
        this.userProcessContainerSUE = userProcessContainer;
        this.employeeSUE = employee;
        this.ecosystemSUE = system;
        this.userSUE = ecosystemSUE.getUserAccountDirectory().findEmployee(employee);
        SystemUSEUsernameText.setText(userSUE.getUsername());
        SystemUSEPasswordText.setText(userSUE.getPassword());
        SystemUSEConfirmPasswordText.setText(userSUE.getPassword());
        SystemUSENameText.setText(employee.getName());
        SystemUSEPhoneNumberText.setText(employee.getPhone());
        SystemUSEAddressText.setText(employee.getAddress());
        if(this.userSUE.getRole().toString().equals("Business.Role.DeliverManRole"))
        {
            SystemUSERadio2.setSelected(true);
        }
        else
        {
            SystemUSERadio1.setSelected(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SystemUSENameText = new javax.swing.JTextField();
        SystemUSEPasswordLabel = new javax.swing.JLabel();
        SystemUSEBackButton = new javax.swing.JButton();
        SystemUSERadio1 = new javax.swing.JRadioButton();
        SystemUSEPhoneNumberText = new javax.swing.JTextField();
        SystemUSEConfirmPasswordLabel = new javax.swing.JLabel();
        SystemUSEUsernameText = new javax.swing.JTextField();
        SystemUSERadio2 = new javax.swing.JRadioButton();
        SystemUSEPhoneNumberLabel = new javax.swing.JLabel();
        SystemUSESubmitButton = new javax.swing.JButton();
        SystemUSEPasswordText = new javax.swing.JTextField();
        SystemUSEAddressLabel = new javax.swing.JLabel();
        SystemUSEConfirmPasswordText = new javax.swing.JTextField();
        SystemUSEAddressText = new javax.swing.JTextField();
        SystemUSEUsernameLabel = new javax.swing.JLabel();
        SystemUSENameLabel = new javax.swing.JLabel();
        SystemUSERoleLabel = new javax.swing.JLabel();
        SystemUSELabel1 = new javax.swing.JLabel();
        SystemUSELabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        SystemUSENameText.setEditable(false);
        SystemUSENameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemUSENameText);
        SystemUSENameText.setBounds(312, 202, 160, 18);

        SystemUSEPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemUSEPasswordLabel.setText("Password: ");
        add(SystemUSEPasswordLabel);
        SystemUSEPasswordLabel.setBounds(150, 117, 144, 15);

        SystemUSEBackButton.setText("< Back");
        SystemUSEBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemUSEBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemUSEBackButtonActionPerformed(evt);
            }
        });
        add(SystemUSEBackButton);
        SystemUSEBackButton.setBounds(228, 428, 42, 22);

        SystemUSERadio1.setText("Supploer Manager");
        SystemUSERadio1.setEnabled(false);
        add(SystemUSERadio1);
        SystemUSERadio1.setBounds(312, 334, 160, 21);

        SystemUSEPhoneNumberText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemUSEPhoneNumberText);
        SystemUSEPhoneNumberText.setBounds(312, 246, 160, 18);

        SystemUSEConfirmPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemUSEConfirmPasswordLabel.setText("Confirm Password:");
        add(SystemUSEConfirmPasswordLabel);
        SystemUSEConfirmPasswordLabel.setBounds(150, 164, 144, 15);

        SystemUSEUsernameText.setEditable(false);
        SystemUSEUsernameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemUSEUsernameText);
        SystemUSEUsernameText.setBounds(312, 70, 160, 18);

        SystemUSERadio2.setText("Delivery Man");
        SystemUSERadio2.setEnabled(false);
        add(SystemUSERadio2);
        SystemUSERadio2.setBounds(312, 381, 160, 21);

        SystemUSEPhoneNumberLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemUSEPhoneNumberLabel.setText("Phone Number:");
        add(SystemUSEPhoneNumberLabel);
        SystemUSEPhoneNumberLabel.setBounds(150, 249, 144, 15);

        SystemUSESubmitButton.setText("Submit");
        SystemUSESubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemUSESubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemUSESubmitButtonActionPerformed(evt);
            }
        });
        add(SystemUSESubmitButton);
        SystemUSESubmitButton.setBounds(312, 428, 160, 22);

        SystemUSEPasswordText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemUSEPasswordText);
        SystemUSEPasswordText.setBounds(312, 114, 160, 18);

        SystemUSEAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemUSEAddressLabel.setText("Address:");
        add(SystemUSEAddressLabel);
        SystemUSEAddressLabel.setBounds(150, 293, 144, 15);

        SystemUSEConfirmPasswordText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemUSEConfirmPasswordText);
        SystemUSEConfirmPasswordText.setBounds(312, 158, 160, 18);

        SystemUSEAddressText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemUSEAddressText);
        SystemUSEAddressText.setBounds(312, 290, 160, 18);

        SystemUSEUsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemUSEUsernameLabel.setText("Username: ");
        add(SystemUSEUsernameLabel);
        SystemUSEUsernameLabel.setBounds(150, 73, 144, 15);

        SystemUSENameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemUSENameLabel.setText("Name:");
        add(SystemUSENameLabel);
        SystemUSENameLabel.setBounds(150, 205, 144, 15);

        SystemUSERoleLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemUSERoleLabel.setText("Role:");
        add(SystemUSERoleLabel);
        SystemUSERoleLabel.setBounds(158, 338, 144, 15);

        SystemUSELabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SystemUSELabel1.setText("Update Employee Information");
        add(SystemUSELabel1);
        SystemUSELabel1.setBounds(159, 11, 330, 29);

        SystemUSELabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Manage_Emplyee_Final_IMAGE.png"))); // NOI18N
        add(SystemUSELabel);
        SystemUSELabel.setBounds(0, 0, 1410, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void SystemUSEBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemUSEBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainerSUE.remove(this);
        CardLayout layout = (CardLayout) userProcessContainerSUE.getLayout();
        layout.previous(userProcessContainerSUE);
    }//GEN-LAST:event_SystemUSEBackButtonActionPerformed

    private void SystemUSESubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemUSESubmitButtonActionPerformed
        // TODO add your handling code here:
        if(validateThisSUE())
        {
            userSUE.setPassword(SystemUSEPasswordText.getText());
            employeeSUE.setAddress(SystemUSEAddressText.getText());
            employeeSUE.setPhone((SystemUSEPhoneNumberText.getText()));
            JOptionPane.showMessageDialog(null, "Details for " + employeeSUE.getName()+ " updated successfully!");
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_SystemUSESubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SystemUSEAddressLabel;
    private javax.swing.JTextField SystemUSEAddressText;
    private javax.swing.JButton SystemUSEBackButton;
    private javax.swing.JLabel SystemUSEConfirmPasswordLabel;
    private javax.swing.JTextField SystemUSEConfirmPasswordText;
    private javax.swing.JLabel SystemUSELabel;
    private javax.swing.JLabel SystemUSELabel1;
    private javax.swing.JLabel SystemUSENameLabel;
    private javax.swing.JTextField SystemUSENameText;
    private javax.swing.JLabel SystemUSEPasswordLabel;
    private javax.swing.JTextField SystemUSEPasswordText;
    private javax.swing.JLabel SystemUSEPhoneNumberLabel;
    private javax.swing.JTextField SystemUSEPhoneNumberText;
    private javax.swing.JRadioButton SystemUSERadio1;
    private javax.swing.JRadioButton SystemUSERadio2;
    private javax.swing.JLabel SystemUSERoleLabel;
    private javax.swing.JButton SystemUSESubmitButton;
    private javax.swing.JLabel SystemUSEUsernameLabel;
    private javax.swing.JTextField SystemUSEUsernameText;
    // End of variables declaration//GEN-END:variables


private boolean validateThisSUE() {
        String regex = "\\d{10}";
        if(("".equals(SystemUSEPasswordText.getText())) || ("".equals(SystemUSEConfirmPasswordText.getText())) 
                || ("".equals(SystemUSEPhoneNumberText.getText())) || ("".equals(SystemUSEAddressText.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(SystemUSEPasswordText.getText().equals(SystemUSEConfirmPasswordText.getText())))
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(SystemUSEPhoneNumberText.getText().matches(regex)))
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
