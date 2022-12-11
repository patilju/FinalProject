/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Supplier.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nupoorkorde
 */
public class SystemAdminManageSupplier extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminManageSupplier
     */
    private JPanel userProcessContainerSMR;
    private EcoSystem ecosystem;
    private String user;
    public SystemAdminManageSupplier(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainerSMR = userProcessContainer;
        this.ecosystem = ecosystem;
        this.user = user;
        SystemAMSNameText.setEnabled(false);
        SystemAMSAddressText.setEnabled(false);

        SystemAMSSubmitButton.setEnabled(false);
        SystemAMSDeleteButton.setEnabled(false);
        SystemAMSViewButton.setEnabled(false);
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

        SystemAMSNameText = new javax.swing.JTextField();
        SystemAMSNameLabel = new javax.swing.JLabel();
        SystemAMSAddressLabel = new javax.swing.JLabel();
        SystemAMSLabel1 = new javax.swing.JLabel();
        SystemAMSDeleteButton = new javax.swing.JButton();
        SystemAMSViewButton = new javax.swing.JButton();
        SystemAMSCreateButton = new javax.swing.JButton();
        SystemAMSBackButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SystemAMSTable = new javax.swing.JTable();
        SystemAMSSubmitButton = new javax.swing.JButton();
        SystemAMSAddressText = new javax.swing.JTextField();
        SystemAMSLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);
        add(SystemAMSNameText);
        SystemAMSNameText.setBounds(336, 179, 228, 22);

        SystemAMSNameLabel.setText("Supplier Name:");
        add(SystemAMSNameLabel);
        SystemAMSNameLabel.setBounds(188, 183, 144, 18);

        SystemAMSAddressLabel.setText("Address:");
        add(SystemAMSAddressLabel);
        SystemAMSAddressLabel.setBounds(188, 245, 144, 16);

        SystemAMSLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SystemAMSLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SystemAMSLabel1.setText("Manage Supplier");
        add(SystemAMSLabel1);
        SystemAMSLabel1.setBounds(123, 18, 445, 29);

        SystemAMSDeleteButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMSDeleteButton.setText("Delete");
        SystemAMSDeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemAMSDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMSDeleteButtonActionPerformed(evt);
            }
        });
        add(SystemAMSDeleteButton);
        SystemAMSDeleteButton.setBounds(21, 179, 41, 21);

        SystemAMSViewButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMSViewButton.setText("View");
        SystemAMSViewButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemAMSViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMSViewButtonActionPerformed(evt);
            }
        });
        add(SystemAMSViewButton);
        SystemAMSViewButton.setBounds(18, 132, 80, 21);

        SystemAMSCreateButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMSCreateButton.setText("Create");
        SystemAMSCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMSCreateButtonActionPerformed(evt);
            }
        });
        add(SystemAMSCreateButton);
        SystemAMSCreateButton.setBounds(21, 226, 72, 22);

        SystemAMSBackButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMSBackButton.setText("Back");
        SystemAMSBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemAMSBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMSBackButtonActionPerformed(evt);
            }
        });
        add(SystemAMSBackButton);
        SystemAMSBackButton.setBounds(18, 92, 80, 21);

        SystemAMSTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Serial No", "Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SystemAMSTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SystemAMSTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(SystemAMSTable);

        add(jScrollPane2);
        jScrollPane2.setBounds(188, 65, 500, 96);

        SystemAMSSubmitButton.setText("Submit");
        SystemAMSSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMSSubmitButtonActionPerformed(evt);
            }
        });
        add(SystemAMSSubmitButton);
        SystemAMSSubmitButton.setBounds(353, 279, 72, 23);
        add(SystemAMSAddressText);
        SystemAMSAddressText.setBounds(336, 242, 236, 22);

        SystemAMSLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MicrosoftTeams-image (14).png"))); // NOI18N
        add(SystemAMSLabel);
        SystemAMSLabel.setBounds(180, 150, 740, 340);
    }// </editor-fold>//GEN-END:initComponents

    private void SystemAMSDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMSDeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowSAMR = SystemAMSTable.getSelectedRow();
        if (selectedRowSAMR >= 0)
        {
            Supplier selectedSupplier = (Supplier) SystemAMSTable.getValueAt(selectedRowSAMR, 1);
            ecosystem.getSupplierDirectory().deleteSupplier(selectedSupplier);
            JOptionPane.showMessageDialog(null, "Supplier " + selectedSupplier.getSupplierName()+ " deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_SystemAMSDeleteButtonActionPerformed

    private void SystemAMSCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMSCreateButtonActionPerformed
        // TODO add your handling code here:
        SystemAMSCreateButton.setEnabled(false);
        SystemAMSNameText.setEnabled(true);
        SystemAMSAddressText.setEnabled(true);
        SystemAMSSubmitButton.setEnabled(true);
    }//GEN-LAST:event_SystemAMSCreateButtonActionPerformed

    private void SystemAMSSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMSSubmitButtonActionPerformed
        // TODO add your handling code here:
        Supplier s = ecosystem.getSupplierDirectory().createSupplier(SystemAMSNameText.getText(), SystemAMSAddressText.getText());
        if(s == null)
        {
            JOptionPane.showMessageDialog(null,"Supplier " + SystemAMSNameText.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Supplier created successfully as " + s.getSupplierName());
            SystemAMSCreateButton.setEnabled(true);
            SystemAMSNameText.setEnabled(false);
            SystemAMSAddressText.setEnabled(false);
            SystemAMSSubmitButton.setEnabled(false);
            SystemAMSNameText.setText("");
            SystemAMSAddressText.setText("");
        }
        populateTable();
    }//GEN-LAST:event_SystemAMSSubmitButtonActionPerformed

    private void SystemAMSViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMSViewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = SystemAMSTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            Supplier selectedSupplier = (Supplier) SystemAMSTable.getValueAt(selectedRow, 1);
            SystemAdminManageSupplierEmployee se = new SystemAdminManageSupplierEmployee(userProcessContainerSMR, selectedSupplier, ecosystem);
            userProcessContainerSMR.add("SysAdminManageEmployees", se);
            CardLayout layout = (CardLayout) userProcessContainerSMR.getLayout();
            layout.next(userProcessContainerSMR);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_SystemAMSViewButtonActionPerformed

    private void SystemAMSBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMSBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainerSMR.remove(this);
        Component[] componentArray = userProcessContainerSMR.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel dwjp = (SystemAdminWorkAreaJPanel) component;
        //dwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainerSMR.getLayout();
        layout.previous(userProcessContainerSMR);
    }//GEN-LAST:event_SystemAMSBackButtonActionPerformed

    private void SystemAMSTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SystemAMSTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = SystemAMSTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            SystemAMSDeleteButton.setEnabled(true);
            SystemAMSViewButton.setEnabled(true);
        }
    }//GEN-LAST:event_SystemAMSTableMouseClicked

                                       


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SystemAMSAddressLabel;
    private javax.swing.JTextField SystemAMSAddressText;
    private javax.swing.JButton SystemAMSBackButton;
    private javax.swing.JButton SystemAMSCreateButton;
    private javax.swing.JButton SystemAMSDeleteButton;
    private javax.swing.JLabel SystemAMSLabel;
    private javax.swing.JLabel SystemAMSLabel1;
    private javax.swing.JLabel SystemAMSNameLabel;
    private javax.swing.JTextField SystemAMSNameText;
    private javax.swing.JButton SystemAMSSubmitButton;
    private javax.swing.JTable SystemAMSTable;
    private javax.swing.JButton SystemAMSViewButton;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
 
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)SystemAMSTable.getModel();
        dtm.setRowCount(0);
        int count1 = 1;
        if(ecosystem.getSupplierDirectory().getSupplierList()!= null)
        {
            for(Supplier s : ecosystem.getSupplierDirectory().getSupplierList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = s.getSupplierId();
                row[1] = s;
                row[2] = s.getSupplierAddress();
                dtm.addRow(row);
                count1++;
            }
        }
        else
        {
            SystemAMSTable.setEnabled(false);
        }
    }
}
