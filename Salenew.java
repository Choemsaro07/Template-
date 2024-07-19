
package Template;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Salenew extends javax.swing.JFrame {
    public static DefaultTableModel mod=new DefaultTableModel();
    public Salenew() {
        initComponents(); 
        mod.addColumn("name");
        mod.addColumn("price");
        mod.addColumn("qty");
        mod.addColumn("total");
        txttablesale.setModel(mod);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        product15 = new Template.Product1();
        product16 = new Template.Product1();
        product17 = new Template.Product1();
        product18 = new Template.Product1();
        txtBack = new javax.swing.JButton();
        txtGo = new javax.swing.JButton();
        product20 = new Template.Product1();
        txtdelete = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttablesale = new javax.swing.JTable();
        txtpayment = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        product15.setPrice("1.25$");
        product15.setTitle("Caffe");

        product16.setPrice("1.75$");
        product16.setTitle("String");

        product17.setPrice("1.75$");
        product17.setTitle("Soda");

        product18.setPrice("1.25$");
        product18.setTitle("Coca");

        txtBack.setBackground(new java.awt.Color(204, 255, 204));
        txtBack.setFont(new java.awt.Font("Romnea", 1, 18)); // NOI18N
        txtBack.setText("Back");
        txtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBackActionPerformed(evt);
            }
        });

        txtGo.setBackground(new java.awt.Color(204, 255, 204));
        txtGo.setFont(new java.awt.Font("Romnea", 1, 18)); // NOI18N
        txtGo.setText("GO");
        txtGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGoActionPerformed(evt);
            }
        });

        product20.setPrice("1.5$");
        product20.setTitle("Ice Cream");

        txtdelete.setText("Delete");
        txtdelete.setActionCommand("Payment");
        txtdelete.setFont(new java.awt.Font("Romnea", 1, 18)); // NOI18N
        txtdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeleteActionPerformed(evt);
            }
        });

        txttablesale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Price", "Qty", "Total"
            }
        ));
        txttablesale.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txttablesaleAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txttablesale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttablesaleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txttablesale);

        txtpayment.setText("Payment");
        txtpayment.setFont(new java.awt.Font("Romnea", 1, 18)); // NOI18N
        txtpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(product20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(product15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(product17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(product16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(product18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(product20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBackActionPerformed
        Salenew.main(null);
        this.dispose();

    }//GEN-LAST:event_txtBackActionPerformed

    private void txtGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGoActionPerformed
        Product.main(null);
        this.dispose();
    }//GEN-LAST:event_txtGoActionPerformed
    int count=0;

    private void txtdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeleteActionPerformed
        if(count>0){
            int row=txttablesale.getSelectedRow();
            mod.removeRow(row);
        }
        count=0;
        
        JOptionPane.showMessageDialog(this, "Delete susccess..");
    }//GEN-LAST:event_txtdeleteActionPerformed

    private void txttablesaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttablesaleMouseClicked
    
    }//GEN-LAST:event_txttablesaleMouseClicked

    private void txtpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaymentActionPerformed
        Recept.main(null);
        this.dispose();
        
    }//GEN-LAST:event_txtpaymentActionPerformed

    private void txttablesaleAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txttablesaleAncestorAdded
        
    }//GEN-LAST:event_txttablesaleAncestorAdded

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salenew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private Template.Product1 product15;
    private Template.Product1 product16;
    private Template.Product1 product17;
    private Template.Product1 product18;
    private Template.Product1 product20;
    private javax.swing.JButton txtBack;
    private javax.swing.JButton txtGo;
    private com.k33ptoo.components.KButton txtdelete;
    private com.k33ptoo.components.KButton txtpayment;
    private javax.swing.JTable txttablesale;
    // End of variables declaration//GEN-END:variables
}
