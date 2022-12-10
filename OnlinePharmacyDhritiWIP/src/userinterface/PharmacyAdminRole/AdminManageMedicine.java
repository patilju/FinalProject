/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyAdminRole;

import Business.MedicineItems.MedicineItem;
import Business.Orders.Orders;
import Business.Pharmacy.Pharmacy;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhrit
 */
public class AdminManageMedicine extends javax.swing.JPanel {

    /**
     * Creates new form AdminManageMenu
     */
    JPanel userProcessContainer;
    Pharmacy pharmacy;
    
    public AdminManageMedicine(JPanel userProcessContainer, Pharmacy pharmacy) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.pharmacy = pharmacy;
        PharmacyAMMDeleteButton.setEnabled(false);
        PharmacyAMMViewButton.setEnabled(false);
        PharmacyAMMNameText.setEnabled(false);
        PharmacyAMMPriceSpin.setEnabled(false);
        PharmacyAMMvalueLabel1.setText(pharmacy.getName());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PharmacyAMMDeleteButton = new javax.swing.JButton();
        PharmacyAMMViewButton = new javax.swing.JButton();
        PharmacyAMMAddButton = new javax.swing.JButton();
        PharmacyAMMNameText = new javax.swing.JTextField();
        PharmacyAMMNameLabel = new javax.swing.JLabel();
        PharmacyAMMLabel1 = new javax.swing.JLabel();
        PharmacyAMMPriceLabel = new javax.swing.JLabel();
        PharmacyAMMvalueLabel1 = new javax.swing.JLabel();
        PharmacyAMMPriceSpin = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        PharmacyTable1 = new javax.swing.JTable();
        PharmacyAMMSubmitButton = new javax.swing.JButton();
        PharmacyAMMMedicineLabel = new javax.swing.JLabel();
        PharmacyAMMBackButton1 = new javax.swing.JButton();
        PharmacyAMMLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setLayout(null);

        PharmacyAMMDeleteButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAMMDeleteButton.setText("Delete Item");
        PharmacyAMMDeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAMMDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAMMDeleteButtonActionPerformed(evt);
            }
        });
        add(PharmacyAMMDeleteButton);
        PharmacyAMMDeleteButton.setBounds(10, 114, 132, 35);

        PharmacyAMMViewButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAMMViewButton.setText("View  Item ");
        PharmacyAMMViewButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAMMViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAMMViewButtonActionPerformed(evt);
            }
        });
        add(PharmacyAMMViewButton);
        PharmacyAMMViewButton.setBounds(10, 160, 132, 38);

        PharmacyAMMAddButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAMMAddButton.setText("Add New Medicine>");
        PharmacyAMMAddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAMMAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAMMAddButtonActionPerformed(evt);
            }
        });
        add(PharmacyAMMAddButton);
        PharmacyAMMAddButton.setBounds(10, 209, 132, 37);

        PharmacyAMMNameText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PharmacyAMMNameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(PharmacyAMMNameText);
        PharmacyAMMNameText.setBounds(273, 205, 320, 30);

        PharmacyAMMNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAMMNameLabel.setText("Name:");
        add(PharmacyAMMNameLabel);
        PharmacyAMMNameLabel.setBounds(220, 210, 40, 27);

        PharmacyAMMLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacyAMMLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PharmacyAMMLabel1.setText("Pharmacy");
        add(PharmacyAMMLabel1);
        PharmacyAMMLabel1.setBounds(10, 39, 292, 30);

        PharmacyAMMPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAMMPriceLabel.setText("Price:");
        add(PharmacyAMMPriceLabel);
        PharmacyAMMPriceLabel.setBounds(220, 260, 40, 15);

        PharmacyAMMvalueLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PharmacyAMMvalueLabel1.setText("<value>");
        add(PharmacyAMMvalueLabel1);
        PharmacyAMMvalueLabel1.setBounds(308, 39, 282, 30);

        PharmacyAMMPriceSpin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(PharmacyAMMPriceSpin);
        PharmacyAMMPriceSpin.setBounds(273, 245, 320, 30);

        PharmacyTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PharmacyTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PharmacyTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PharmacyTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PharmacyTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(160, 114, 1290, 84);

        PharmacyAMMSubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAMMSubmitButton.setText("Submit");
        PharmacyAMMSubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAMMSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAMMSubmitButtonActionPerformed(evt);
            }
        });
        add(PharmacyAMMSubmitButton);
        PharmacyAMMSubmitButton.setBounds(273, 296, 149, 31);

        PharmacyAMMMedicineLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PharmacyAMMMedicineLabel.setText("Medicine");
        add(PharmacyAMMMedicineLabel);
        PharmacyAMMMedicineLabel.setBounds(160, 86, 74, 17);

        PharmacyAMMBackButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyAMMBackButton1.setText("< Back");
        PharmacyAMMBackButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PharmacyAMMBackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyAMMBackButton1ActionPerformed(evt);
            }
        });
        add(PharmacyAMMBackButton1);
        PharmacyAMMBackButton1.setBounds(10, 257, 130, 30);

        PharmacyAMMLabel.setBackground(new java.awt.Color(255, 255, 255));
        PharmacyAMMLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adminmanagemedicine.jpeg"))); // NOI18N
        PharmacyAMMLabel.setToolTipText("");
        PharmacyAMMLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PharmacyAMMLabel.setMaximumSize(new java.awt.Dimension(3000, 3000));
        PharmacyAMMLabel.setMinimumSize(new java.awt.Dimension(3000, 3000));
        PharmacyAMMLabel.setPreferredSize(new java.awt.Dimension(1000, 1000));
        add(PharmacyAMMLabel);
        PharmacyAMMLabel.setBounds(10, 10, 980, 990);
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacyAMMDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAMMDeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = PharmacyTable1.getSelectedRow();
        if (selectedRow >= 0)
        {
            MedicineItem mi = (MedicineItem) PharmacyTable1.getValueAt(selectedRow, 1);
            pharmacy.getMedicineCatalog().deleteMedicineItem(mi);
            JOptionPane.showMessageDialog(null, "Medicine " + mi.getName()+ " deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_PharmacyAMMDeleteButtonActionPerformed

    private void PharmacyAMMViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAMMViewButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = PharmacyTable1.getSelectedRow();
        if (selectedRow >= 0)
        {
            MedicineItem mi = (MedicineItem) PharmacyTable1.getValueAt(selectedRow, 1);
            AdminUpdateMedicineItem fs = new AdminUpdateMedicineItem(userProcessContainer, mi);
            userProcessContainer.add("SysAdminManageEmployees", fs);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_PharmacyAMMViewButtonActionPerformed

    private void PharmacyAMMAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAMMAddButtonActionPerformed
        // TODO add your handling code here:
        PharmacyAMMAddButton.setEnabled(false);
        PharmacyAMMNameText.setEnabled(true);
        PharmacyAMMPriceSpin.setEnabled(true);
        PharmacyAMMSubmitButton.setEnabled(true);
    }//GEN-LAST:event_PharmacyAMMAddButtonActionPerformed

    private void PharmacyTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PharmacyTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = PharmacyTable1.getSelectedRow();
        if (selectedRow >= 0)
        {
            PharmacyAMMDeleteButton.setEnabled(true);
            PharmacyAMMViewButton.setEnabled(true);
        }
    }//GEN-LAST:event_PharmacyTable1MouseClicked

    private void PharmacyAMMSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAMMSubmitButtonActionPerformed
        // TODO add your handling code here:
        if(validateThis())
        {
            if(pharmacy.getMedicineCatalog().checkIfMedicineItemIsUnique(PharmacyAMMNameText.getText()))
            {
                MedicineItem mi = pharmacy.getMedicineCatalog().createNewFoodItem(PharmacyAMMNameText.getText(), (Integer)PharmacyAMMPriceSpin.getValue());
                JOptionPane.showMessageDialog(null, "Medicine Item " + mi.getName()+ " created successfully!");
                populateTable();
                PharmacyAMMAddButton.setEnabled(true);
                PharmacyAMMNameText.setText("");
                PharmacyAMMNameText.setEnabled(false);
                PharmacyAMMPriceSpin.setValue(0);
                PharmacyAMMPriceSpin.setEnabled(false);
                PharmacyAMMSubmitButton.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Medicine already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_PharmacyAMMSubmitButtonActionPerformed

    private void PharmacyAMMBackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyAMMBackButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_PharmacyAMMBackButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PharmacyAMMAddButton;
    private javax.swing.JButton PharmacyAMMBackButton1;
    private javax.swing.JButton PharmacyAMMDeleteButton;
    private javax.swing.JLabel PharmacyAMMLabel;
    private javax.swing.JLabel PharmacyAMMLabel1;
    private javax.swing.JLabel PharmacyAMMMedicineLabel;
    private javax.swing.JLabel PharmacyAMMNameLabel;
    private javax.swing.JTextField PharmacyAMMNameText;
    private javax.swing.JLabel PharmacyAMMPriceLabel;
    private javax.swing.JSpinner PharmacyAMMPriceSpin;
    private javax.swing.JButton PharmacyAMMSubmitButton;
    private javax.swing.JButton PharmacyAMMViewButton;
    private javax.swing.JLabel PharmacyAMMvalueLabel1;
    private javax.swing.JTable PharmacyTable1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)PharmacyTable1.getModel();
        dtm.setRowCount(0);
        if(pharmacy.getMedicineCatalog().getMedicineItemList() != null)
        {
            for(MedicineItem mi : pharmacy.getMedicineCatalog().getMedicineItemList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = mi.getId();
                row[1] = mi;
                row[2] = mi.getPrice();
                dtm.addRow(row);
            }
        }
        if(dtm.getRowCount() == 0)
            {
                PharmacyAMMDeleteButton.setEnabled(false);
                PharmacyAMMViewButton.setEnabled(false);
            }
    }

    private boolean validateThis() {
        if("".equals(PharmacyAMMNameText.getText()))
        {
            JOptionPane.showMessageDialog(null,"Name cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if((Integer)PharmacyAMMPriceSpin.getValue() <= 0)
        {
            JOptionPane.showMessageDialog(null,"Price must be above 0!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
}
