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
import Business.SupplierEmp.SupplierEmp;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vini
 */
public class SystemAdminManageCustomers extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminManageCustomers
     */
    private JPanel userProcessContainerSAMC;
    private EcoSystem ecosystem;
    
    public SystemAdminManageCustomers(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainerSAMC = userProcessContainer;
        this.ecosystem = ecosystem;
        
        txtUsernameSAMC.setEnabled(false);
        txtPasswordSAMC.setEnabled(false);
        txtRePasswordSAMC.setEnabled(false);
        txtNameSAMC.setEnabled(false);
        txtPhoneSAMC.setEnabled(false);
        txtAddressSAMC.setEnabled(false);
        btnSubmitSAMC.setEnabled(false);
        btnDeleteSAMC.setEnabled(false);
        btnManageSAMC.setEnabled(false);
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

        btnBackSAMC = new javax.swing.JButton();
        btnSubmitSAMC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfile = new javax.swing.JTable();
        btnManageSAMC = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnDeleteSAMC = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnNewCustomerSAMC = new javax.swing.JButton();
        txtNameSAMC = new javax.swing.JTextField();
        txtUsernameSAMC = new javax.swing.JTextField();
        txtPhoneSAMC = new javax.swing.JTextField();
        txtPasswordSAMC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRePasswordSAMC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAddressSAMC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnBackSAMC.setBackground(new java.awt.Color(255, 255, 255));
        btnBackSAMC.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBackSAMC.setText("< Back");
        btnBackSAMC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBackSAMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackSAMCActionPerformed(evt);
            }
        });
        add(btnBackSAMC);
        btnBackSAMC.setBounds(10, 24, 61, 23);

        btnSubmitSAMC.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmitSAMC.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSubmitSAMC.setText("Submit");
        btnSubmitSAMC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmitSAMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitSAMCActionPerformed(evt);
            }
        });
        add(btnSubmitSAMC);
        btnSubmitSAMC.setBounds(423, 477, 259, 40);

        tblProfile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblProfile.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No.", "Customer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfileMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProfile);

        add(jScrollPane1);
        jScrollPane1.setBounds(205, 79, 1030, 133);

        btnManageSAMC.setBackground(new java.awt.Color(255, 255, 255));
        btnManageSAMC.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnManageSAMC.setText("View Customer ");
        btnManageSAMC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageSAMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSAMCActionPerformed(evt);
            }
        });
        add(btnManageSAMC);
        btnManageSAMC.setBounds(10, 80, 140, 59);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Customers");
        add(lblTitle);
        lblTitle.setBounds(185, 18, 445, 29);

        btnDeleteSAMC.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteSAMC.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDeleteSAMC.setText("Delete Customer");
        btnDeleteSAMC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteSAMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSAMCActionPerformed(evt);
            }
        });
        add(btnDeleteSAMC);
        btnDeleteSAMC.setBounds(10, 150, 140, 58);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Name:");
        add(jLabel4);
        jLabel4.setBounds(214, 362, 176, 14);

        btnNewCustomerSAMC.setBackground(new java.awt.Color(255, 255, 255));
        btnNewCustomerSAMC.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnNewCustomerSAMC.setText("Create Customer");
        btnNewCustomerSAMC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNewCustomerSAMC.setOpaque(false);
        btnNewCustomerSAMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCustomerSAMCActionPerformed(evt);
            }
        });
        add(btnNewCustomerSAMC);
        btnNewCustomerSAMC.setBounds(10, 230, 140, 54);

        txtNameSAMC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNameSAMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNameSAMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameSAMCActionPerformed(evt);
            }
        });
        add(txtNameSAMC);
        txtNameSAMC.setBounds(423, 354, 259, 31);

        txtUsernameSAMC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtUsernameSAMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtUsernameSAMC);
        txtUsernameSAMC.setBounds(423, 230, 259, 32);

        txtPhoneSAMC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPhoneSAMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPhoneSAMC);
        txtPhoneSAMC.setBounds(423, 391, 259, 30);

        txtPasswordSAMC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPasswordSAMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPasswordSAMC);
        txtPasswordSAMC.setBounds(423, 273, 259, 38);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Phone Number:");
        add(jLabel5);
        jLabel5.setBounds(214, 391, 176, 30);

        txtRePasswordSAMC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRePasswordSAMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtRePasswordSAMC);
        txtRePasswordSAMC.setBounds(423, 317, 259, 31);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Address:");
        add(jLabel6);
        jLabel6.setBounds(214, 427, 176, 31);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Username: ");
        add(jLabel1);
        jLabel1.setBounds(214, 230, 168, 32);

        txtAddressSAMC.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAddressSAMC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAddressSAMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressSAMCActionPerformed(evt);
            }
        });
        add(txtAddressSAMC);
        txtAddressSAMC.setBounds(423, 427, 259, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Password: ");
        add(jLabel2);
        jLabel2.setBounds(214, 273, 176, 38);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Confirm Password:");
        add(jLabel3);
        jLabel3.setBounds(214, 317, 176, 31);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1);
        jSeparator1.setBounds(168, 11, 13, 506);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Manage_Customer.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(10, 20, 1240, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackSAMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackSAMCActionPerformed
        // TODO add your handling code here:
        userProcessContainerSAMC.remove(this);
        Component[] componentArray = userProcessContainerSAMC.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel dwjp = (SystemAdminWorkAreaJPanel) component;
        //dwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainerSAMC.getLayout();
        layout.previous(userProcessContainerSAMC);
    }//GEN-LAST:event_btnBackSAMCActionPerformed

    private void btnSubmitSAMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitSAMCActionPerformed
        // TODO add your handling code here:
        if(validateThisSAMC())
        {
            Employee e = ecosystem.getEmployeeDirectory().createEmployee(txtNameSAMC.getText(), txtAddressSAMC.getText(), txtPhoneSAMC.getText());
           // SupplierEmp se = ecosystem.getSupplierEmpDirectory().createSupplierEmp(txtNameSAMC.getText(), txtAddressSAMC.getText(), txtPhoneSAMC.getText());

            UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtUsernameSAMC.getText(), txtPasswordSAMC.getText(), e, new CustomerRole());
            if(ua != null)
            {
                Customer c = ecosystem.getCustomerDirectory().createCustomer(txtNameSAMC.getText(), txtAddressSAMC.getText(), txtPhoneSAMC.getText());
                JOptionPane.showMessageDialog(null, "Customer account created successfully for " + c.getCustomerName());
                populateTable();
                btnNewCustomerSAMC.setEnabled(true);
                txtUsernameSAMC.setText("");
                txtUsernameSAMC.setEnabled(false);
                txtPasswordSAMC.setText("");
                txtPasswordSAMC.setEnabled(false);
                txtRePasswordSAMC.setText("");
                txtRePasswordSAMC.setEnabled(false);
                txtNameSAMC.setText("");
                txtNameSAMC.setEnabled(false);
                txtPhoneSAMC.setText("");
                txtPhoneSAMC.setEnabled(false);
                txtAddressSAMC.setText("");
                txtAddressSAMC.setEnabled(false);
                btnSubmitSAMC.setEnabled(false);
            }
            else
            {
                ecosystem.getEmployeeDirectory().deleteEmployee(e);
                JOptionPane.showMessageDialog(null,"Username " + txtUsernameSAMC.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_btnSubmitSAMCActionPerformed

    private void tblProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfileMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblProfile.getSelectedRow();
        if (selectedRow >= 0)
        {
            btnDeleteSAMC.setEnabled(true);
            btnManageSAMC.setEnabled(true);
        }
    }//GEN-LAST:event_tblProfileMouseClicked

    private void btnManageSAMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSAMCActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProfile.getSelectedRow();
        if (selectedRow >= 0)
        {
            Customer selectedCustomer = (Customer) tblProfile.getValueAt(selectedRow, 1);
            SystemAdminUpdateCustomer fs = new SystemAdminUpdateCustomer(userProcessContainerSAMC, selectedCustomer, ecosystem);
            userProcessContainerSAMC.add("SysAdminUpdateEmployees", fs);
            CardLayout layout = (CardLayout) userProcessContainerSAMC.getLayout();
            layout.next(userProcessContainerSAMC);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnManageSAMCActionPerformed

    private void btnDeleteSAMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSAMCActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProfile.getSelectedRow();
        if (selectedRow >= 0)
        {
            Customer selectedCustomer = (Customer) tblProfile.getValueAt(selectedRow, 1);
            ecosystem.getCustomerDirectory().deleteCustomer(selectedCustomer);
            JOptionPane.showMessageDialog(null, "Customer " + selectedCustomer.getCustomerName()+ " deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeleteSAMCActionPerformed

    private void btnNewCustomerSAMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCustomerSAMCActionPerformed
        // TODO add your handling code here:
        btnNewCustomerSAMC.setEnabled(false);
        txtUsernameSAMC.setEnabled(true);
        txtPasswordSAMC.setEnabled(true);
        txtRePasswordSAMC.setEnabled(true);
        txtNameSAMC.setEnabled(true);
        txtPhoneSAMC.setEnabled(true);
        txtAddressSAMC.setEnabled(true);
        btnSubmitSAMC.setEnabled(true);
        btnDeleteSAMC.setEnabled(true);
        btnManageSAMC.setEnabled(true);
    }//GEN-LAST:event_btnNewCustomerSAMCActionPerformed

    private void txtAddressSAMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressSAMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressSAMCActionPerformed

    private void txtNameSAMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSAMCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSAMCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackSAMC;
    private javax.swing.JButton btnDeleteSAMC;
    private javax.swing.JButton btnManageSAMC;
    private javax.swing.JButton btnNewCustomerSAMC;
    private javax.swing.JButton btnSubmitSAMC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblProfile;
    private javax.swing.JTextField txtAddressSAMC;
    private javax.swing.JTextField txtNameSAMC;
    private javax.swing.JTextField txtPasswordSAMC;
    private javax.swing.JTextField txtPhoneSAMC;
    private javax.swing.JTextField txtRePasswordSAMC;
    private javax.swing.JTextField txtUsernameSAMC;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtmSAMC = (DefaultTableModel)tblProfile.getModel();
        dtmSAMC.setRowCount(0);
        if(ecosystem.getCustomerDirectory().getCustomerList() != null)
        {
            for(Customer c: ecosystem.getCustomerDirectory().getCustomerList())
            {
                Object[] row = new Object[dtmSAMC.getColumnCount()];
                row[0]= c.getId();
                row[1]= c;
                dtmSAMC.addRow(row);
            }
        }
        if(dtmSAMC.getRowCount() == 0)
            {
                btnDeleteSAMC.setEnabled(false);
                btnManageSAMC.setEnabled(false);
            }
    }

    private boolean validateThisSAMC() {
        String regex = "\\d{10}";
        if(("".equals(txtUsernameSAMC.getText())) || ("".equals(txtPasswordSAMC.getText())) || ("".equals(txtRePasswordSAMC.getText())) 
                || ("".equals(txtNameSAMC.getText())) || ("".equals(txtPhoneSAMC.getText())) || ("".equals(txtAddressSAMC.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPasswordSAMC.getText().equals(txtRePasswordSAMC.getText())))
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPhoneSAMC.getText().matches(regex)))
        {
            JOptionPane.showMessageDialog(null,"Mobile no. can have only 10 digits!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
}
