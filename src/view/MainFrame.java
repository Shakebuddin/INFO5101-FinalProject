/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author lenovo
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

        WelcomeLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        MembershipLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JSplitPane();
        buttonPanelTOP = new javax.swing.JPanel();
        ProfileButton = new javax.swing.JButton();
        StaysButton = new javax.swing.JButton();
        MembershipsButton = new javax.swing.JButton();
        VouchersButton = new javax.swing.JButton();
        displayPanelBOT = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        WelcomeLabel.setText("Welcome, XYZ!");

        logoutButton.setText("Logout");

        NameLabel.setText("Name:");

        PhoneLabel.setText("Phone:");

        EmailLabel.setText("Email:");

        MembershipLabel.setText("Membership Tier:");

        mainPanel.setDividerLocation(40);
        mainPanel.setDividerSize(3);
        mainPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        buttonPanelTOP.setBackground(new java.awt.Color(255, 102, 102));

        ProfileButton.setText("Profile");

        StaysButton.setText("Stays");

        MembershipsButton.setText("Memberships");
        MembershipsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembershipsButtonActionPerformed(evt);
            }
        });

        VouchersButton.setText("Vouchers");
        VouchersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VouchersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelTOPLayout = new javax.swing.GroupLayout(buttonPanelTOP);
        buttonPanelTOP.setLayout(buttonPanelTOPLayout);
        buttonPanelTOPLayout.setHorizontalGroup(
            buttonPanelTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelTOPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(StaysButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(MembershipsButton)
                .addGap(111, 111, 111)
                .addComponent(VouchersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        buttonPanelTOPLayout.setVerticalGroup(
            buttonPanelTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelTOPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProfileButton)
                    .addComponent(StaysButton)
                    .addComponent(MembershipsButton)
                    .addComponent(VouchersButton))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        mainPanel.setTopComponent(buttonPanelTOP);

        displayPanelBOT.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout displayPanelBOTLayout = new javax.swing.GroupLayout(displayPanelBOT);
        displayPanelBOT.setLayout(displayPanelBOTLayout);
        displayPanelBOTLayout.setHorizontalGroup(
            displayPanelBOTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        displayPanelBOTLayout.setVerticalGroup(
            displayPanelBOTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        mainPanel.setRightComponent(displayPanelBOT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(WelcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MembershipLabel)
                        .addGap(188, 188, 188))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WelcomeLabel)
                    .addComponent(logoutButton))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(MembershipLabel))
                .addGap(31, 31, 31)
                .addComponent(PhoneLabel)
                .addGap(18, 18, 18)
                .addComponent(EmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanel)
                .addGap(249, 249, 249))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MembershipsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembershipsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MembershipsButtonActionPerformed

    private void VouchersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VouchersButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VouchersButtonActionPerformed

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
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel MembershipLabel;
    private javax.swing.JButton MembershipsButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JButton StaysButton;
    private javax.swing.JButton VouchersButton;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JPanel buttonPanelTOP;
    private javax.swing.JPanel displayPanelBOT;
    private javax.swing.JButton logoutButton;
    private javax.swing.JSplitPane mainPanel;
    // End of variables declaration//GEN-END:variables
}