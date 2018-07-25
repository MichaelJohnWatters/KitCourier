/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javax.swing.JOptionPane;

/**
 * This class Creates the Frame that displays the login box to the user.
 * 
 * @date 02/05/2018
 * @author mjwat
 */
public class FrameLogin extends javax.swing.JFrame {

    
    DatabaseConnection databaseConnection = null;

    /**
     * Creates new form Login
     */
    public FrameLogin() {
        initComponents();
        setLocationRelativeTo(null);
        databaseConnection = new DatabaseConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        tpPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpId = new javax.swing.JTextPane();
        lblTitle = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(400, 350));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 350));
        getContentPane().setLayout(null);

        lblId.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("Login Name:");
        getContentPane().add(lblId);
        lblId.setBounds(0, 120, 120, 50);

        lblPassword.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(10, 170, 110, 30);

        tpPassword.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(tpPassword);
        tpPassword.setBounds(120, 170, 160, 30);

        btnLogin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(120, 210, 160, 30);

        tpId.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(tpId);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 130, 160, 30);

        lblTitle.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("KitCourier");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(0, 20, 400, 40);

        lblBackground.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblBackground.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/img5190_PG22-Construction.jpg"))); // NOI18N
        lblBackground.setToolTipText("");
        lblBackground.setMaximumSize(new java.awt.Dimension(400, 350));
        lblBackground.setMinimumSize(new java.awt.Dimension(400, 350));
        lblBackground.setPreferredSize(new java.awt.Dimension(400, 350));
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 400, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /***
     * When this button si press it check whether or not the user login is valid
     * if valid user is given access to application
     * 
     * @author Michael Watters
     * @date 02/05/2018
     * @param evt 
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String id = null;
        String loginName = null;
        String password = null;

        id = tpId.getText();
        loginName = tpId.getText();
        password = tpPassword.getText();

        Login login = new Login(loginName, password);

        if (loginName == null || password == null) {
            JOptionPane message = new JOptionPane();
            JOptionPane.showMessageDialog(message, "Login Not Successful");
        } else if (login.validateLogin() == true) {
            JOptionPane message = new JOptionPane();
            JOptionPane.showMessageDialog(message, "Login Successful!");
            this.dispose();
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
        } else {
            JOptionPane message = new JOptionPane();
            JOptionPane.showMessageDialog(message, "Login Not Successful");
        }//else

    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }//main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextPane tpId;
    private javax.swing.JPasswordField tpPassword;
    // End of variables declaration//GEN-END:variables
}
