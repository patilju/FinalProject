/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.CustomerRole.ManageCustomersJPanel;

/**
 *
 * @author dhrit
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        RegisterPanel = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        WorkPanel = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        SystemPanel = new javax.swing.JPanel();
        btnManageRestaurants = new javax.swing.JButton();
        btnManageCustomers = new javax.swing.JButton();
        btnManageDeliveryMan = new javax.swing.JButton();
        ManageCustomersPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCustomers = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAddCust = new javax.swing.JButton();
        btnViewCust = new javax.swing.JButton();
        btnDelCust = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ManageRestaurantsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblRestaurants = new javax.swing.JTable();
        btnRestBack = new javax.swing.JButton();
        btnRestAdd = new javax.swing.JButton();
        btnRestView = new javax.swing.JButton();
        btnRestDel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ManageDeliveryManPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblDeliveyMan = new javax.swing.JTable();
        btnDeliveryBack = new javax.swing.JButton();
        btnDeliveryAdd = new javax.swing.JButton();
        btnDeliveryView = new javax.swing.JButton();
        btnDeliveryDel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setLayout(new java.awt.CardLayout());

        btnRegister.setText("Register");

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(btnRegister)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        ControlPanel.add(RegisterPanel, "card2");

        jSplitPane2.setLeftComponent(ControlPanel);

        WorkPanel.setLayout(new java.awt.CardLayout());

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Food Delivery System");

        lblUsername.setText("Username");

        lblPassword.setText("Password");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(lblUsername)
                .addGap(18, 18, 18)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lblPassword)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnLogin)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        WorkPanel.add(LoginPanel, "card2");

        btnManageRestaurants.setText("Manage Restaurants");
        btnManageRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRestaurantsActionPerformed(evt);
            }
        });

        btnManageCustomers.setText("Manage Customers");
        btnManageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersActionPerformed(evt);
            }
        });

        btnManageDeliveryMan.setText("Manage Delivery Man");

        javax.swing.GroupLayout SystemPanelLayout = new javax.swing.GroupLayout(SystemPanel);
        SystemPanel.setLayout(SystemPanelLayout);
        SystemPanelLayout.setHorizontalGroup(
            SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SystemPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btnManageRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnManageDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SystemPanelLayout.setVerticalGroup(
            SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SystemPanelLayout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(SystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageRestaurants, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(btnManageDeliveryMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(406, 406, 406))
        );

        WorkPanel.add(SystemPanel, "card3");

        TblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer No", "User Name", "Customer Name", "Phone Number", "Customer Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblCustomers);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddCust.setText("Add");
        btnAddCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustActionPerformed(evt);
            }
        });

        btnViewCust.setText("View");

        btnDelCust.setText("Delete");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer List");

        javax.swing.GroupLayout ManageCustomersPanelLayout = new javax.swing.GroupLayout(ManageCustomersPanel);
        ManageCustomersPanel.setLayout(ManageCustomersPanelLayout);
        ManageCustomersPanelLayout.setHorizontalGroup(
            ManageCustomersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageCustomersPanelLayout.createSequentialGroup()
                .addGroup(ManageCustomersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageCustomersPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnBack)
                        .addGap(68, 68, 68)
                        .addComponent(btnAddCust)
                        .addGap(65, 65, 65)
                        .addComponent(btnViewCust)
                        .addGap(76, 76, 76)
                        .addComponent(btnDelCust))
                    .addGroup(ManageCustomersPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManageCustomersPanelLayout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManageCustomersPanelLayout.setVerticalGroup(
            ManageCustomersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageCustomersPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(ManageCustomersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnAddCust)
                    .addComponent(btnViewCust)
                    .addComponent(btnDelCust))
                .addContainerGap(370, Short.MAX_VALUE))
        );

        WorkPanel.add(ManageCustomersPanel, "card4");

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
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TblRestaurants);

        btnRestBack.setText("Back");

        btnRestAdd.setText("Add");

        btnRestView.setText("View");

        btnRestDel.setText("Delete");

        jLabel2.setText("Restaurant List");

        javax.swing.GroupLayout ManageRestaurantsPanelLayout = new javax.swing.GroupLayout(ManageRestaurantsPanel);
        ManageRestaurantsPanel.setLayout(ManageRestaurantsPanelLayout);
        ManageRestaurantsPanelLayout.setHorizontalGroup(
            ManageRestaurantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageRestaurantsPanelLayout.createSequentialGroup()
                .addGroup(ManageRestaurantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageRestaurantsPanelLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ManageRestaurantsPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnRestBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnRestAdd)
                        .addGap(78, 78, 78)
                        .addComponent(btnRestView)
                        .addGap(70, 70, 70)
                        .addComponent(btnRestDel))
                    .addGroup(ManageRestaurantsPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManageRestaurantsPanelLayout.setVerticalGroup(
            ManageRestaurantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageRestaurantsPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(ManageRestaurantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestBack)
                    .addComponent(btnRestAdd)
                    .addComponent(btnRestView)
                    .addComponent(btnRestDel))
                .addContainerGap(334, Short.MAX_VALUE))
        );

        WorkPanel.add(ManageRestaurantsPanel, "card5");

        TblDeliveyMan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TblDeliveyMan);

        btnDeliveryBack.setText("Back");

        btnDeliveryAdd.setText("Add");

        btnDeliveryView.setText("View");

        btnDeliveryDel.setText("Delete");
        btnDeliveryDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryDelActionPerformed(evt);
            }
        });

        jLabel3.setText("Delivery Man List");

        javax.swing.GroupLayout ManageDeliveryManPanelLayout = new javax.swing.GroupLayout(ManageDeliveryManPanel);
        ManageDeliveryManPanel.setLayout(ManageDeliveryManPanelLayout);
        ManageDeliveryManPanelLayout.setHorizontalGroup(
            ManageDeliveryManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDeliveryManPanelLayout.createSequentialGroup()
                .addGroup(ManageDeliveryManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageDeliveryManPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(ManageDeliveryManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ManageDeliveryManPanelLayout.createSequentialGroup()
                                .addComponent(btnDeliveryBack)
                                .addGap(63, 63, 63)
                                .addComponent(btnDeliveryAdd)
                                .addGap(86, 86, 86)
                                .addComponent(btnDeliveryView)
                                .addGap(93, 93, 93)
                                .addComponent(btnDeliveryDel))))
                    .addGroup(ManageDeliveryManPanelLayout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManageDeliveryManPanelLayout.setVerticalGroup(
            ManageDeliveryManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDeliveryManPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(ManageDeliveryManPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeliveryBack)
                    .addComponent(btnDeliveryAdd)
                    .addComponent(btnDeliveryView)
                    .addComponent(btnDeliveryDel))
                .addContainerGap(256, Short.MAX_VALUE))
        );

        WorkPanel.add(ManageDeliveryManPanel, "card6");

        jSplitPane2.setRightComponent(WorkPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword() );
        UserAccount userAcc = system.getUserAccountDirectory().authenticateUser(username, password);
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter valid user credentials to login!");
        }
        if (userAcc == null){
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
            return ;
           
        }else{
            switchPanels(WorkPanel, WorkPanel);
        }
        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);         
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnManageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersActionPerformed
        // TODO add your handling code here:
         ManageCustomersJPanel manageCustomersJPanel = new ManageCustomersJPanel(userProcessContainer, ecosystem, customerDirectory);
        userProcessContainer.add("manageCustomersJPanel", manageCustomersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCustomersActionPerformed

    private void btnManageRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRestaurantsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageRestaurantsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeliveryDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeliveryDelActionPerformed

    private void btnAddCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCustActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel ManageCustomersPanel;
    private javax.swing.JPanel ManageDeliveryManPanel;
    private javax.swing.JPanel ManageRestaurantsPanel;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JPanel SystemPanel;
    private javax.swing.JTable TblCustomers;
    private javax.swing.JTable TblDeliveyMan;
    private javax.swing.JTable TblRestaurants;
    private javax.swing.JPanel WorkPanel;
    private javax.swing.JButton btnAddCust;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelCust;
    private javax.swing.JButton btnDeliveryAdd;
    private javax.swing.JButton btnDeliveryBack;
    private javax.swing.JButton btnDeliveryDel;
    private javax.swing.JButton btnDeliveryView;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnManageCustomers;
    private javax.swing.JButton btnManageDeliveryMan;
    private javax.swing.JButton btnManageRestaurants;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRestAdd;
    private javax.swing.JButton btnRestBack;
    private javax.swing.JButton btnRestDel;
    private javax.swing.JButton btnRestView;
    private javax.swing.JButton btnViewCust;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

public void switchPanels(JPanel pan, JPanel pan1){
        WorkPanel.removeAll();
        WorkPanel.add(pan);
        WorkPanel.repaint();
        WorkPanel.revalidate();
        ControlPanel.removeAll();
        ControlPanel.add(pan1);
        ControlPanel.repaint();
        ControlPanel.revalidate();
    }




}
