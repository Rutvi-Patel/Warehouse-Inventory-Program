/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import Control.TableCellListener;
import Control.ProductControl;
import Entity.Product;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Psyric
 */
public class EditProductQuantity extends javax.swing.JFrame {

    /**
     * Creates new form EditQuantity
     */
    
    private String p;
    public EditProductQuantity(String p1) {
        p = p1;
        initComponents();
        productName.setText("Product: " + p);
        updateTable();
        TableCellListener obs = new TableCellListener(warehouseTable, action);
    }
    
    private void updateTable (){
        ProductControl pc = Main.Main.controlfactory.getProduct();
        List <Product> list = pc.getSingleProductResultSet(p); 
        
        DefaultTableModel model = (DefaultTableModel) warehouseTable.getModel();
        Object rowData[] = new Object[2];
        for(int i = 0; i < list.size(); i++)
        {
            rowData[0] = list.get(i).getWarehouse().getWarehousename();
            rowData[1] = list.get(i).getQuantity();
            model.addRow(rowData);
        }
//        java.sql.ResultSet rs1 = (java.sql.ResultSet) rs;
//        SalespersonTable.setModel(DbUtils.resultSetToTableModel(rs));
       
    }
    
    Action action = new AbstractAction()
    {
        public void actionPerformed(ActionEvent e)
        {
            TableCellListener tcl = (TableCellListener)e.getSource();
            if (!tcl.getNewValue().equals(tcl.getOldValue())) {
                ProductControl pc = Main.Main.controlfactory.getProduct();
                if (Integer.parseInt(tcl.getNewValue().toString()) < 0){
                    warehouseTable.setValueAt(0, tcl.getRow(), 2);
                    pc.updateQuantity(p, warehouseTable.getValueAt(tcl.getRow(), 0).toString(), 0);
                    JOptionPane.showMessageDialog(null, "Quantity must be greater than or equal to 0", "Alert", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    pc.updateQuantity(p, warehouseTable.getValueAt(tcl.getRow(), 0).toString(), Integer.parseInt(tcl.getNewValue().toString()));
                }
            }
        }
    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        warehouseTable = new javax.swing.JTable();
        saveQuantity = new javax.swing.JButton();
        productName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        warehouseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Warehouse Name", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(warehouseTable);

        saveQuantity.setText("Save Quantities");
        saveQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveQuantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(productName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(saveQuantity)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(productName)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(saveQuantity)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveQuantityActionPerformed
        // TODO add your handling code here:
        try {
            warehouseTable.editCellAt(warehouseTable.getEditingRow(), 0);
        }
        catch (Exception e) {
            
        }
        this.setVisible(false);
        new ManageProducts().setVisible(true);
    }//GEN-LAST:event_saveQuantityActionPerformed

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
//            java.util.logging.Logger.getLogger(EditProductQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditProductQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditProductQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditProductQuantity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditProductQuantity().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel productName;
    private javax.swing.JButton saveQuantity;
    private javax.swing.JTable warehouseTable;
    // End of variables declaration//GEN-END:variables
}
