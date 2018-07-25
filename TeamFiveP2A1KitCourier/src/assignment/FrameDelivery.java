/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *This class creates the Delivery Frame where user can place orders for items.
 * 
 * @author mjwat
 */
public class FrameDelivery extends javax.swing.JFrame {

    /**
     * Creates new form Order
     */
    private DatabaseConnection databaseConnection;
    private int currentIndex;
    private int numberOfRecords;
    private String builderID = Main.builderID;
    private Item sArray[] = null;
    //private javax.swing.DefaultListModel listModel;

    public FrameDelivery() {
        initComponents();
        setLocationRelativeTo(null);
        txtBuilderID.setText(builderID);
        databaseConnection = new DatabaseConnection();

        //Loading items into drop downlist.
        sArray = databaseConnection.getAllItemsTest();
        cmbItem.removeAllItems();
        int sNum = databaseConnection.numRecordsInQuery;

        for (int i = 0; i < sNum; i++) {
            Item s = sArray[i];
            StringBuilder sb = new StringBuilder();

            sb.append(s.getItemName());

            cmbItem.addItem(sb.toString());
        }//for
    }//frameDelivery

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnPlaceOrder = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        lblMap = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblBuilderID = new javax.swing.JLabel();
        lblRequestedTime = new javax.swing.JLabel();
        txtRequestedTime = new javax.swing.JTextField();
        lblNotes = new javax.swing.JLabel();
        lblYourOrders = new javax.swing.JLabel();
        txtBuilderID = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOrderDetails = new javax.swing.JTextArea();
        cmbLocation = new javax.swing.JComboBox<>();
        cmbItem = new javax.swing.JComboBox<>();
        txtNotes = new javax.swing.JTextField();
        lblWhiteBackground = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        txtPlaced = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblTitle.setText("Order Screen");
        lblTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblTitle);
        lblTitle.setBounds(330, 20, 180, 30);

        btnPlaceOrder.setText("Add Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder);
        btnPlaceOrder.setBounds(640, 80, 120, 30);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome);
        btnHome.setBounds(700, 20, 73, 32);

        lblMap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/corbygate-business-park-plan-popup.jpg"))); // NOI18N
        lblMap.setToolTipText("");
        lblMap.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblMap.setAutoscrolls(true);
        lblMap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        lblMap.setPreferredSize(new java.awt.Dimension(370, 220));
        lblMap.setRequestFocusEnabled(false);
        getContentPane().add(lblMap);
        lblMap.setBounds(10, 60, 380, 220);

        lblLocation.setText("Location:");
        getContentPane().add(lblLocation);
        lblLocation.setBounds(440, 160, 60, 20);

        lblItem.setText("Item:");
        getContentPane().add(lblItem);
        lblItem.setBounds(460, 120, 100, 30);

        lblQuantity.setText("Quantity:");
        getContentPane().add(lblQuantity);
        lblQuantity.setBounds(440, 200, 60, 20);

        lblBuilderID.setText("BuilderID:");
        getContentPane().add(lblBuilderID);
        lblBuilderID.setBounds(440, 90, 60, 20);

        lblRequestedTime.setText("Requested Time:");
        getContentPane().add(lblRequestedTime);
        lblRequestedTime.setBounds(405, 240, 95, 20);
        getContentPane().add(txtRequestedTime);
        txtRequestedTime.setBounds(500, 240, 260, 24);

        lblNotes.setText("Notes:");
        getContentPane().add(lblNotes);
        lblNotes.setBounds(450, 290, 100, 16);

        lblYourOrders.setBackground(java.awt.Color.white);
        lblYourOrders.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblYourOrders.setText("Your Last Order Details");
        lblYourOrders.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblYourOrders.setOpaque(true);
        getContentPane().add(lblYourOrders);
        lblYourOrders.setBounds(10, 290, 220, 20);

        txtBuilderID.setEditable(false);
        getContentPane().add(txtBuilderID);
        txtBuilderID.setBounds(500, 90, 50, 24);

        txtQuantity.setText("1");
        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(500, 200, 260, 24);

        txtOrderDetails.setEditable(false);
        txtOrderDetails.setColumns(20);
        txtOrderDetails.setRows(5);
        jScrollPane1.setViewportView(txtOrderDetails);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 310, 380, 140);

        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Building A Level 1", "Building A Level 2", "Building B Level 1", "Building B Level 2", "Building C Level 1", "Building C Level 2", " " }));
        getContentPane().add(cmbLocation);
        cmbLocation.setBounds(500, 160, 260, 26);

        cmbItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hammer", "Spade", "Nails", "Cement", "Bricks", "Timber", "Windows", "Door", "Spirit Level", "Jack Hammer", "PVC Pipe" }));
        getContentPane().add(cmbItem);
        cmbItem.setBounds(500, 120, 260, 26);
        getContentPane().add(txtNotes);
        txtNotes.setBounds(500, 280, 260, 120);

        lblWhiteBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/whiteBackground.png"))); // NOI18N
        lblWhiteBackground.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(lblWhiteBackground);
        lblWhiteBackground.setBounds(400, 60, 380, 360);

        lblBackground.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shutterstock_617032220.jpg"))); // NOI18N
        lblBackground.setToolTipText("");
        lblBackground.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 800, 500);

        txtPlaced.setText("Placed");
        getContentPane().add(txtPlaced);
        txtPlaced.setBounds(430, 450, 180, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This button allows the user to return to home page
     */
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        this.dispose();
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed
/**
 * This button allows the user to place Orders
 * 
 * @date 02/05/2018
 * @author Michael Watters
 * @param evt 
 */
    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        boolean done = databaseConnection.insertOrder((cmbItem.getSelectedIndex() + 1),
                Integer.parseInt(txtBuilderID.getText()),
                1,//temp value for courier
                ("Quantity: " + txtQuantity.getText() + "\n" + txtNotes.getText()),
                txtRequestedTime.getText(),
                (cmbLocation.getSelectedIndex() + 1), txtPlaced.getText());

        if (done == true) {
            JOptionPane.showMessageDialog(this, "Order added", "Adding Record", JOptionPane.PLAIN_MESSAGE);
            //Set selected order
            String yourOrderDetails = "";
            yourOrderDetails = yourOrderDetails + "Requested Time: " + txtRequestedTime.getText()
                    + "\nItem: " + cmbItem.getItemAt(cmbItem.getSelectedIndex())
                    + "\nQuantity: " + txtQuantity.getText()
                    + "\nLocation: " + cmbLocation.getItemAt(cmbLocation.getSelectedIndex())
                    + "\nNotes: " + txtNotes.getText();
            txtOrderDetails.setText(yourOrderDetails);
            txtQuantity.setText("1");
            txtNotes.setText("");
            txtRequestedTime.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Order not added", "Error", JOptionPane.PLAIN_MESSAGE);
        }//else

    }//GEN-LAST:event_btnPlaceOrderActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDelivery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox<String> cmbItem;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBuilderID;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMap;
    private javax.swing.JLabel lblNotes;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRequestedTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWhiteBackground;
    private javax.swing.JLabel lblYourOrders;
    private javax.swing.JTextField txtBuilderID;
    private javax.swing.JTextField txtNotes;
    private javax.swing.JTextArea txtOrderDetails;
    private javax.swing.JTextField txtPlaced;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRequestedTime;
    // End of variables declaration//GEN-END:variables
}