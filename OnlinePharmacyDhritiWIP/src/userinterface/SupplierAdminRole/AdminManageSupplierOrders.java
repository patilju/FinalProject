/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierAdminRole;


import Business.Supplier.Supplier;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.SupplierOrders.SupplierOrders;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhrit
 */
public class AdminManageSupplierOrders extends javax.swing.JPanel {

    /**
     * Creates new form AdminManageSupplierOrders
     */
    JPanel userProcessContainer;
    Supplier supplier;
    public AdminManageSupplierOrders(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        SupplierAdminAMSOAssignButton.setEnabled(false);
        SupplierAdminAMSOCombo.setEnabled(false);
       
        SupplierAdminAMSOLabel3.setText(supplier.getName());
        populateTable();
        SupplierAdminAMSOCombo.addItem("");
        System.out.println(supplier.getSupplierDeliveryManDirectory().getSupplierDeliveryManList().size());
        for(SupplierDeliveryMan sdm : supplier.getSupplierDeliveryManDirectory().getSupplierDeliveryManList())
        {
            System.out.println(sdm.getName());
            SupplierAdminAMSOCombo.addItem(sdm.getName());
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

        jLabel2 = new javax.swing.JLabel();
        SupplierAdminAMSOLabel3 = new javax.swing.JLabel();
        SupplierAdminAMSOLabel2 = new javax.swing.JLabel();
        SupplierAdminAMSOLabel1 = new javax.swing.JLabel();
        SupplierAdminAMSODeleteButton = new javax.swing.JButton();
        SupplierAdminAMSOBackButton = new javax.swing.JButton();
        SupplierAdminAMSOCombo = new javax.swing.JComboBox<>();
        SupplierAdminAMSOAssignButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierAdminAMSOTable = new javax.swing.JTable();
        SupplierAdminAMSOLabel = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MicrosoftTeams-image (17) supplie_Order.png"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        SupplierAdminAMSOLabel3.setBackground(new java.awt.Color(204, 204, 255));
        SupplierAdminAMSOLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SupplierAdminAMSOLabel3.setText("<value>");
        add(SupplierAdminAMSOLabel3);
        SupplierAdminAMSOLabel3.setBounds(740, 10, 320, 40);

        SupplierAdminAMSOLabel2.setBackground(new java.awt.Color(204, 204, 255));
        SupplierAdminAMSOLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SupplierAdminAMSOLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        SupplierAdminAMSOLabel2.setText("Supplier");
        add(SupplierAdminAMSOLabel2);
        SupplierAdminAMSOLabel2.setBounds(360, 0, 310, 50);

        SupplierAdminAMSOLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminAMSOLabel1.setText("                Current Orders");
        add(SupplierAdminAMSOLabel1);
        SupplierAdminAMSOLabel1.setBounds(272, 36, 240, 50);

        SupplierAdminAMSODeleteButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminAMSODeleteButton.setText("Delete");
        SupplierAdminAMSODeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SupplierAdminAMSODeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierAdminAMSODeleteButtonActionPerformed(evt);
            }
        });
        add(SupplierAdminAMSODeleteButton);
        SupplierAdminAMSODeleteButton.setBounds(1099, 273, 220, 60);

        SupplierAdminAMSOBackButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminAMSOBackButton.setText("< Back");
        SupplierAdminAMSOBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SupplierAdminAMSOBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierAdminAMSOBackButtonActionPerformed(evt);
            }
        });
        add(SupplierAdminAMSOBackButton);
        SupplierAdminAMSOBackButton.setBounds(10, 260, 110, 60);

        SupplierAdminAMSOCombo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        add(SupplierAdminAMSOCombo);
        SupplierAdminAMSOCombo.setBounds(560, 280, 159, 43);

        SupplierAdminAMSOAssignButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SupplierAdminAMSOAssignButton.setText("Assign Delivery Man");
        SupplierAdminAMSOAssignButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SupplierAdminAMSOAssignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplierAdminAMSOAssignButtonActionPerformed(evt);
            }
        });
        add(SupplierAdminAMSOAssignButton);
        SupplierAdminAMSOAssignButton.setBounds(1098, 423, 220, 60);

        SupplierAdminAMSOTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SupplierAdminAMSOTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No.", "Customer Name", "Order Date", "Delivery Man"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierAdminAMSOTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierAdminAMSOTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SupplierAdminAMSOTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 84, 1480, 130);

        SupplierAdminAMSOLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MicrosoftTeams-image (17) supplie_Order.png"))); // NOI18N
        add(SupplierAdminAMSOLabel);
        SupplierAdminAMSOLabel.setBounds(0, 70, 1500, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void SupplierAdminAMSODeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierAdminAMSODeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = SupplierAdminAMSOTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            SupplierOrders supplierOrders = (SupplierOrders) SupplierAdminAMSOTable.getValueAt(selectedRow, 0);
            supplier.deleteOrder(supplierOrders);
            JOptionPane.showMessageDialog(null, "Order deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_SupplierAdminAMSODeleteButtonActionPerformed

    private void SupplierAdminAMSOBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierAdminAMSOBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_SupplierAdminAMSOBackButtonActionPerformed

    private void SupplierAdminAMSOAssignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplierAdminAMSOAssignButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = SupplierAdminAMSOTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            SupplierOrders supplierOrders = (SupplierOrders) SupplierAdminAMSOTable.getValueAt(selectedRow, 0);
            if(SupplierAdminAMSOCombo.getSelectedItem() != "")
            {
                String dmName = SupplierAdminAMSOCombo.getSelectedItem().toString();
                SupplierDeliveryMan sdm = supplier.findSupplierDeliveryMan(dmName);
                supplierOrders.setSupplierDeliveryMan(sdm);
                JOptionPane.showMessageDialog(null, "Delivery man assigned successfully!");
                populateTable();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please select a delivery man!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_SupplierAdminAMSOAssignButtonActionPerformed

    private void SupplierAdminAMSOTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierAdminAMSOTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = SupplierAdminAMSOTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            SupplierAdminAMSOCombo.setEnabled(true);
            SupplierAdminAMSODeleteButton.setEnabled(true);
            SupplierAdminAMSOAssignButton.setEnabled(true);
        }
    }//GEN-LAST:event_SupplierAdminAMSOTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SupplierAdminAMSOAssignButton;
    private javax.swing.JButton SupplierAdminAMSOBackButton;
    private javax.swing.JComboBox<String> SupplierAdminAMSOCombo;
    private javax.swing.JButton SupplierAdminAMSODeleteButton;
    private javax.swing.JLabel SupplierAdminAMSOLabel;
    private javax.swing.JLabel SupplierAdminAMSOLabel1;
    private javax.swing.JLabel SupplierAdminAMSOLabel2;
    private javax.swing.JLabel SupplierAdminAMSOLabel3;
    private javax.swing.JTable SupplierAdminAMSOTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


private void populateTable() {
       DefaultTableModel dtm = (DefaultTableModel)SupplierAdminAMSOTable.getModel();
        dtm.setRowCount(0);
        if(supplier.getSupplierOrderDirectory().getSupplierOrderList() != null)
        {
            for(SupplierOrders supplierOrders : supplier.getSupplierOrderDirectory().getSupplierOrderList())
            {
                if(!supplierOrders.isStatus() && supplierOrders.getPharmacy()!= null)
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = supplierOrders;
                    row[1] = supplierOrders.getPharmacy().getName();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[2] = supplierOrders.getOrderDate().format(formatter);
                    if(supplierOrders.getSupplierDeliveryMan() == null)
                    {
                        row[3] = "";
                    }
                    else
                    {
                        row[3] = supplierOrders.getSupplierDeliveryMan().getName();
                    }
                    dtm.addRow(row);
                }
            }
        }
        if(dtm.getRowCount() == 0)
            {
                SupplierAdminAMSOCombo.setEnabled(false);
                SupplierAdminAMSOAssignButton.setEnabled(false);
            }
    }
}

