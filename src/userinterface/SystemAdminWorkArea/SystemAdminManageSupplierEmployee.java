/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
//import Business.Role.AdminRole;
import Business.Role.DeliveryManRole;
import Business.Role.SupplierDeliveryManRole;
import Business.Role.SupplierAdminRole;
import Business.Supplier.Supplier;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vini
 */
public class SystemAdminManageSupplierEmployee extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminManageSupplierEmployee
     */
     private JPanel userProcessContainer;
    private Supplier supplier;
        private String user;

    private EcoSystem ecosystem;
    public SystemAdminManageSupplierEmployee(JPanel userProcessContainer, Supplier supplier, EcoSystem ecosystem) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        this.ecosystem = ecosystem;
        txtUsernameSME.setEnabled(false);
        txtPasswordSME.setEnabled(false);
        txtRePasswordSME.setEnabled(false);
        txtNameSME.setEnabled(false);
        txtPhoneSME.setEnabled(false);
        txtAddressSME.setEnabled(false);
        BtnSubmit.setEnabled(false);
        BtnDelete.setEnabled(false);
        BtnView.setEnabled(false);
        radioBtnDeliverySME.setEnabled(false);
        radioBtnManagerSME.setEnabled(false);
        populateSupplierEmpTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnBack = new javax.swing.JButton();
        BtnView = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnCreate = new javax.swing.JButton();
        BtnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageSupplierEmp = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtUsernameSME = new javax.swing.JTextField();
        txtPhoneSME = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioBtnDeliverySME = new javax.swing.JRadioButton();
        txtPasswordSME = new javax.swing.JTextField();
        txtRePasswordSME = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAddressSME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        radioBtnManagerSME = new javax.swing.JRadioButton();
        txtNameSME = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        add(BtnBack);
        BtnBack.setBounds(20, 65, 84, 29);

        BtnView.setText("View");
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });
        add(BtnView);
        BtnView.setBounds(20, 112, 84, 29);

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });
        add(BtnDelete);
        BtnDelete.setBounds(20, 152, 84, 29);

        BtnCreate.setText("Create");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });
        add(BtnCreate);
        BtnCreate.setBounds(20, 199, 84, 29);

        BtnSubmit.setText("Submit");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });
        add(BtnSubmit);
        BtnSubmit.setBounds(270, 610, 120, 40);

        tblManageSupplierEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee NO", "Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManageSupplierEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManageSupplierEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManageSupplierEmp);

        add(jScrollPane1);
        jScrollPane1.setBounds(148, 65, 800, 136);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Manage Employee");
        add(jLabel1);
        jLabel1.setBounds(450, 10, 190, 28);
        add(txtUsernameSME);
        txtUsernameSME.setBounds(260, 220, 300, 27);
        add(txtPhoneSME);
        txtPhoneSME.setBounds(260, 400, 300, 27);

        jLabel5.setText("Phone Number:");
        add(jLabel5);
        jLabel5.setBounds(106, 402, 120, 20);

        radioBtnDeliverySME.setText("Delivery Man");
        radioBtnDeliverySME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnDeliverySMEActionPerformed(evt);
            }
        });
        add(radioBtnDeliverySME);
        radioBtnDeliverySME.setBounds(260, 540, 119, 29);
        add(txtPasswordSME);
        txtPasswordSME.setBounds(260, 270, 300, 26);
        add(txtRePasswordSME);
        txtRePasswordSME.setBounds(260, 310, 300, 28);

        jLabel6.setText("        Address:");
        add(jLabel6);
        jLabel6.setBounds(108, 447, 110, 20);

        jLabel2.setText("Username: ");
        add(jLabel2);
        jLabel2.setBounds(150, 220, 100, 25);
        add(txtAddressSME);
        txtAddressSME.setBounds(260, 440, 300, 28);

        jLabel3.setText("Password: ");
        add(jLabel3);
        jLabel3.setBounds(151, 266, 80, 25);

        jLabel7.setText("      Role:");
        add(jLabel7);
        jLabel7.setBounds(145, 501, 70, 20);

        jLabel4.setText("     Name:");
        add(jLabel4);
        jLabel4.setBounds(143, 361, 80, 20);

        jLabel8.setText("Confirm Password:");
        add(jLabel8);
        jLabel8.setBounds(94, 312, 140, 27);

        radioBtnManagerSME.setText("Supplier Manager");
        radioBtnManagerSME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnManagerSMEActionPerformed(evt);
            }
        });
        add(radioBtnManagerSME);
        radioBtnManagerSME.setBounds(260, 500, 155, 19);
        add(txtNameSME);
        txtNameSME.setBounds(260, 350, 300, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Manage_Emplyee_Final_IMAGE.png"))); // NOI18N
        add(jLabel10);
        jLabel10.setBounds(0, 0, 1330, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnDeliverySMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnDeliverySMEActionPerformed
        // TODO add your handling code here:
        radioBtnManagerSME.setSelected(false);
    }//GEN-LAST:event_radioBtnDeliverySMEActionPerformed

    private void radioBtnManagerSMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnManagerSMEActionPerformed
        // TODO add your handling code here:
        radioBtnDeliverySME.setSelected(false);
    }//GEN-LAST:event_radioBtnManagerSMEActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        // TODO add your handling code here:
        if(validateThis())
        {

            Employee e = supplier.getEmployeeDirectory().createEmployee(txtNameSME.getText(), txtAddressSME.getText(), txtPhoneSME.getText());
            if(e == null)
            {
                JOptionPane.showMessageDialog(null,"Employee " + txtNameSME.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                if(radioBtnManagerSME.isSelected())
                {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtUsernameSME.getText(), txtPasswordSME.getText(), e, new SupplierAdminRole());
                    if(ua != null)
                    {
                        JOptionPane.showMessageDialog(null, "Manager account created successfully for " + e.getName());
                    }
                    else
                    {
                        supplier.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null,"Username " + txtUsernameSME.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                else
                {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtUsernameSME.getText(), txtPasswordSME.getText(), e, new SupplierDeliveryManRole());
                    if(ua != null)
                    {
                        SupplierDeliveryMan sdm = supplier.getSupplierDeliveryManDirectory().createSupplierDeliveryMan(txtNameSME.getText(), txtAddressSME.getText(), txtPhoneSME.getText());
                        JOptionPane.showMessageDialog(null, "Delivery Man account created successfully for " + e.getName());
                    }
                    else
                    {
                        supplier.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null,"Username " + txtUsernameSME.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                }
                BtnCreate.setEnabled(true);
                txtUsernameSME.setText("");
                txtUsernameSME.setEnabled(false);
                txtPasswordSME.setText("");
                txtPasswordSME.setEnabled(false);
                txtRePasswordSME.setText("");
                txtRePasswordSME.setEnabled(false);
                txtNameSME.setText("");
                txtNameSME.setEnabled(false);
                txtPhoneSME.setText("");
                txtPhoneSME.setEnabled(false);
                txtAddressSME.setText("");
                txtAddressSME.setEnabled(false);
                BtnSubmit.setEnabled(false);
                radioBtnDeliverySME.setSelected(false);
                radioBtnDeliverySME.setEnabled(false);
                radioBtnManagerSME.setSelected(false);
                radioBtnManagerSME.setEnabled(false);
            }
            populateSupplierEmpTable();
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void tblManageSupplierEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManageSupplierEmpMouseClicked
        // TODO add your handling code here:
        
        int selectedRow = tblManageSupplierEmp.getSelectedRow();
        if (selectedRow >= 0)
        {
            BtnDelete.setEnabled(true);
            BtnView.setEnabled(true);
        }
    }//GEN-LAST:event_tblManageSupplierEmpMouseClicked

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageSupplierEmp.getSelectedRow();
        if (selectedRow >= 0)
        {
            Employee selectedEmployee = (Employee) tblManageSupplierEmp.getValueAt(selectedRow, 1);
            SystemUpdateSupplierEmployee fs = new SystemUpdateSupplierEmployee(userProcessContainer, selectedEmployee, ecosystem);
            userProcessContainer.add("SysUpdateSupplierEmployee", fs);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_BtnViewActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageSupplierEmp.getSelectedRow();
        if (selectedRow >= 0)
        {
            Employee selectedEmployee = (Employee) tblManageSupplierEmp.getValueAt(selectedRow, 1);
            supplier.getEmployeeDirectory().deleteEmployee(selectedEmployee);
            JOptionPane.showMessageDialog(null, "Employee " + selectedEmployee.getName()+ " deleted successfully!");
            populateSupplierEmpTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        // TODO add your handling code here:
        BtnCreate.setEnabled(false);
        txtUsernameSME.setEnabled(true);
        txtPasswordSME.setEnabled(true);
        txtRePasswordSME.setEnabled(true);
        txtNameSME.setEnabled(true);
        txtPhoneSME.setEnabled(true);
        txtAddressSME.setEnabled(true);
        BtnSubmit.setEnabled(true);
        radioBtnDeliverySME.setEnabled(true);
        radioBtnManagerSME.setEnabled(true);
    }//GEN-LAST:event_BtnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JButton BtnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioBtnDeliverySME;
    private javax.swing.JRadioButton radioBtnManagerSME;
    private javax.swing.JTable tblManageSupplierEmp;
    private javax.swing.JTextField txtAddressSME;
    private javax.swing.JTextField txtNameSME;
    private javax.swing.JTextField txtPasswordSME;
    private javax.swing.JTextField txtPhoneSME;
    private javax.swing.JTextField txtRePasswordSME;
    private javax.swing.JTextField txtUsernameSME;
    // End of variables declaration//GEN-END:variables


private void populateSupplierEmpTable() {
        DefaultTableModel dtm = (DefaultTableModel)tblManageSupplierEmp.getModel();
        dtm.setRowCount(0);
        if(supplier.getEmployeeDirectory().getEmployeeList() != null)
        {
            for(Employee e : supplier.getEmployeeDirectory().getEmployeeList())
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
                BtnDelete.setEnabled(false);
                BtnView.setEnabled(false);
            }
    }

    private boolean validateThis() {
        String regex = "\\d{10}";
        if(("".equals(txtUsernameSME.getText())) || ("".equals(txtPasswordSME.getText())) || ("".equals(txtRePasswordSME.getText())) 
                || ("".equals(txtNameSME.getText())) || ("".equals(txtPhoneSME.getText())) || ("".equals(txtAddressSME.getText()))
                || ((radioBtnDeliverySME.isEnabled() == false) && (radioBtnManagerSME.isEnabled() == false)))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPasswordSME.getText().equals(txtRePasswordSME.getText())))
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPhoneSME.getText().matches(regex)))
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


