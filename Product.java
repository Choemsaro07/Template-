
package Template;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Product extends javax.swing.JFrame {
    DefaultTableModel mod=new DefaultTableModel();
    String path;
    
    
    public Product() {
        initComponents();
        mod.addColumn("Code");
        mod.addColumn("name");
        mod.addColumn("price");
        mod.addColumn("qty");
        mod.addColumn("total");
        txttable.setModel(mod);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBackpro = new javax.swing.JButton();
        txtGopro = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txttable = new javax.swing.JTable();
        txtdelete = new com.k33ptoo.components.KButton();
        txttatal = new com.k33ptoo.components.KButton();
        txtupdate = new com.k33ptoo.components.KButton();
        txtsave = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Shop mart for Group1");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setText("Qty");

        txtBackpro.setBackground(new java.awt.Color(204, 255, 204));
        txtBackpro.setFont(new java.awt.Font("Khmer Unicode N2", 1, 24)); // NOI18N
        txtBackpro.setForeground(new java.awt.Color(255, 102, 153));
        txtBackpro.setText("Back");
        txtBackpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBackproActionPerformed(evt);
            }
        });

        txtGopro.setBackground(new java.awt.Color(204, 255, 204));
        txtGopro.setFont(new java.awt.Font("Khmer Unicode N2", 1, 24)); // NOI18N
        txtGopro.setForeground(new java.awt.Color(255, 102, 153));
        txtGopro.setText("GO");
        txtGopro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGoproActionPerformed(evt);
            }
        });

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setText("Code");

        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtprice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtcode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtqty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtqty.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txttable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        txttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txttable);

        txtdelete.setText("Delete");
        txtdelete.setActionCommand("Payment");
        txtdelete.setFont(new java.awt.Font("Romnea", 1, 18)); // NOI18N
        txtdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeleteActionPerformed(evt);
            }
        });

        txttatal.setText("Total");
        txttatal.setActionCommand("Payment");
        txttatal.setFont(new java.awt.Font("Romnea", 1, 18)); // NOI18N
        txttatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttatalActionPerformed(evt);
            }
        });

        txtupdate.setText("Update");
        txtupdate.setActionCommand("Payment");
        txtupdate.setFont(new java.awt.Font("Romnea", 1, 18)); // NOI18N
        txtupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateActionPerformed(evt);
            }
        });

        txtsave.setText("Save");
        txtsave.setActionCommand("Payment");
        txtsave.setFont(new java.awt.Font("Romnea", 1, 18)); // NOI18N
        txtsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBackpro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGopro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsave, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttatal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBackpro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGopro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBackproActionPerformed
        Salenew.main(null);
        this.dispose();
    }//GEN-LAST:event_txtBackproActionPerformed

    private void txtGoproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGoproActionPerformed
        Staffdata.main(null);
        this.dispose();
    }//GEN-LAST:event_txtGoproActionPerformed

    private void txttatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttatalActionPerformed
//        String price=txtprice.getText();
//        String Qty=txtqty.getText();
//        String SPrice=price.substring(0,price.length()-1);
//        float Price=Float.parseFloat(SPrice);
//        int qty=Integer.parseInt(Qty);
//        double total=Price*qty;
//        JOptionPane.showMessageDialog(null,total+"$");



         try {
        String price = txtprice.getText();
        String Qty = txtqty.getText();

        String sanitizedPrice = price.substring(0, price.length() - 1);
        float priceValue = Float.parseFloat(sanitizedPrice);
        int qtyValue = Integer.parseInt(Qty);

        double total = priceValue * qtyValue;

        JOptionPane.showMessageDialog(null, total + "$");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter valid numeric values.");
    } catch (StringIndexOutOfBoundsException e) {
        JOptionPane.showMessageDialog(null, "Price input is not valid.");
    }
    }//GEN-LAST:event_txttatalActionPerformed

    private void txtsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaveActionPerformed
        float total;
        String code=txtcode.getText();
        String name=txtname.getText();
        String price=txtprice.getText();
        String qty=txtqty.getText();
        
        Object row[]={code,name,price,qty,path};
        
        mod.addRow(row);
        JOptionPane.showMessageDialog(this, "Save Data susccess..");
        
    }//GEN-LAST:event_txtsaveActionPerformed
    int a=0;
    int count;
    private void txttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttableMouseClicked
        count++;
        a++;
        int row=txttable.getSelectedRow();
        
        String code=txttable.getValueAt(row, 0)+"";
        String name=txttable.getValueAt(row,  1)+"";
        String price=txttable.getValueAt(row, 2)+"";
        String qty=txttable.getValueAt(row, 3)+"";
        txtcode.setText(code);
        txtname.setText(name);
        txtprice.setText(price);
        txtqty.setText(qty);
        
        
        
    }//GEN-LAST:event_txttableMouseClicked

    private void txtdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeleteActionPerformed
        if(count>0){
            int row=txttable.getSelectedRow();
            mod.removeRow(row);
        }
        count=0;
        JOptionPane.showMessageDialog(this, "Delete susccess..");
    }//GEN-LAST:event_txtdeleteActionPerformed

    private void txtupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateActionPerformed
        
        
        String code=txtcode.getText();
        String name=txtname.getText();
        String price=txtprice.getText();
        String qty=txtqty.getText(); 

        int row=txttable.getSelectedRow();
        
        mod.setValueAt(code, row, 0);
        mod.setValueAt(name, row, 1);
        mod.setValueAt(price, row, 2);
        mod.setValueAt(qty, row, 3);

       
       a=0;
        
    }//GEN-LAST:event_txtupdateActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton txtBackpro;
    private javax.swing.JButton txtGopro;
    private javax.swing.JTextField txtcode;
    private com.k33ptoo.components.KButton txtdelete;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtqty;
    private com.k33ptoo.components.KButton txtsave;
    private javax.swing.JTable txttable;
    private com.k33ptoo.components.KButton txttatal;
    private com.k33ptoo.components.KButton txtupdate;
    // End of variables declaration//GEN-END:variables
}
