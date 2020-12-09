/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import Control.SalespersonControl;
import Entity.Salesperson;
import javax.swing.JOptionPane;

/**
 *
 * @author ryancavanagh
 */
public class EditSalesperson extends javax.swing.JFrame {

    /**
     * Creates new form EditSalesperson
     */
    
    private Salesperson s;
    
    public EditSalesperson(Salesperson s1) {
        initComponents();
        s = s1;
        firstName.setText(s.getFirstname());
        lastName.setText(s.getLastname());
        streetAddress.setText(s.getAddress());
        city.setText(s.getCity());
        email.setText(s.getEmail());
        state.setText(s.getState());
        rate.setText(Double.toString(s.getCommissionrate()));
        phoneNumber.setText(s.getPhone());
        zipCode.setText(Integer.toString(s.getZip()));
        active.setSelected(s.getActive());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveSalesperson = new javax.swing.JButton();
        lastName = new javax.swing.JTextField();
        canelButton = new javax.swing.JButton();
        streetAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        zipCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        active = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        saveSalesperson.setText("Save");
        saveSalesperson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSalespersonActionPerformed(evt);
            }
        });

        canelButton.setText("Cancel");
        canelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canelButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Street Address");

        jLabel5.setText("City");

        jLabel6.setText("State");

        jLabel9.setText("Phone Number");

        jLabel7.setText("Zip Code");

        jLabel8.setText("Email");

        rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateActionPerformed(evt);
            }
        });

        jLabel1.setText("Edit Salesperson");

        jLabel10.setText("Commission Rate");

        active.setText("Active");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveSalesperson)
                        .addGap(18, 18, 18)
                        .addComponent(canelButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(20, 20, 20))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(streetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(active))
                        .addGap(17, 17, 17))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(streetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(active))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveSalesperson)
                    .addComponent(canelButton))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateActionPerformed

    private void saveSalespersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSalespersonActionPerformed
        // TODO add your handling code here:
        try {
            SalespersonControl sp = Main.Main.controlfactory.getSalesperson();
            s.setFirstname(firstName.getText());
            s.setLastname(lastName.getText());
            s.setPhone(phoneNumber.getText());
            s.setEmail(email.getText());
            s.setAddress(streetAddress.getText());
            s.setCity(city.getText());
            s.setState(state.getText());
            s.setZip(Integer.parseInt(zipCode.getText()));
            s.setActive(active.isSelected());
            sp.saveSalesperson(s);
            this.setVisible(false);
            new ViewEditSalesperson().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please fill out all info correctly.", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveSalespersonActionPerformed

    private void canelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canelButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ViewEditSalesperson().setVisible(true);
    }//GEN-LAST:event_canelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EditSalesperson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditSalesperson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditSalesperson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditSalesperson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditSalesperson().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox active;
    private javax.swing.JButton canelButton;
    private javax.swing.JTextField city;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField rate;
    private javax.swing.JButton saveSalesperson;
    private javax.swing.JTextField state;
    private javax.swing.JTextField streetAddress;
    private javax.swing.JTextField zipCode;
    // End of variables declaration//GEN-END:variables
}