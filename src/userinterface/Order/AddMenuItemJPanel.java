/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Order;

import Business.EcoSystem;
import Business.Order.Menu;
import Business.Restaurant.RestaurantStore;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.RestaurantAdminRole.RestMenuJPanel;

/**
 *
 * @author nupoo
 */
public class AddMenuItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddMenuItemJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final Menu menuDirectory;
    private final UserAccount account;
    public AddMenuItemJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantStore restaurantDirectory, Menu menuDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.menuDirectory = menuDirectory;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddItem = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        lblAddItem.setBackground(new java.awt.Color(204, 255, 255));
        lblAddItem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAddItem.setForeground(new java.awt.Color(0, 51, 51));
        lblAddItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddItem.setText("Create New Order Item");

        lblItemName.setBackground(new java.awt.Color(204, 255, 255));
        lblItemName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblItemName.setForeground(new java.awt.Color(0, 51, 51));
        lblItemName.setText("Item Name :");

        lblPrice.setBackground(new java.awt.Color(204, 255, 255));
        lblPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 51, 51));
        lblPrice.setText("Price :");

        txtItemPrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtItemPrice.setForeground(new java.awt.Color(0, 51, 51));
        txtItemPrice.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtItemName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtItemName.setForeground(new java.awt.Color(0, 51, 51));
        txtItemName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSave.setBackground(new java.awt.Color(204, 255, 255));
        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 51, 51));
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 51));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(lblAddItem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblItemName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(lblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblAddItem)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemName)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String itemName = txtItemName.getText();
        double price = 0;
        try {
            price = Double.parseDouble(txtItemPrice.getText());
        } catch (NumberFormatException exception) {
            System.out.println(exception);
            JOptionPane.showMessageDialog(null, "Please enter valid price!");
        }
        if (itemName.isEmpty() ||  price == 0 ) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields.");
        } else {
            String restaurantNo = account.getEmployee().getName();
            //String restaurantId, String name, double price, String contents, String category
            menuDirectory.addOrderItem(restaurantNo, itemName, price);
            system.setMenu(menuDirectory);
            JOptionPane.showMessageDialog(null, "Item added sucessfully!");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RestMenuJPanel restMenuJPanel = (RestMenuJPanel) component;
       restMenuJPanel.populateMenuTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddItem;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    // End of variables declaration//GEN-END:variables
}