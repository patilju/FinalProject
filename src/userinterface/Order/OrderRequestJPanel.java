/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Order;

import Business.Customer.CustomerStore;
import Business.DeliveryMan.DeliveryManStore;
import Business.EcoSystem;
import Business.Order.Menu;
import Business.Order.Order;
import Business.Order.OrderStore;
import Business.Restaurant.RestaurantStore;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nupoo
 */
public class OrderRequestJPanel extends javax.swing.JPanel {
    
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final OrderStore orderDirectory;
    private final JPanel container;
    /**
     * Creates new form OrderRequestJPanel
     */
    public OrderRequestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, CustomerStore customerDirectory, RestaurantStore restaurantDirectory, DeliveryManStore deliveryManDirectory, Menu menuDirectory, OrderStore orderDirectory) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.orderDirectory = orderDirectory;
        this.container = userProcessContainer;
        
        populateWorkRequestTable();
    }
    public void populateWorkRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrderList.getModel();
        model.setRowCount(0);
        for (Order order : orderDirectory.getOrderDir()) {
            if (order.getCustomer().getCustID().equalsIgnoreCase(userAccount.getEmployee().getName())) {
                Object[] row = new Object[9];
                row[8] = order.getMessage();
                row[6] = (order.getDeliveryMan() == null) ? "Awaiting Confirmation" : order.getDeliveryMan().getDeliName();
                row[3] = order.getStatus();
                row[7] = (order.getConfirmOrder()== null ? "Waiting" : order.getConfirmOrder());
                row[0] = order.getRestaurant().getRestName();
                row[2] = order.getOrderItem().getItemName();
                row[4] = order.getQuantity();
                row[5] = order.getQuantity() * order.getOrderItem().getPrice();
                row[1] = order.getOrderNo();
                model.addRow(row);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderList = new javax.swing.JTable();
        txtOrderFeedback = new javax.swing.JTextField();
        btnOrderComment = new javax.swing.JButton();
        lblOrderFeedback = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnOrderBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(0, 51, 51));

        tblOrderList.setBackground(new java.awt.Color(255, 255, 204));
        tblOrderList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblOrderList.setForeground(new java.awt.Color(0, 51, 51));
        tblOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Restaurant Name", "Order Id", "Item", "Status", "Quantity", "Total Cost", "Delivery Man", "DeliveryMan Message", "Customer Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrderList);

        txtOrderFeedback.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtOrderFeedback.setForeground(new java.awt.Color(0, 51, 51));
        txtOrderFeedback.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOrderComment.setBackground(new java.awt.Color(204, 255, 255));
        btnOrderComment.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnOrderComment.setForeground(new java.awt.Color(0, 51, 51));
        btnOrderComment.setText("Comment");
        btnOrderComment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrderComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderCommentActionPerformed(evt);
            }
        });

        lblOrderFeedback.setBackground(new java.awt.Color(204, 255, 255));
        lblOrderFeedback.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblOrderFeedback.setForeground(new java.awt.Color(0, 51, 51));
        lblOrderFeedback.setText("Order Feedback :");

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Order Work List");

        btnOrderBack.setBackground(new java.awt.Color(204, 255, 255));
        btnOrderBack.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnOrderBack.setForeground(new java.awt.Color(0, 51, 51));
        btnOrderBack.setText("Back");
        btnOrderBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrderBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(349, 349, 349)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(lblOrderFeedback)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOrderFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnOrderBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnOrderComment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))))
                        .addGap(0, 258, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrderFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrderFeedback))
                .addGap(18, 18, 18)
                .addComponent(btnOrderComment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrderBack)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderCommentActionPerformed
        // TODO add your handling code here:
        int row = tblOrderList.getSelectedRow();
        int count = tblOrderList.getSelectedRowCount();
        if (count == 1) {
            if (row >= 0) {
                String orderId = tblOrderList.getValueAt(row, 1).toString();
                Order order = orderDirectory.fetchOrders(orderId);
               String comment = txtOrderFeedback.getText();
                    if (!comment.isEmpty()) {
                        order.setMessage(comment);
                        txtOrderFeedback.setText("");
                        JOptionPane.showMessageDialog(null, "Thank you for your feedback!");
                        populateWorkRequestTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Feedback is Mandatory!");
                    }
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row!");
        }
    }//GEN-LAST:event_btnOrderCommentActionPerformed

    private void btnOrderBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderBackActionPerformed
        // TODO add your handling code here:
         container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnOrderBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderBack;
    private javax.swing.JButton btnOrderComment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOrderFeedback;
    private javax.swing.JTable tblOrderList;
    private javax.swing.JTextField txtOrderFeedback;
    // End of variables declaration//GEN-END:variables
}
