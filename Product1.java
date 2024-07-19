package Template;




import java.awt.Color;
import java.awt.Panel;
import javax.swing.Icon;


public class Product1 extends javax.swing.JPanel {
    private String price;
    private Icon img;
    private String title;
    int qty;
    public Icon getImg() {
        return img;
    }

    public void setImg(Icon img) {
        this.img = img;
        lbimg.setIcon(img);
    }
    
    public String getPrice() {
        return price;
    }

    
    public void setPrice(String price) {
        this.price = price;
        lbprice.setText(price);
    }
   
    public void setqty(String price) {
        this.price = price;
        lbprice.setText(price);
    }
    public void setTitle(String title){
        this.title=title;
        lbtitle.setText(title);
        
    }
    public String getTitle(){
        return title;
    }

    public Product1() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbimg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btbuy = new javax.swing.JButton();
        btcencel = new javax.swing.JButton();
        lbtitle = new javax.swing.JLabel();
        lbprice = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Template/ice.jpg"))); // NOI18N
        lbimg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel2.setText("name");

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel3.setText("Price");

        btbuy.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        btbuy.setText("Buy");
        btbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuyActionPerformed(evt);
            }
        });

        btcencel.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        btcencel.setText("Cencel ");
        btcencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcencelActionPerformed(evt);
            }
        });

        lbtitle.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lbtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbprice.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lbprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbprice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(lbtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btcencel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btbuy, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbimg)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbimg, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbprice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcencel)
                    .addComponent(btbuy))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    int count=0; float total;
    private void btbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuyActionPerformed

        int c=0;
        if(count>=0){
            count++;
            btbuy.setText("Buy" +count); 
            
        }
        btbuy.setBackground(Color.red);
        int row=Salenew.mod.getRowCount();
        for(int i=0;i<row;i++){
            String temp=Salenew.mod.getValueAt(i, 0)+"";
            if(title.equals(temp)){
                c++;
                Salenew.mod.setValueAt(count, i, 2);
            }
            
        }
        if(c==0){
            Object ob[]={title,price,count,total};
            Salenew.mod.addRow(ob);
        }
        
        
    }//GEN-LAST:event_btbuyActionPerformed

    private void btcencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcencelActionPerformed
        int c=0;
        if(count>0){
            count--;
            btbuy.setText("Buy"+count);
             
             
        }
        btcencel.setBackground(Color.green);
        int row=Salenew.mod.getRowCount();
        for(int i=0;i<row;i++){
            String temp=Salenew.mod.getValueAt(i, 0)+"";
            if(title.equals(temp)){
                c--;
                Salenew.mod.setValueAt(count, i, 2);
            }
            
        }
        if(c==0){
            Object ob[]={title,price,count,total};
            Salenew salenew = new Salenew();
            
            Salenew.mod.addRow(ob);
        }
        
    }//GEN-LAST:event_btcencelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuy;
    private javax.swing.JButton btcencel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbimg;
    private javax.swing.JLabel lbprice;
    private javax.swing.JLabel lbtitle;
    // End of variables declaration//GEN-END:variables
}
