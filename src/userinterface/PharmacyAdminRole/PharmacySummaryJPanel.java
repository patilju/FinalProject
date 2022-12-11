
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyAdminRole;

import Business.EcoSystem;
import Business.Pharmacy.Pharmacy;
import Business.Supplier.Supplier;
import Business.SupplierMedicineItem.SupplierMedicineItem;
import Business.SupplierOrders.SupplierOrders;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhrit
 */
public class PharmacySummaryJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;

    private UserAccount user;
    private Pharmacy pharmacy;
    private EcoSystem system;
    /**
     * Creates new form PharmacySummaryJPanel
     */
    public PharmacySummaryJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Pharmacy pharmacy) {
        initComponents();
        this.userProcessContainer = userProcessContainer;     
        this.user = account;
        this.system = system;
        System.out.println(system.getPharmacyDirectory().getPharmacyList());
        this.pharmacy = pharmacy;
        PharmacySLabel1.setText(this.pharmacy + "'s orders");
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        PharmacySAddButton = new javax.swing.JButton();
        PharmacySRefreshButton = new javax.swing.JButton();
        PharmacySLabel1 = new javax.swing.JLabel();
        PharmacySBackButton = new javax.swing.JButton();
        PharmacySLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Order From", "Total Amount", "Message", "Delivery Man", "Delivered?", "Order Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 148, 1430, 110);

        PharmacySAddButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacySAddButton.setText("Add Message >");
        PharmacySAddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacySAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacySAddButtonActionPerformed(evt);
            }
        });
        add(PharmacySAddButton);
        PharmacySAddButton.setBounds(1235, 300, 200, 50);

        PharmacySRefreshButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacySRefreshButton.setText("Refresh");
        PharmacySRefreshButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacySRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacySRefreshButtonActionPerformed(evt);
            }
        });
        add(PharmacySRefreshButton);
        PharmacySRefreshButton.setBounds(1236, 30, 200, 60);

        PharmacySLabel1.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        PharmacySLabel1.setText("<>");
        add(PharmacySLabel1);
        PharmacySLabel1.setBounds(24, 113, 251, 30);

        PharmacySBackButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacySBackButton.setText("< Back");
        PharmacySBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacySBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacySBackButtonActionPerformed(evt);
            }
        });
        add(PharmacySBackButton);
        PharmacySBackButton.setBounds(10, 282, 180, 60);

        PharmacySLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pharmacy_Summary_Image.jpg"))); // NOI18N
        add(PharmacySLabel);
        PharmacySLabel.setBounds(180, 190, 1420, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacySAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacySAddButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            if((workRequestJTable.getValueAt(selectedRow, 1)) == null)
            {
                JOptionPane.showMessageDialog(null,"Order is not live anymore!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                SupplierOrders so = (SupplierOrders) workRequestJTable.getValueAt(selectedRow, 0);
                PharmacyRequestJPanel fs = new PharmacyRequestJPanel(userProcessContainer, so);
                userProcessContainer.add("SysAdminManageEmployees", fs);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_PharmacySAddButtonActionPerformed

    private void PharmacySRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacySRefreshButtonActionPerformed
        if(workRequestJTable.getRowCount() > 0)
        {
            populateRequestTable();
            JOptionPane.showMessageDialog(null, "Table refreshed!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nothing to refresh!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_PharmacySRefreshButtonActionPerformed

    private void PharmacySBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacySBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_PharmacySBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PharmacySAddButton;
    private javax.swing.JButton PharmacySBackButton;
    private javax.swing.JLabel PharmacySLabel;
    private javax.swing.JLabel PharmacySLabel1;
    private javax.swing.JButton PharmacySRefreshButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
public void populateRequestTable() {
        if(pharmacy.getPastSupplierOrderList() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel)workRequestJTable.getModel();
            dtm.setRowCount(0);
            
            PharmacySRefreshButton.setEnabled(true);
            PharmacySAddButton.setEnabled(true);
            int count = 1;
            for(SupplierOrders so : pharmacy.getPastSupplierOrderList())
            {
                if(system.getSupplierDirectory().getSupplierList() != null)
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = so;
                    for(Supplier s : system.getSupplierDirectory().getSupplierList())
                    {
                        for(SupplierOrders or : s.getSupplierOrderDirectory().getSupplierOrderList())
                        {
                          if(so.equals(or))
                          {
                              row[1] = s;
                          }
                        }
                    }
                    row[2] = so.getTotalAmount();
                    row[3] = so.getMessage();
                    row[4] = so.getSupplierDeliveryMan();
                    if(so.isStatus())
                    {
                        row[5] = "Yes";
                    }
                    else
                    {
                        row[5] = "No";
                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[6] = so.getOrderDate().format(formatter);
                    dtm.addRow(row);
                    count++;
                }
            }
        }
    }
}


=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyAdminRole;

import Business.EcoSystem;
import Business.Pharmacy.Pharmacy;
import Business.Supplier.Supplier;
import Business.SupplierMedicineItem.SupplierMedicineItem;
import Business.SupplierOrders.SupplierOrders;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhrit
 */
public class PharmacySummaryJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;

    private UserAccount user;
    private Pharmacy pharmacy;
    private EcoSystem system;
    /**
     * Creates new form PharmacySummaryJPanel
     */
    public PharmacySummaryJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, Pharmacy pharmacy) {
        initComponents();
        this.userProcessContainer = userProcessContainer;     
        this.user = account;
        this.system = system;
        System.out.println(system.getPharmacyDirectory().getPharmacyList());
        this.pharmacy = pharmacy;
        PharmacySLabel1.setText(this.pharmacy + "'s orders");
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        PharmacySAddButton = new javax.swing.JButton();
        PharmacySRefreshButton = new javax.swing.JButton();
        PharmacySLabel1 = new javax.swing.JLabel();
        PharmacySBackButton = new javax.swing.JButton();
        PharmacySLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Order From", "Total Amount", "Message", "Delivery Man", "Delivered?", "Order Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 148, 1430, 110);

        PharmacySAddButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacySAddButton.setText("Add Message >");
        PharmacySAddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacySAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacySAddButtonActionPerformed(evt);
            }
        });
        add(PharmacySAddButton);
        PharmacySAddButton.setBounds(1235, 300, 200, 50);

        PharmacySRefreshButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacySRefreshButton.setText("Refresh");
        PharmacySRefreshButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacySRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacySRefreshButtonActionPerformed(evt);
            }
        });
        add(PharmacySRefreshButton);
        PharmacySRefreshButton.setBounds(1236, 30, 200, 60);

        PharmacySLabel1.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        PharmacySLabel1.setText("<>");
        add(PharmacySLabel1);
        PharmacySLabel1.setBounds(24, 113, 251, 30);

        PharmacySBackButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacySBackButton.setText("< Back");
        PharmacySBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacySBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacySBackButtonActionPerformed(evt);
            }
        });
        add(PharmacySBackButton);
        PharmacySBackButton.setBounds(10, 282, 180, 60);

        PharmacySLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pharmacy_Summary_Image.jpg"))); // NOI18N
        add(PharmacySLabel);
        PharmacySLabel.setBounds(180, 190, 1420, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacySAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacySAddButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            if((workRequestJTable.getValueAt(selectedRow, 1)) == null)
            {
                JOptionPane.showMessageDialog(null,"Order is not live anymore!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                SupplierOrders so = (SupplierOrders) workRequestJTable.getValueAt(selectedRow, 0);
                PharmacyRequestJPanel fs = new PharmacyRequestJPanel(userProcessContainer, so);
                userProcessContainer.add("SysAdminManageEmployees", fs);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_PharmacySAddButtonActionPerformed

    private void PharmacySRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacySRefreshButtonActionPerformed
        if(workRequestJTable.getRowCount() > 0)
        {
            populateRequestTable();
            JOptionPane.showMessageDialog(null, "Table refreshed!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nothing to refresh!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_PharmacySRefreshButtonActionPerformed

    private void PharmacySBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacySBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_PharmacySBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PharmacySAddButton;
    private javax.swing.JButton PharmacySBackButton;
    private javax.swing.JLabel PharmacySLabel;
    private javax.swing.JLabel PharmacySLabel1;
    private javax.swing.JButton PharmacySRefreshButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
public void populateRequestTable() {
        if(pharmacy.getPastSupplierOrderList() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel)workRequestJTable.getModel();
            dtm.setRowCount(0);
            
            PharmacySRefreshButton.setEnabled(true);
            PharmacySAddButton.setEnabled(true);
            int count = 1;
            for(SupplierOrders so : pharmacy.getPastSupplierOrderList())
            {
                if(system.getSupplierDirectory().getSupplierList() != null)
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = so;
                    for(Supplier s : system.getSupplierDirectory().getSupplierList())
                    {
                        for(SupplierOrders or : s.getSupplierOrderDirectory().getSupplierOrderList())
                        {
                          if(so.equals(or))
                          {
                              row[1] = s;
                          }
                        }
                    }
                    row[2] = so.getTotalAmount();
                    row[3] = so.getMessage();
                    row[4] = so.getSupplierDeliveryMan();
                    if(so.isStatus())
                    {
                        row[5] = "Yes";
                    }
                    else
                    {
                        row[5] = "No";
                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[6] = so.getOrderDate().format(formatter);
                    dtm.addRow(row);
                    count++;
                }
            }
        }
    }
}



