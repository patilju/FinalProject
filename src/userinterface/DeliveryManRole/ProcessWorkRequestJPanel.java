/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.Orders.Orders;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author juile
 */


public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Orders orders;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, Orders o) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.orders = o;
        PWRStatusComboBox.addItem("Delivered");
        PWRStatusComboBox.addItem("Not Delivered");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PWRSubmitButton = new javax.swing.JButton();
        ResultLabel = new javax.swing.JLabel();
        PWRBackButton = new javax.swing.JButton();
        PWRStatusComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setLayout(null);

        PWRSubmitButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PWRSubmitButton.setForeground(new java.awt.Color(51, 0, 51));
        PWRSubmitButton.setText("Submit Result");
        PWRSubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PWRSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWRSubmitButtonActionPerformed(evt);
            }
        });
        add(PWRSubmitButton);
        PWRSubmitButton.setBounds(600, 170, 170, 50);

        ResultLabel.setBackground(new java.awt.Color(255, 255, 255));
        ResultLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        ResultLabel.setText("Result:");
        add(ResultLabel);
        ResultLabel.setBounds(260, 50, 90, 50);

        PWRBackButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PWRBackButton.setForeground(new java.awt.Color(102, 0, 0));
        PWRBackButton.setText("Back");
        PWRBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PWRBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWRBackButtonActionPerformed(evt);
            }
        });
        add(PWRBackButton);
        PWRBackButton.setBounds(170, 170, 160, 50);

        PWRStatusComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        add(PWRStatusComboBox);
        PWRStatusComboBox.setBounds(350, 50, 380, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ProcessWorkRequestJPanel.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(160, 240, 620, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void PWRSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWRSubmitButtonActionPerformed
        switch(PWRStatusComboBox.getSelectedIndex())
        {
            case 0 : orders.setStatus(true);
            break;
            case 1 : orders.setStatus(false);
            break;
        }
        System.out.println(PWRStatusComboBox.getSelectedIndex());
        System.out.println(orders.isStatus());
        System.out.println(orders.getTotalAmount());
        JOptionPane.showMessageDialog(null, "Order status updated successfully!");
    }//GEN-LAST:event_PWRSubmitButtonActionPerformed

    private void PWRBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWRBackButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DeliveryManWorkAreaJPanel dwjp = (DeliveryManWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_PWRBackButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PWRBackButton;
    private javax.swing.JComboBox<String> PWRStatusComboBox;
    private javax.swing.JButton PWRSubmitButton;
    private javax.swing.JLabel ResultLabel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
