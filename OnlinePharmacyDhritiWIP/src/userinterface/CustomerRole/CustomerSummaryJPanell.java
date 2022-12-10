/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;
import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Orders.Orders;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vini
 */
public class CustomerSummaryJPanell extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private UserAccount user;
    private Customer customer;
    private EcoSystem system;
    /**
     * Creates new form CustomerReviewJPanell
     */
    public CustomerSummaryJPanell(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;     
        this.user = account;
        this.system = system;
        for(Customer c : system.getCustomerDirectory().getCustomerList() )
        {
            
                if(c.getName() == null ? user.getEmployee().getName() == null : c.getName().equals(user.getEmployee().getName()))
                {
                    this.customer = c;
                }
        }
        enterpriseLabel.setText(this.customer + "'s orders");
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
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
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
        jScrollPane1.setBounds(10, 84, 1470, 97);

        requestTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        requestTestJButton.setText("Add Message >");
        requestTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton);
        requestTestJButton.setBounds(1330, 210, 85, 39);

        refreshTestJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton);
        refreshTestJButton.setBounds(892, 4, 76, 21);

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        enterpriseLabel.setText("<>");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(24, 36, 251, 30);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack.setText("< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 199, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Pharmacy_Summary_Image.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 160, 1480, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

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
                Orders o = (Orders) workRequestJTable.getValueAt(selectedRow, 0);
                RequestLabTestJPanel fs = new RequestLabTestJPanel(userProcessContainer, o);
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

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        if(workRequestJTable.getRowCount() > 0)
        {
            populateRequestTable();
            JOptionPane.showMessageDialog(null, "Table refreshed!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nothing to refresh!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    public void populateRequestTable() {
        if(customer.getPastOrderList() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel)workRequestJTable.getModel();
            dtm.setRowCount(0);
            
            refreshTestJButton.setEnabled(true);
            requestTestJButton.setEnabled(true);
            int count = 1;
            for(Orders o : customer.getPastOrderList())
            {
                if(system.getPharmacyDirectory().getPharmacyList() != null)
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = o;
                    for(Pharmacy p : system.getPharmacyDirectory().getPharmacyList())
                    {
                        for(Orders or : p.getOrderDirectory().getOrderList())
                        {
                          if(o.equals(or))
                          {
                              row[1] = p;
                          }
                        }
                    }
                    row[2] = o.getTotalAmount();
                    row[3] = o.getMessage();
                    row[4] = o.getDeliveryMan();
                    if(o.isStatus())
                    {
                        row[5] = "Yes";
                    }
                    else
                    {
                        row[5] = "No";
                    }
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[6] = o.getOrderDate().format(formatter);
                    dtm.addRow(row);
                    count++;
                }
            }
        }
    }
}
