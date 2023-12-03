/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import model.*;

/**
 *
 * @author lenovo
 */
public class UpdateBooking extends javax.swing.JPanel {
public int guestid;
    /**
     * Creates new form UpdateBooking
     */
    public UpdateBooking() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hotelNameInput = new javax.swing.JTextField();
        checkInInput = new javax.swing.JTextField();
        checkOutInput = new javax.swing.JTextField();
        priceInput = new javax.swing.JTextField();
        feedbackInput = new javax.swing.JTextField();
        createBookingButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        guestEmailInput = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Update Booking");

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Hotel Name:");

        jLabel3.setText("Check In:");

        jLabel4.setText("Check Out");

        jLabel5.setText("Price:");

        jLabel6.setText("Feedback:");

        feedbackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackInputActionPerformed(evt);
            }
        });

        createBookingButton.setText("Update Booking");
        createBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBookingButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Guest Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hotelNameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(checkInInput)
                            .addComponent(checkOutInput)
                            .addComponent(priceInput)
                            .addComponent(feedbackInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guestEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(createBookingButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hotelNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(checkInInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(guestEmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkOutInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(priceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(feedbackInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(createBookingButton)
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
//        JPanel panel = new AdminPage();
        currentFrame.dispose();
//        JFrame frame = new JFrame("Admin Page");
//        frame.add(panel);
//        frame.setSize(750,600);
//        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void feedbackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackInputActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_feedbackInputActionPerformed

    private void createBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBookingButtonActionPerformed
        // TODO add your handling code here:
        
        Stays stayDetails = new Stays();
        stayDetails.setHotelName(hotelNameInput.getText());
        stayDetails.setCheckInDate(checkInInput.getText());
        stayDetails.setCheckOutDate(checkOutInput.getText());
        stayDetails.setPrice(priceInput.getText());
        stayDetails.setFeedback(feedbackInput.getText());
        stayDetails.setGuestEmail(guestEmailInput.getText());
        
//        Stays newStay = new Stays();
//        newStay.setHotelName(hotelNameInput.getText());
//        newStay.setCheckInDate(checkInInput.getText());
//        newStay.setCheckOutDate(checkOutInput.getText());
//        newStay.setPrice(priceInput.getText());
//        newStay.setFeedback(feedbackInput.getText());
//        newStay.setGuestEmail(guestEmailInput.getText());

//        ViewPanel newViewPanel = new ViewPanel(newUser);

        try {
//            newUser.setAge(Integer.parseInt(ageField.getText()));
//            newUser.setName(nameField.getText());
//insert into db
            Database.updateBooking(stayDetails, guestid);
            JOptionPane.showMessageDialog(null, "User Edited Successfully", "Successful Edit", JOptionPane.PLAIN_MESSAGE);
//            clearFields();
//            populateData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

//        Database.updateBooking(stayDetails);

        clearForm();

        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        JPanel panel = new AdminPage();
        currentFrame.dispose();
        JFrame frame = new JFrame("Admin Page");
        frame.add(panel);
        frame.setSize(750,600);
        frame.setVisible(true);
    }//GEN-LAST:event_createBookingButtonActionPerformed

    private void clearForm(){
        hotelNameInput.setText("");
        checkInInput.setText("");
        checkOutInput.setText("");
        priceInput.setText("");
        feedbackInput.setText("");
        guestEmailInput.setText("");
//        CityInput.setText("");
//        StateInput.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField checkInInput;
    public javax.swing.JTextField checkOutInput;
    public javax.swing.JButton createBookingButton;
    public javax.swing.JTextField feedbackInput;
    public javax.swing.JTextField guestEmailInput;
    public javax.swing.JTextField hotelNameInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JTextField priceInput;
    // End of variables declaration//GEN-END:variables
}
