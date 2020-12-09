/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import Control.SalespersonControl;
import Entity.Salesperson;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ryancavanagh
 */
public class ViewEditSalesperson extends javax.swing.JFrame {

    /**
     * Creates new form ViewSalesperson
     */
    public ViewEditSalesperson() {
        initComponents();
        updateTable();
    }
    
    private void updateTable (){
        SalespersonControl sp = Main.Main.controlfactory.getSalesperson();
        List <Salesperson> list = sp.getSalespersonResultSet(); 
        
        DefaultTableModel model = (DefaultTableModel) salespersonTable.getModel();
//        List<Salesperson> list = lst;
        Object rowData[] = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).getSalespersonid();
            rowData[1] = list.get(i).getFirstname() + " " + list.get(i).getLastname();
            rowData[2] = list.get(i).getTotalsales();
            rowData[3] = list.get(i).getTotalcommission();
            model.addRow(rowData);
        }
//        java.sql.ResultSet rs1 = (java.sql.ResultSet) rs;
//        SalespersonTable.setModel(DbUtils.resultSetToTableModel(rs));
       
    }
    
    private Object selectSalespersonInTable(){
        if (salespersonTable.getRowCount() == 0){
            System.out.println(salespersonTable.getRowCount());
            return 0;
        } else {
            int row = salespersonTable.getSelectedRow();
            Object sp = salespersonTable.getValueAt(row, 0);

            return sp;
        }
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
        salespersonTable = new javax.swing.JTable();
        editSalespersonBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salespersonTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Number", "Salesperson Name", "Total Sales", "Total Commission"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salespersonTable);

        editSalespersonBtn.setText("Edit Selected Salesperon");
        editSalespersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSalespersonBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(editSalespersonBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editSalespersonBtn)
                    .addComponent(backBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editSalespersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSalespersonBtnActionPerformed

        // TODO add your handling code here:
        try {
            //TODO pass salesperson object in
            Salesperson s1 = Main.Main.em.find(Salesperson.class, selectSalespersonInTable());
    //        System.out.println("s1: " + s1.toString() + " ||| fname: " +s1.getFirstname() + " ||| lname: " + s1.getLastname() + " ||| address, city, state, zip: " + s1.getAddress() + s1.getCity() + s1.getState() + s1.getZip() + " ||| phone, email: " + s1.getPhone() + s1.getEmail() + " ||| commission rate: " + s1.getCommissionrate());
            new EditSalesperson(s1).setVisible(true);
            this.setVisible(false);
        }
        catch (Exception ArrayIndexOutOfBoundsException){
            JOptionPane.showMessageDialog(null, "Select One Salesperson.", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editSalespersonBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Manage().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEditSalesperson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEditSalesperson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEditSalesperson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEditSalesperson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEditSalesperson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton editSalespersonBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable salespersonTable;
    // End of variables declaration//GEN-END:variables
}
