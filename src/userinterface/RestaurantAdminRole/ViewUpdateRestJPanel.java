/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dhrit
 */
public class ViewUpdateRestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateRestJPanel
     */
        private final JPanel container;
    private final Restaurant restaurant;
    private String currentPhoneNo;
    public ViewUpdateRestJPanel(JPanel container, Restaurant restaurant) {
        initComponents();
         this.container = container;
        this.restaurant = restaurant;
        this.currentPhoneNo = restaurant.getRestContact();
        txtRestNo.setText(restaurant.getRestNo());
        txtRestAddr1.setText(restaurant.getRestAddress());
        txtRestContact1.setText(restaurant.getRestContact());
        txtRestName1.setText(restaurant.getRestName());
        disableEdit();
    }
private void disableEdit(){
    txtRestNo.setEditable(false);
    txtRestAddr1.setEditable(false);
    txtRestName1.setEditable(false);
    txtRestContact1.setEditable(false);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRestName1 = new javax.swing.JTextField();
        lblRestContact1 = new javax.swing.JLabel();
        lblRestName1 = new javax.swing.JLabel();
        txtRestAddr1 = new javax.swing.JTextField();
        lblAddRest1 = new javax.swing.JLabel();
        lblRestAddr1 = new javax.swing.JLabel();
        txtRestContact1 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtRestNo = new javax.swing.JTextField();
        lblRestNo = new javax.swing.JLabel();
        btnEnableUpdate = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(0, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRestName1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRestName1.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 121, 390, -1));

        lblRestContact1.setBackground(new java.awt.Color(204, 255, 255));
        lblRestContact1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRestContact1.setForeground(new java.awt.Color(0, 51, 51));
        lblRestContact1.setText("Contact No :");
        add(lblRestContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        lblRestName1.setBackground(new java.awt.Color(204, 255, 255));
        lblRestName1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRestName1.setForeground(new java.awt.Color(0, 51, 51));
        lblRestName1.setText("Name :");
        add(lblRestName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        txtRestAddr1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRestAddr1.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 390, -1));

        lblAddRest1.setBackground(new java.awt.Color(204, 255, 255));
        lblAddRest1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAddRest1.setForeground(new java.awt.Color(0, 51, 51));
        lblAddRest1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddRest1.setText("Restaurant Information");
        add(lblAddRest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        lblRestAddr1.setBackground(new java.awt.Color(204, 255, 255));
        lblRestAddr1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRestAddr1.setForeground(new java.awt.Color(0, 51, 51));
        lblRestAddr1.setText("Street Address :");
        add(lblRestAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        txtRestContact1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRestContact1.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 390, -1));

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
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 51, -1));

        txtRestNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRestNo.setForeground(new java.awt.Color(0, 51, 51));
        add(txtRestNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 92, 390, -1));

        lblRestNo.setBackground(new java.awt.Color(204, 255, 255));
        lblRestNo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblRestNo.setForeground(new java.awt.Color(0, 51, 51));
        lblRestNo.setText("Restaurant No :");
        add(lblRestNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        btnEnableUpdate.setBackground(new java.awt.Color(204, 255, 255));
        btnEnableUpdate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEnableUpdate.setForeground(new java.awt.Color(0, 51, 51));
        btnEnableUpdate.setText("Update");
        btnEnableUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEnableUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnableUpdateActionPerformed(evt);
            }
        });
        add(btnEnableUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 50, -1));

        btnSaveChanges.setBackground(new java.awt.Color(204, 255, 255));
        btnSaveChanges.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(0, 51, 51));
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.setActionCommand("Save");
        btnSaveChanges.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 50, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
         container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRestaurantsJPanel manageRestaurantJPanel = (ManageRestaurantsJPanel) component;
        manageRestaurantJPanel.populateRestaurantsTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEnableUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnableUpdateActionPerformed
        // TODO add your handling code here:
        txtRestAddr1.setEditable(true);
        txtRestContact1.setEditable(true);
        txtRestName1.setEditable(true);
        
        btnEnableUpdate.setEnabled(false);
    }//GEN-LAST:event_btnEnableUpdateActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        
        String custName = txtRestName1.getText();
        String custContact = txtRestContact1.getText();
        String custAddr = txtRestContact1.getText();
        boolean allSet = true;

        if( custName.isEmpty() || custContact.isEmpty() || custAddr.isEmpty()) {
            allSet = false;
            JOptionPane.showMessageDialog(null, "Kindly Enter all the required fields!");
        }   else if (!validateMobileNo(custContact)) {
            allSet = false;
            JOptionPane.showMessageDialog(null, "Kindly enter a Valid Contact Number.");
        }   
        if(allSet == true){
            restaurant.setRestName(txtRestName1.getText());
            restaurant.setRestAddress(txtRestAddr1.getText());
            restaurant.setRestContact(txtRestContact1.getText());
            JOptionPane.showMessageDialog(null, "Restaurant Details updated!");
            disableEdit();
            btnEnableUpdate.setEnabled(true);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed
public Boolean validateMobileNo(String phoneNo)
    {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(phoneNo);
        return (matcher.matches());
       
    }
    public Boolean validateEmail(String email)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        return (matcher.matches());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEnableUpdate;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel lblAddRest1;
    private javax.swing.JLabel lblRestAddr1;
    private javax.swing.JLabel lblRestContact1;
    private javax.swing.JLabel lblRestName1;
    private javax.swing.JLabel lblRestNo;
    private javax.swing.JTextField txtRestAddr1;
    private javax.swing.JTextField txtRestContact1;
    private javax.swing.JTextField txtRestName1;
    private javax.swing.JTextField txtRestNo;
    // End of variables declaration//GEN-END:variables
}