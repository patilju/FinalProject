

package userinterface.PharmacyAdminRole;


import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
/**
 *
 * @author  dhrit
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    
    UserAccount user;
    EcoSystem system;
    Pharmacy pharmacy;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount user, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.user = user;
        this.system = system;
        for(Pharmacy r : system.getPharmacyDirectory().getPharmacyList())
        {
            for(Employee e : r.getEmployeeDirectory().getEmployeeList())
            {
                if(user.getEmployee() == e)
                {
                    this.pharmacy = r;
                    PharmacyAWALabel3.setText(r.getPharmacyName());
                }
            } 
        }
        PharmacyAWANameText.setText(this.pharmacy.getPharmacyName());
        PharmacyAWAAddressText.setText(this.pharmacy.getPharmacyAddress());
      System.out.println("Admin area work panel pharmacy : " + pharmacy);
        //valueLabel.setText();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PharmacyAWALabel1 = new javax.swing.JLabel();
        PharmacyAWALabel2 = new javax.swing.JLabel();
        PharmacyAWALabel3 = new javax.swing.JLabel();
        PharmacyAWAManageMedicineButton = new javax.swing.JButton();
        PharmacyAWAViewOrderButton = new javax.swing.JButton();
        PharmacyAWANameLabel = new javax.swing.JLabel();
        PharmacyAWANameText = new javax.swing.JTextField();
        PharmacyAWAAddressLabel = new javax.swing.JLabel();
        PharmacyAWAAddressText = new javax.swing.JTextField();
        PharmacyAWASubmitButton = new javax.swing.JButton();
        PharmacyAWAOrderMedicineButton = new javax.swing.JButton();
        PharmacyAWALabel = new javax.swing.JLabel();

<<<<<<< Updated upstream
        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        PharmacyAWALabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PharmacyAWALabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PharmacyAWALabel1.setText("My Work Area - Administrative Role");
        add(PharmacyAWALabel1);
        PharmacyAWALabel1.setBounds(140, 8, 600, 60);

        PharmacyAWALabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacyAWALabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PharmacyAWALabel2.setText("Pharmacy");
        add(PharmacyAWALabel2);
        PharmacyAWALabel2.setBounds(320, 80, 78, 21);

        PharmacyAWALabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacyAWALabel3.setText("<value>");
        add(PharmacyAWALabel3);
        PharmacyAWALabel3.setBounds(430, 80, 61, 21);

        PharmacyAWAManageMedicineButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
=======
        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setLayout(null);

        PharmacyAWALabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PharmacyAWALabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PharmacyAWALabel1.setText("Admin Work Area");
        add(PharmacyAWALabel1);
        PharmacyAWALabel1.setBounds(410, 0, 600, 60);

        PharmacyAWALabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PharmacyAWALabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PharmacyAWALabel2.setText("Pharmacy");
        add(PharmacyAWALabel2);
        PharmacyAWALabel2.setBounds(550, 70, 120, 22);

        PharmacyAWALabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PharmacyAWALabel3.setText("<value>");
        add(PharmacyAWALabel3);
        PharmacyAWALabel3.setBounds(700, 70, 100, 22);

        PharmacyAWAManageMedicineButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
>>>>>>> Stashed changes
        PharmacyAWAManageMedicineButton.setText("Manage Medicine");
        PharmacyAWAManageMedicineButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAWAManageMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAWAManageMedicineButtonActionPerformed(evt);
            }
        });
        add(PharmacyAWAManageMedicineButton);
<<<<<<< Updated upstream
        PharmacyAWAManageMedicineButton.setBounds(400, 150, 160, 60);

        PharmacyAWAViewOrderButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
=======
        PharmacyAWAManageMedicineButton.setBounds(580, 140, 210, 40);

        PharmacyAWAViewOrderButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
>>>>>>> Stashed changes
        PharmacyAWAViewOrderButton.setText("View Orders");
        PharmacyAWAViewOrderButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAWAViewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAWAViewOrderButtonActionPerformed(evt);
            }
        });
        add(PharmacyAWAViewOrderButton);
<<<<<<< Updated upstream
        PharmacyAWAViewOrderButton.setBounds(150, 150, 170, 60);

        PharmacyAWANameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAWANameLabel.setText("                Pharmacy Name:");
        add(PharmacyAWANameLabel);
        PharmacyAWANameLabel.setBounds(130, 260, 150, 50);

        PharmacyAWANameText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PharmacyAWANameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(PharmacyAWANameText);
        PharmacyAWANameText.setBounds(330, 260, 340, 50);

        PharmacyAWAAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAWAAddressLabel.setText("                                        Address:");
        add(PharmacyAWAAddressLabel);
        PharmacyAWAAddressLabel.setBounds(110, 380, 170, 50);
=======
        PharmacyAWAViewOrderButton.setBounds(60, 140, 230, 40);

        PharmacyAWANameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PharmacyAWANameLabel.setText("                Pharmacy Name:");
        add(PharmacyAWANameLabel);
        PharmacyAWANameLabel.setBounds(50, 270, 210, 50);

        PharmacyAWANameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PharmacyAWANameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(PharmacyAWANameText);
        PharmacyAWANameText.setBounds(280, 270, 340, 50);

        PharmacyAWAAddressLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PharmacyAWAAddressLabel.setText("                                        Address:");
        add(PharmacyAWAAddressLabel);
        PharmacyAWAAddressLabel.setBounds(620, 270, 390, 50);
>>>>>>> Stashed changes

        PharmacyAWAAddressText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PharmacyAWAAddressText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(PharmacyAWAAddressText);
<<<<<<< Updated upstream
        PharmacyAWAAddressText.setBounds(330, 380, 340, 50);

        PharmacyAWASubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
=======
        PharmacyAWAAddressText.setBounds(920, 270, 340, 50);

        PharmacyAWASubmitButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
>>>>>>> Stashed changes
        PharmacyAWASubmitButton.setText("Submit");
        PharmacyAWASubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAWASubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAWASubmitButtonActionPerformed(evt);
            }
        });
        add(PharmacyAWASubmitButton);
<<<<<<< Updated upstream
        PharmacyAWASubmitButton.setBounds(370, 530, 180, 60);

        PharmacyAWAOrderMedicineButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
=======
        PharmacyAWASubmitButton.setBounds(560, 420, 260, 40);

        PharmacyAWAOrderMedicineButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
>>>>>>> Stashed changes
        PharmacyAWAOrderMedicineButton.setText("Order Medicines From Supplier");
        PharmacyAWAOrderMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAWAOrderMedicineButtonActionPerformed(evt);
            }
        });
        add(PharmacyAWAOrderMedicineButton);
<<<<<<< Updated upstream
        PharmacyAWAOrderMedicineButton.setBounds(630, 150, 199, 60);

        PharmacyAWALabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/PharmacyAdminWorkArea.jpg"))); // NOI18N
        add(PharmacyAWALabel);
        PharmacyAWALabel.setBounds(80, 0, 1380, 810);
=======
        PharmacyAWAOrderMedicineButton.setBounds(1030, 140, 250, 40);

        PharmacyAWALabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pharmacyyyyyyy.jpg"))); // NOI18N
        add(PharmacyAWALabel);
        PharmacyAWALabel.setBounds(120, 480, 1100, 370);
>>>>>>> Stashed changes
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacyAWAManageMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAWAManageMedicineButtonActionPerformed
        AdminManageMedicine amm = new AdminManageMedicine(userProcessContainer, pharmacy);
        userProcessContainer.add("UserCustomer", amm);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PharmacyAWAManageMedicineButtonActionPerformed

    private void PharmacyAWAViewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAWAViewOrderButtonActionPerformed
        AdminManageOrders amo = new AdminManageOrders(userProcessContainer, pharmacy);
        userProcessContainer.add("UserCustomer", amo);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PharmacyAWAViewOrderButtonActionPerformed

    private void PharmacyAWASubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAWASubmitButtonActionPerformed
        // TODO add your handling code here:
        if(("".equals(PharmacyAWANameText.getText())) || ("".equals(PharmacyAWAAddressText.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all values!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(PharmacyAWANameText.getText() == null ? pharmacy.getPharmacyName() != null : !PharmacyAWANameText.getText().equals(pharmacy.getPharmacyName()))
        {
            if(system.getPharmacyDirectory().checkIfPharmacyIsUnique(PharmacyAWANameText.getText()))
            {
                pharmacy.setPharmacyName(PharmacyAWANameText.getText());
                pharmacy.setPharmacyAddress(PharmacyAWAAddressText.getText());
                JOptionPane.showMessageDialog(null, "Pharmacy details updated!");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Pharmacy name not unique!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        PharmacyAWALabel3.setText(pharmacy.getPharmacyName());
    }//GEN-LAST:event_PharmacyAWASubmitButtonActionPerformed

    private void PharmacyAWAOrderMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAWAOrderMedicineButtonActionPerformed
        // TODO add your handling code here:
         PharmacyAreaJPanel pap = new PharmacyAreaJPanel(userProcessContainer, user,system, pharmacy);
        userProcessContainer.add("UserCustomer", pap);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PharmacyAWAOrderMedicineButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PharmacyAWAAddressLabel;
    private javax.swing.JTextField PharmacyAWAAddressText;
    private javax.swing.JLabel PharmacyAWALabel;
    private javax.swing.JLabel PharmacyAWALabel1;
    private javax.swing.JLabel PharmacyAWALabel2;
    private javax.swing.JLabel PharmacyAWALabel3;
    private javax.swing.JButton PharmacyAWAManageMedicineButton;
    private javax.swing.JLabel PharmacyAWANameLabel;
    private javax.swing.JTextField PharmacyAWANameText;
    private javax.swing.JButton PharmacyAWAOrderMedicineButton;
    private javax.swing.JButton PharmacyAWASubmitButton;
    private javax.swing.JButton PharmacyAWAViewOrderButton;
    // End of variables declaration//GEN-END:variables
    
}
