/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Pharmacy.Pharmacy;
import Business.Role.AdminRole;

import Business.Role.DeliveryManRole;
import Business.SupplierEmp.SupplierEmp;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nupoorkorde
 */
public class SystemManageEmployees extends javax.swing.JPanel {

    /**
     * Creates new form SystemManageEmployees
     */
    private JPanel userProcessContainer;
    private Pharmacy pharmacy;
    private EcoSystem ecosystem;
    public SystemManageEmployees(JPanel userProcessContainer, Pharmacy pharmacy, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.pharmacy = pharmacy;
        this.ecosystem = ecosystem;
        SystemMEUsernameText.setEnabled(false);
        SystemMEPasswordText.setEnabled(false);
        SystemMEConfirmPasswordText.setEnabled(false);
        SystemMENameText.setEnabled(false);
        SystemMEPhoneNumberText.setEnabled(false);
        SystemMEAddressText.setEnabled(false);
        SystemMESubmitButton.setEnabled(false);
        SystemMEDeleteButton.setEnabled(false);
        SystemMEViewButton.setEnabled(false);
        SystemMERadio2.setEnabled(false);
        SystemMERadio1.setEnabled(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        SystemMEPhoneNumberLabel = new javax.swing.JLabel();
        SystemMEConfirmPasswordText = new javax.swing.JTextField();
        SystemMEAddressLabel = new javax.swing.JLabel();
        SystemMEUsernameLabel = new javax.swing.JLabel();
        SystemMEAddressText = new javax.swing.JTextField();
        SystemMEPasswordLabel = new javax.swing.JLabel();
        SystemMERoleLabel = new javax.swing.JLabel();
        SystemMEConfirmPassowordLabel = new javax.swing.JLabel();
        SystemMERadio1 = new javax.swing.JRadioButton();
        SystemMEBackButton = new javax.swing.JButton();
        SystemMESubmitButton = new javax.swing.JButton();
        SystemMERadio2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SystemMETable = new javax.swing.JTable();
        SystemMEViewButton = new javax.swing.JButton();
        SystemMELabel1 = new javax.swing.JLabel();
        SystemMEDeleteButton = new javax.swing.JButton();
        SystemMENameLabel = new javax.swing.JLabel();
        SystemMECreateButton = new javax.swing.JButton();
        SystemMENameText = new javax.swing.JTextField();
        SystemMEUsernameText = new javax.swing.JTextField();
        SystemMEPhoneNumberText = new javax.swing.JTextField();
        SystemMEPasswordText = new javax.swing.JTextField();
        SystemMELabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setLayout(null);

        SystemMEPhoneNumberLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemMEPhoneNumberLabel.setText("Phone Number:");
        add(SystemMEPhoneNumberLabel);
        SystemMEPhoneNumberLabel.setBounds(170, 334, 144, 15);

        SystemMEConfirmPasswordText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemMEConfirmPasswordText);
        SystemMEConfirmPasswordText.setBounds(318, 261, 200, 18);

        SystemMEAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemMEAddressLabel.setText("Address:");
        add(SystemMEAddressLabel);
        SystemMEAddressLabel.setBounds(170, 378, 144, 15);

        SystemMEUsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemMEUsernameLabel.setText("Username: ");
        add(SystemMEUsernameLabel);
        SystemMEUsernameLabel.setBounds(170, 193, 144, 25);

        SystemMEAddressText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemMEAddressText);
        SystemMEAddressText.setBounds(318, 375, 200, 18);

        SystemMEPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemMEPasswordLabel.setText("Password: ");
        add(SystemMEPasswordLabel);
        SystemMEPasswordLabel.setBounds(170, 230, 144, 25);

        SystemMERoleLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemMERoleLabel.setText("Role:");
        add(SystemMERoleLabel);
        SystemMERoleLabel.setBounds(170, 412, 144, 15);

        SystemMEConfirmPassowordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemMEConfirmPassowordLabel.setText("Confirm Password:");
        add(SystemMEConfirmPassowordLabel);
        SystemMEConfirmPassowordLabel.setBounds(170, 261, 144, 27);

        buttonGroup1.add(SystemMERadio1);
        SystemMERadio1.setText("Pharmacy Manager");
        SystemMERadio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemMERadio1ActionPerformed(evt);
            }
        });
        add(SystemMERadio1);
        SystemMERadio1.setBounds(318, 419, 200, 19);

        SystemMEBackButton.setText("< Back");
        SystemMEBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemMEBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemMEBackButtonActionPerformed(evt);
            }
        });
        add(SystemMEBackButton);
        SystemMEBackButton.setBounds(10, 249, 42, 22);

        SystemMESubmitButton.setText("Submit");
        SystemMESubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemMESubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemMESubmitButtonActionPerformed(evt);
            }
        });
        add(SystemMESubmitButton);
        SystemMESubmitButton.setBounds(318, 503, 200, 44);

        buttonGroup1.add(SystemMERadio2);
        SystemMERadio2.setText("Delivery Man");
        SystemMERadio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemMERadio2ActionPerformed(evt);
            }
        });
        add(SystemMERadio2);
        SystemMERadio2.setBounds(318, 456, 200, 21);

        SystemMETable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee No.", "Employee Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SystemMETable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SystemMETableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SystemMETable);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 84, 740, 97);

        SystemMEViewButton.setText("View Employee ");
        SystemMEViewButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemMEViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemMEViewButtonActionPerformed(evt);
            }
        });
        add(SystemMEViewButton);
        SystemMEViewButton.setBounds(10, 84, 131, 42);

        SystemMELabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SystemMELabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SystemMELabel1.setText("Manage Employees");
        add(SystemMELabel1);
        SystemMELabel1.setBounds(101, 18, 445, 29);

        SystemMEDeleteButton.setText("Delete Employee");
        SystemMEDeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemMEDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemMEDeleteButtonActionPerformed(evt);
            }
        });
        add(SystemMEDeleteButton);
        SystemMEDeleteButton.setBounds(10, 137, 131, 44);

        SystemMENameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemMENameLabel.setText("Name:");
        add(SystemMENameLabel);
        SystemMENameLabel.setBounds(170, 297, 144, 15);

        SystemMECreateButton.setText("Create Employee ");
        SystemMECreateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemMECreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemMECreateButtonActionPerformed(evt);
            }
        });
        add(SystemMECreateButton);
        SystemMECreateButton.setBounds(10, 192, 98, 46);

        SystemMENameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemMENameText);
        SystemMENameText.setBounds(318, 294, 200, 18);

        SystemMEUsernameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemMEUsernameText);
        SystemMEUsernameText.setBounds(318, 192, 200, 25);

        SystemMEPhoneNumberText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemMEPhoneNumberText);
        SystemMEPhoneNumberText.setBounds(318, 331, 200, 18);

        SystemMEPasswordText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(SystemMEPasswordText);
        SystemMEPasswordText.setBounds(318, 229, 200, 18);

        SystemMELabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemMELabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Manage_Emplyee_Final_IMAGE.png"))); // NOI18N
        add(SystemMELabel);
        SystemMELabel.setBounds(0, 0, 1230, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void SystemMERadio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemMERadio1ActionPerformed
        // TODO add your handling code here:
        SystemMERadio2.setSelected(false);
    }//GEN-LAST:event_SystemMERadio1ActionPerformed

    private void SystemMEBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemMEBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_SystemMEBackButtonActionPerformed

    private void SystemMESubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemMESubmitButtonActionPerformed
        // TODO add your handling code here:
        if(validateThis())
        {
                       // SupplierEmp se = ecosystem.getSupplierEmpDirectory().createSupplierEmp(txtNameSME.getText(), txtAddressSME.getText(), txtPhoneSME.getText());

            Employee e = pharmacy.getEmployeeDirectory().createEmployee(SystemMENameText.getText(), SystemMEAddressText.getText(), SystemMEPhoneNumberText.getText());
            if(e == null)
            {
                JOptionPane.showMessageDialog(null,"Employee " + SystemMENameText.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                if(SystemMERadio1.isSelected())
                {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(SystemMEUsernameText.getText(), SystemMEPasswordText.getText(), e, new AdminRole());
                    if(ua != null)
                    {
                        JOptionPane.showMessageDialog(null, "Manager account created successfully for " + e.getName());
                    }
                    else
                    {
                        pharmacy.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null,"Username " + SystemMEUsernameText.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                else
                {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(SystemMEUsernameText.getText(), SystemMEPasswordText.getText(), e, new DeliveryManRole());
                    if(ua != null)
                    {
                        DeliveryMan dm = pharmacy.getDeliveryManDirectory().createDeliveryMan(SystemMENameText.getText(), SystemMEAddressText.getText(), SystemMEPhoneNumberText.getText());
                        JOptionPane.showMessageDialog(null, "Delivery Man account created successfully for " + e.getName());
                    }
                    else
                    {
                        pharmacy.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null,"Username " + SystemMEUsernameText.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                }
                SystemMECreateButton.setEnabled(true);
                SystemMEUsernameText.setText("");
                SystemMEUsernameText.setEnabled(false);
                SystemMEPasswordText.setText("");
                SystemMEPasswordText.setEnabled(false);
                SystemMEConfirmPasswordText.setText("");
                SystemMEConfirmPasswordText.setEnabled(false);
                SystemMENameText.setText("");
                SystemMENameText.setEnabled(false);
                SystemMEPhoneNumberText.setText("");
                SystemMEPhoneNumberText.setEnabled(false);
                SystemMEAddressText.setText("");
                SystemMEAddressText.setEnabled(false);
                SystemMESubmitButton.setEnabled(false);
                SystemMERadio2.setSelected(false);
                SystemMERadio2.setEnabled(false);
                SystemMERadio1.setSelected(false);
                SystemMERadio1.setEnabled(false);
            }
            populateTable();
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_SystemMESubmitButtonActionPerformed

    private void SystemMERadio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemMERadio2ActionPerformed
        // TODO add your handling code here:
        SystemMERadio1.setSelected(false);
    }//GEN-LAST:event_SystemMERadio2ActionPerformed

    private void SystemMETableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SystemMETableMouseClicked
        // TODO add your handling code here:
        int selectedRow = SystemMETable.getSelectedRow();
        if (selectedRow >= 0)
        {
            SystemMEDeleteButton.setEnabled(true);
            SystemMEViewButton.setEnabled(true);
        }
    }//GEN-LAST:event_SystemMETableMouseClicked

    private void SystemMEViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemMEViewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = SystemMETable.getSelectedRow();
        if (selectedRow >= 0)
        {
            Employee selectedEmployee = (Employee) SystemMETable.getValueAt(selectedRow, 1);
            SystemUpdateEmployee fs = new SystemUpdateEmployee(userProcessContainer, selectedEmployee, ecosystem);
            userProcessContainer.add("SysAdminUpdateEmployees", fs);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_SystemMEViewButtonActionPerformed

    private void SystemMEDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemMEDeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = SystemMETable.getSelectedRow();
        if (selectedRow >= 0)
        {
            Employee selectedEmployee = (Employee) SystemMETable.getValueAt(selectedRow, 1);
            pharmacy.getEmployeeDirectory().deleteEmployee(selectedEmployee);
            JOptionPane.showMessageDialog(null, "Employee " + selectedEmployee.getName()+ " deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_SystemMEDeleteButtonActionPerformed

    private void SystemMECreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemMECreateButtonActionPerformed
        // TODO add your handling code here:
        SystemMECreateButton.setEnabled(false);
        SystemMEUsernameText.setEnabled(true);
        SystemMEPasswordText.setEnabled(true);
        SystemMEConfirmPasswordText.setEnabled(true);
        SystemMENameText.setEnabled(true);
        SystemMEPhoneNumberText.setEnabled(true);
        SystemMEAddressText.setEnabled(true);
        SystemMESubmitButton.setEnabled(true);
        SystemMERadio2.setEnabled(true);
        SystemMERadio1.setEnabled(true);
    }//GEN-LAST:event_SystemMECreateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SystemMEAddressLabel;
    private javax.swing.JTextField SystemMEAddressText;
    private javax.swing.JButton SystemMEBackButton;
    private javax.swing.JLabel SystemMEConfirmPassowordLabel;
    private javax.swing.JTextField SystemMEConfirmPasswordText;
    private javax.swing.JButton SystemMECreateButton;
    private javax.swing.JButton SystemMEDeleteButton;
    private javax.swing.JLabel SystemMELabel;
    private javax.swing.JLabel SystemMELabel1;
    private javax.swing.JLabel SystemMENameLabel;
    private javax.swing.JTextField SystemMENameText;
    private javax.swing.JLabel SystemMEPasswordLabel;
    private javax.swing.JTextField SystemMEPasswordText;
    private javax.swing.JLabel SystemMEPhoneNumberLabel;
    private javax.swing.JTextField SystemMEPhoneNumberText;
    private javax.swing.JRadioButton SystemMERadio1;
    private javax.swing.JRadioButton SystemMERadio2;
    private javax.swing.JLabel SystemMERoleLabel;
    private javax.swing.JButton SystemMESubmitButton;
    private javax.swing.JTable SystemMETable;
    private javax.swing.JLabel SystemMEUsernameLabel;
    private javax.swing.JTextField SystemMEUsernameText;
    private javax.swing.JButton SystemMEViewButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)SystemMETable.getModel();
        dtm.setRowCount(0);
        if(pharmacy.getEmployeeDirectory().getEmployeeList() != null)
        {
            for(Employee e : pharmacy.getEmployeeDirectory().getEmployeeList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0]= e.getId();
                row[1]= e;
                UserAccount ua = ecosystem.getUserAccountDirectory().findEmployee(e);
                row[2] = ua.getRole().toString().substring(14).replace("Role", "");
                dtm.addRow(row);
            }
        }
        if(dtm.getRowCount() == 0)
            {
                SystemMEDeleteButton.setEnabled(false);
                SystemMEViewButton.setEnabled(false);
            }
    }

    private boolean validateThis() {
        String regex = "\\d{10}";
        if(("".equals(SystemMEUsernameText.getText())) || ("".equals(SystemMEPasswordText.getText())) || ("".equals(SystemMEConfirmPasswordText.getText())) 
                || ("".equals(SystemMENameText.getText())) || ("".equals(SystemMEPhoneNumberText.getText())) || ("".equals(SystemMEAddressText.getText()))
                || ((SystemMERadio2.isEnabled() == false) && (SystemMERadio1.isEnabled() == false)))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(SystemMEPasswordText.getText().equals(SystemMEConfirmPasswordText.getText())))
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(SystemMEPhoneNumberText.getText().matches(regex)))
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
