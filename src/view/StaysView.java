/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.*;

/**
 *
 * @author lenovo
 */
public class StaysView extends javax.swing.JPanel {
    private Stays selectedStay;
    private ArrayList<Stays> stays;
    /**
     * Creates new form StaysViewF
     */
    public StaysView() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        staysTable = new javax.swing.JTable();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        staysTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Hotel", "Check In", "Check Out", "Due", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(staysTable);

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(editButton)
                .addGap(110, 110, 110)
                .addComponent(deleteButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(deleteButton))
                .addGap(218, 218, 218))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = staysTable.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to edit", "Cannot edit user", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        TableModel model = staysTable.getModel();
        Object hotelName = model.getValueAt(selectedIndex,1);
        Object checkInDate = model.getValueAt(selectedIndex, 2);
        Object checkOutDate = model.getValueAt(selectedIndex, 3);
        Object price = model.getValueAt(selectedIndex, 4);
        Object feedback = model.getValueAt(selectedIndex, 5);
        Object id = model.getValueAt(selectedIndex,0);
//        Object guestEmail = model.getValueAt(selectedIndex, 6);
        
//        stays = Database.getAllStays();
//        selectedStay = globalModel.get(selectedIndex);
        UpdateBooking ub = new UpdateBooking();
        ub.hotelNameInput.setText(hotelName.toString());
        ub.checkInInput.setText(checkInDate.toString());
        ub.checkOutInput.setText(checkOutDate.toString());
        ub.priceInput.setText(price.toString());
        ub.feedbackInput.setText(feedback.toString());
        ub.getId(id.toString());
//        ub.guestEmailInput.setText(selectedStay.getGuestEmail());
//        ub.guestid = selectedStay.getGuestId();
        
        JFrame frame = new JFrame("Edit Booking");
//        JPanel panel = new UpdateBooking();
        JPanel panel = ub;
        frame.add(panel);
        frame.setSize(750, 600);
        frame.setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = staysTable.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete", "Cannot delete user", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        try {
//            selectedStay = users.get(selectedIndex);
            DefaultTableModel model = (DefaultTableModel) staysTable.getModel();
            int selectedGuestID = (int) model.getValueAt(selectedIndex, 0);
            Database.deleteStay(selectedGuestID);
            JOptionPane.showMessageDialog(null, "Stay Deleted Successfully", "Successfully Deleted", JOptionPane.PLAIN_MESSAGE);
//            clearFields();
//            populateData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    public void getStayArray(){
        this.stays = stays;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable staysTable;
    // End of variables declaration//GEN-END:variables
}
