/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierDeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Orders.Orders;
import Business.Pharmacy.Pharmacy;
import Business.Supplier.Supplier;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.SupplierOrders.SupplierOrders;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nupoorkorde
 */
public class SupplierDeliveryManWorkArea extends javax.swing.JPanel {
  private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Supplier supplier;
    private SupplierDeliveryMan supplierDeliveryMan;
    /**
     * Creates new form SupplierDeliveryManWorkArea
     */
    public SupplierDeliveryManWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        
        for(Supplier s : business.getSupplierDirectory().getSupplierList())
        {
            if(s.findSupplierDeliveryMan(account.getEmployee().getName()) != null)
            {
                this.supplierDeliveryMan = s.findSupplierDeliveryMan(account.getEmployee().getName());
                this.supplier = s;
                break;
            }
        }
        SupplierDMWALabel1.setText("Orders to be delivered by " + this.supplierDeliveryMan);
        
//        if(workRequestJTable.getRowCount() > 0)
//        {
            populateTable();
//        }
    }
    public void populateTable(){
        if(supplier.getSupplierOrderDirectory() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel)SupplierDMWATable.getModel();
            dtm.setRowCount(0);
            for(SupplierOrders so : supplier.getSupplierOrderDirectory().getSupplierOrderList())
            {
                if(so.getSupplierDeliveryMan().equals(supplierDeliveryMan))
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = so;
                    row[1] = so.getTotalAmount();
                    row[2] = so.getMessage();
                    row[3] = so.getSupplierDeliveryMan();
                    if(so.isStatus())
                    {
                        row[4] = "Yes";
                    }
                    else
                    {
                        row[4] = "No";
                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[5] = so.getOrderDate().format(formatter);
                    dtm.addRow(row);
                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierDMWATable = new javax.swing.JTable();
        SupplierDMWALabel1 = new javax.swing.JLabel();
        SupplierDMWAProcessButton = new javax.swing.JButton();
        SupplierDMWARefreshButton = new javax.swing.JButton();
        SupplierDMWALabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        SupplierDMWATable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SupplierDMWATable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Price", "Message", "Delivery Man", "Delivered?", "Order Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(SupplierDMWATable);

        add(jScrollPane1);
        jScrollPane1.setBounds(126, 176, 910, 100);

        SupplierDMWALabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierDMWALabel1.setText("<>");
        add(SupplierDMWALabel1);
        SupplierDMWALabel1.setBounds(88, 68, 400, 20);

        SupplierDMWAProcessButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SupplierDMWAProcessButton.setText("Process");
        SupplierDMWAProcessButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SupplierDMWAProcessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierDMWAProcessButtonActionPerformed(evt);
            }
        });
        add(SupplierDMWAProcessButton);
        SupplierDMWAProcessButton.setBounds(926, 294, 110, 50);

        SupplierDMWARefreshButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SupplierDMWARefreshButton.setText("Refresh");
        SupplierDMWARefreshButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SupplierDMWARefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierDMWARefreshButtonActionPerformed(evt);
            }
        });
        add(SupplierDMWARefreshButton);
        SupplierDMWARefreshButton.setBounds(946, 128, 90, 30);

        SupplierDMWALabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MicrosoftTeams-image (4).png"))); // NOI18N
        add(SupplierDMWALabel);
        SupplierDMWALabel.setBounds(0, 80, 1080, 700);
    }// </editor-fold>//GEN-END:initComponents

    private void SupplierDMWAProcessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierDMWAProcessButtonActionPerformed

        int selectedRow = SupplierDMWATable.getSelectedRow();
        if (selectedRow >= 0)
        {
            if((SupplierDMWATable.getValueAt(selectedRow, 1)) == null)
            {
                JOptionPane.showMessageDialog(null,"Order is not live anymore!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                SupplierOrders so = (SupplierOrders) SupplierDMWATable.getValueAt(selectedRow, 0);
                SupplierProcessDeliveryWorkArea fs = new SupplierProcessDeliveryWorkArea(userProcessContainer, so);
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
    }//GEN-LAST:event_SupplierDMWAProcessButtonActionPerformed

    private void SupplierDMWARefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierDMWARefreshButtonActionPerformed
        if(SupplierDMWATable.getRowCount() > 0)
        {
            populateTable();
            JOptionPane.showMessageDialog(null, "Table refreshed!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nothing to refresh!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_SupplierDMWARefreshButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SupplierDMWALabel;
    private javax.swing.JLabel SupplierDMWALabel1;
    private javax.swing.JButton SupplierDMWAProcessButton;
    private javax.swing.JButton SupplierDMWARefreshButton;
    private javax.swing.JTable SupplierDMWATable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}