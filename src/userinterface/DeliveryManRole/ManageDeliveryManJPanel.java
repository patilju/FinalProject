/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.Customer.CustomerStore;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManStore;
import Business.EcoSystem;
import Business.Restaurant.RestaurantStore;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juile
 */
public class ManageDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryManJPanel
     */
    JPanel container;
    EcoSystem system;
    CustomerStore customerDirectory;
    RestaurantStore restaurantDirectory;
    DeliveryManStore deliveryManDirectory;
    
    public ManageDeliveryManJPanel(JPanel container, EcoSystem system, DeliveryManStore deliveryManDirectory) {
        initComponents();
        this.container = container;
        this.system = system;
        this.deliveryManDirectory = deliveryManDirectory;
        populateDeliveryManTable();
    }
public void populateDeliveryManTable() {
        DefaultTableModel model = (DefaultTableModel) tblDeliveyMan.getModel();
        
        model.setRowCount(0);
        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManDirectory()) {
                if (deliveryMan.getDeliveryID().equalsIgnoreCase(ua.getEmployee().getName())) {
                    Object[] row = new Object[4];
                    row[0] = deliveryMan.getDeliveryID();
                    row[1] = deliveryMan.getDeliName();
                    row[2] = ua.getUsername();
                    row[3] = deliveryMan.getDeliPhoneNo();
                    
                    model.addRow(row);
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

        lbl_DeliDetails = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveyMan = new javax.swing.JTable();
        btnBack2 = new javax.swing.JButton();
        btnDeliveryAdd = new javax.swing.JButton();
        btnDeliveryView = new javax.swing.JButton();
        btnDeliveryDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lbl_DeliDetails.setBackground(new java.awt.Color(204, 255, 255));
        lbl_DeliDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_DeliDetails.setForeground(new java.awt.Color(0, 51, 51));
        lbl_DeliDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DeliDetails.setText("Delivery Person List");

        tblDeliveyMan.setBackground(new java.awt.Color(255, 255, 204));
        tblDeliveyMan.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblDeliveyMan.setForeground(new java.awt.Color(0, 51, 51));
        tblDeliveyMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Delivery Man ID", "Delivery Man Name", "Delivery Man Username", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDeliveyMan);

        btnBack2.setBackground(new java.awt.Color(204, 255, 255));
        btnBack2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 51, 51));
        btnBack2.setText("Back");
        btnBack2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        btnDeliveryAdd.setBackground(new java.awt.Color(204, 255, 255));
        btnDeliveryAdd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnDeliveryAdd.setForeground(new java.awt.Color(0, 51, 51));
        btnDeliveryAdd.setText("Add");
        btnDeliveryAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeliveryAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryAddActionPerformed(evt);
            }
        });

        btnDeliveryView.setBackground(new java.awt.Color(204, 255, 255));
        btnDeliveryView.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnDeliveryView.setForeground(new java.awt.Color(0, 51, 51));
        btnDeliveryView.setText("View");
        btnDeliveryView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeliveryView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryViewActionPerformed(evt);
            }
        });

        btnDeliveryDelete.setBackground(new java.awt.Color(204, 255, 255));
        btnDeliveryDelete.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnDeliveryDelete.setForeground(new java.awt.Color(0, 51, 51));
        btnDeliveryDelete.setText("Delete");
        btnDeliveryDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeliveryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(lbl_DeliDetails))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDeliveryAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(btnDeliveryView, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnDeliveryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_DeliDetails)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeliveryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack2)
                    .addComponent(btnDeliveryView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeliveryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnDeliveryAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryAddActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        AddDeliveryManJPanel addDeliJPanel = new AddDeliveryManJPanel(container, system, deliveryManDirectory);
        container.add(addDeliJPanel);
        layout.next(container);
    }//GEN-LAST:event_btnDeliveryAddActionPerformed

    private void btnDeliveryViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveyMan.getSelectedRow();
        int count = tblDeliveyMan.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                CardLayout layout = (CardLayout) container.getLayout();
                DeliveryMan deli = deliveryManDirectory.getDeliveryManById(selectedRow);
                ViewUpdateDeliveryManJPanel viewUpdateRestPanel = new ViewUpdateDeliveryManJPanel(system, container, deli, deliveryManDirectory);
                container.add(viewUpdateRestPanel);
                layout.next(container);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row to continue.");
        }
    }//GEN-LAST:event_btnDeliveryViewActionPerformed

    private void btnDeliveryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveyMan.getSelectedRow();
        int count = tblDeliveyMan.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                int selectionButton = JOptionPane.YES_NO_OPTION;
                int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
                if (selectionResult == JOptionPane.YES_OPTION) {
                    deliveryManDirectory.deleteDeliveryMan(selectedRow, system);
//                    populateRestaurantsTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row to continue.");
        }
    }//GEN-LAST:event_btnDeliveryDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnDeliveryAdd;
    private javax.swing.JButton btnDeliveryDelete;
    private javax.swing.JButton btnDeliveryView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_DeliDetails;
    private javax.swing.JTable tblDeliveyMan;
    // End of variables declaration//GEN-END:variables
}
