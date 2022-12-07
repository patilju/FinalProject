/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantStore;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhrit
 */
public class ManageRestaurantsJPanel extends javax.swing.JPanel {
    public RestaurantStore restDirectory;
    public JPanel container;
    public EcoSystem system;
    /**
     * Creates new form ManageRestaurantsJPanel
     */
    public ManageRestaurantsJPanel(JPanel container, EcoSystem system, RestaurantStore restaurantDirectory) {
        initComponents();
        this.container = container;
        this.restDirectory = restaurantDirectory;
        this.system = system;
        populateRestaurantsTable();
        
    }
    
        public void populateRestaurantsTable() {
        DefaultTableModel model = (DefaultTableModel) TblRestaurants.getModel();
        model.setRowCount(0);
        for (UserAccount userAcc : system.getUserAccountDirectory().getUserAccountList()) {
            for (Restaurant rest : restDirectory.getRestDirectory()) {
                if (rest.getRestNo().equalsIgnoreCase(userAcc.getEmployee().getName())) {
                    Object[] row = new Object[4];
                    row[0] = rest.getRestNo();
                    row[1] = rest.getRestName();
                    row[2] = rest.getRestContact();
                    row[3] = rest.getRestAddress();
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

        lbl_RestDetails = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblRestaurants = new javax.swing.JTable();
        btnRestBack = new javax.swing.JButton();
        btnRestAdd = new javax.swing.JButton();
        btnRestView = new javax.swing.JButton();
        btnRestDel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(0, 51, 51));

        lbl_RestDetails.setBackground(new java.awt.Color(204, 255, 255));
        lbl_RestDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_RestDetails.setForeground(new java.awt.Color(0, 51, 51));
        lbl_RestDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_RestDetails.setText("Restaurants List");

        TblRestaurants.setBackground(new java.awt.Color(255, 255, 204));
        TblRestaurants.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TblRestaurants.setForeground(new java.awt.Color(0, 51, 51));
        TblRestaurants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Restaurant ID", "Restaurant Name", "Phone Number", "Restaurant Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblRestaurants);

        btnRestBack.setBackground(new java.awt.Color(204, 255, 255));
        btnRestBack.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnRestBack.setForeground(new java.awt.Color(0, 51, 51));
        btnRestBack.setText("Back");
        btnRestBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestBackActionPerformed(evt);
            }
        });

        btnRestAdd.setBackground(new java.awt.Color(204, 255, 255));
        btnRestAdd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnRestAdd.setForeground(new java.awt.Color(0, 51, 51));
        btnRestAdd.setText("Add");
        btnRestAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestAddActionPerformed(evt);
            }
        });

        btnRestView.setBackground(new java.awt.Color(204, 255, 255));
        btnRestView.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnRestView.setForeground(new java.awt.Color(0, 51, 51));
        btnRestView.setText("View");
        btnRestView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestViewActionPerformed(evt);
            }
        });

        btnRestDel.setBackground(new java.awt.Color(204, 255, 255));
        btnRestDel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnRestDel.setForeground(new java.awt.Color(0, 51, 51));
        btnRestDel.setText("Delete");
        btnRestDel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRestDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_RestDetails)
                .addGap(324, 324, 324))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btnRestAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(btnRestDel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRestView, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(btnRestBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_RestDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestAdd)
                    .addComponent(btnRestBack)
                    .addComponent(btnRestView)
                    .addComponent(btnRestDel))
                .addGap(0, 102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnRestBackActionPerformed

    private void btnRestAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestAddActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) container.getLayout();
        AddRestaurantJPanel addRestJPanel = new AddRestaurantJPanel(container, system, restDirectory);
        container.add(addRestJPanel);
        layout.next(container);
    }//GEN-LAST:event_btnRestAddActionPerformed

    private void btnRestViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = TblRestaurants.getSelectedRow();
        int count = TblRestaurants.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                CardLayout layout = (CardLayout) container.getLayout();
                Restaurant rest = restDirectory.getRestaurantNo(selectedRow);
                ViewUpdateRestJPanel viewUpdateRestPanel = new ViewUpdateRestJPanel( container, rest);
                container.add(viewUpdateRestPanel);
                layout.next(container);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row to continue.");
        }
    }//GEN-LAST:event_btnRestViewActionPerformed

    private void btnRestDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestDelActionPerformed
        // TODO add your handling code here:
        int selectedRow = TblRestaurants.getSelectedRow();
        int count = TblRestaurants.getSelectedRowCount();
        if (count == 1) {
            if (selectedRow >= 0) {
                int selectionButton = JOptionPane.YES_NO_OPTION;
                int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
                if (selectionResult == JOptionPane.YES_OPTION) {
                    restDirectory.deleteRestaurant(selectedRow, system);
                    populateRestaurantsTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row to continue.");
        }
    }//GEN-LAST:event_btnRestDelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblRestaurants;
    private javax.swing.JButton btnRestAdd;
    private javax.swing.JButton btnRestBack;
    private javax.swing.JButton btnRestDel;
    private javax.swing.JButton btnRestView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_RestDetails;
    // End of variables declaration//GEN-END:variables
}
