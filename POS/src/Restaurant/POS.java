
package Restaurant;

import Restaurant.MealBuilder;
import Restaurant.meal;
import java.util.Formatter;
import javax.swing.table.DefaultTableModel;

public class POS extends javax.swing.JFrame {
    private MealBuilder mb = new MealBuilder();

    public POS() {
        initComponents();
    }

    
    public void billCalculator(){
        double sum = 0;
        
        for (int i =0; i< jTable1.getRowCount();i++){
            sum = sum + Double.parseDouble(jTable1.getValueAt(i,2).toString());
        }
        
       jTextFieldPBD.setText(Double.toString(sum));
       double sumBeforeDiscount = Double.parseDouble(jTextFieldPBD.getText());
       
       double discountAmount = 0.0;
       if (jComboBoxDiscount.getSelectedItem().equals("10%")){
           discountAmount = sumBeforeDiscount *(1-mb.getDiscount10());
       }
       else if(jComboBoxDiscount.getSelectedItem().equals("20%")){
           discountAmount = sumBeforeDiscount * (1-mb.getDiscount20());
       }
       
       jTextFieldPBD.setText(String.format("RM %.2f",sumBeforeDiscount));
       jTextFieldDiscountAmount.setText(String.format("RM %.2f",discountAmount));
       jTextFieldNPAD.setText(String.format("RM %.2f",sumBeforeDiscount-discountAmount));
       
               
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldPBD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNPAD = new javax.swing.JTextField();
        jTextFieldDiscountAmount = new javax.swing.JTextField();
        jComboBoxDiscount = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonLambShawarma = new javax.swing.JButton();
        jButtonBeefShawarma = new javax.swing.JButton();
        jButtonHotTea = new javax.swing.JButton();
        jButtonChickenShawarmaCheese = new javax.swing.JButton();
        jButtonBeefShawarmaCheese = new javax.swing.JButton();
        jButtonLambShawarmaCheese = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonChickenShawarma = new javax.swing.JButton();
        jButtonCocaCola = new javax.swing.JButton();
        jButtonCocaColaIce = new javax.swing.JButton();
        jButtonSprite = new javax.swing.JButton();
        jButtonSpriteExtraIce = new javax.swing.JButton();
        jButtonIcedTea = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabelSetC = new javax.swing.JLabel();
        jButtonSetC = new javax.swing.JButton();
        jButtonSetA = new javax.swing.JButton();
        jButtonSetB = new javax.swing.JButton();
        jLabelSetA = new javax.swing.JLabel();
        jLabelSetB = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldPBD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPBDActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Net Payable After Discount");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Current Discount");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Discount Amount");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jTextFieldNPAD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldNPAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNPADActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNPAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 90, 30));

        jTextFieldDiscountAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDiscountAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiscountAmountActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldDiscountAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 90, 30));

        jComboBoxDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "10%", "20%" }));
        jComboBoxDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDiscountActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Price Before Discount");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 520, 310));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bundles");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 100, 40));

        jButtonLambShawarma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLambShawarma.setText("Lamb Shawarma ");
        jButtonLambShawarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLambShawarmaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLambShawarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 300, 40));

        jButtonBeefShawarma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBeefShawarma.setText("Beef Shawarma");
        jButtonBeefShawarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBeefShawarmaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBeefShawarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 300, 40));

        jButtonHotTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonHotTea.setText("Hot Tea");
        jButtonHotTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHotTeaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonHotTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 300, 40));

        jButtonChickenShawarmaCheese.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonChickenShawarmaCheese.setText("Chicken Shawarma (Extra Cheese)");
        jButtonChickenShawarmaCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChickenShawarmaCheeseActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonChickenShawarmaCheese, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 300, 40));

        jButtonBeefShawarmaCheese.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBeefShawarmaCheese.setText("Beef Shawarma (Extra Cheese)");
        jButtonBeefShawarmaCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBeefShawarmaCheeseActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBeefShawarmaCheese, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 300, 40));

        jButtonLambShawarmaCheese.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLambShawarmaCheese.setText("Lamb Shawarma (Extra Cheese)");
        jButtonLambShawarmaCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLambShawarmaCheeseActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLambShawarmaCheese, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 300, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Shawarma");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 140, 50));

        jButtonChickenShawarma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonChickenShawarma.setText("Chicken Shawarma");
        jButtonChickenShawarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChickenShawarmaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonChickenShawarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 300, 40));

        jButtonCocaCola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCocaCola.setText("Coca Cola");
        jButtonCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCocaColaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 300, 40));

        jButtonCocaColaIce.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCocaColaIce.setText("Coca Cola (Extra Ice)");
        jButtonCocaColaIce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCocaColaIceActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCocaColaIce, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 300, 40));

        jButtonSprite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSprite.setText("Sprite");
        jButtonSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpriteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 300, 40));

        jButtonSpriteExtraIce.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSpriteExtraIce.setText("Sprite (Extra Ice)");
        jButtonSpriteExtraIce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpriteExtraIceActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSpriteExtraIce, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 300, 40));

        jButtonIcedTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIcedTea.setText("Iced Tea");
        jButtonIcedTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIcedTeaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonIcedTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 300, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Drinks");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 100, 40));

        jLabelSetC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSetC.setText("(Lamb Shawarma + Hot Tea)");
        jPanel2.add(jLabelSetC, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 220, -1));

        jButtonSetC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSetC.setText("Set C");
        jButtonSetC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetCActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSetC, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 300, 40));

        jButtonSetA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSetA.setText("Set A");
        jButtonSetA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetAActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSetA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 300, 40));

        jButtonSetB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSetB.setText("Set B");
        jButtonSetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetBActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSetB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 300, 40));

        jLabelSetA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSetA.setText("(Chicken Shawarma + CocaCola)");
        jPanel2.add(jLabelSetA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 240, -1));

        jLabelSetB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSetB.setText("(Beef Shawarma + Sprite)");
        jPanel2.add(jLabelSetB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 220, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 940, 830));

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 90, 40));

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 120, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jTextFieldPBD.setText("");
        jTextFieldDiscountAmount.setText("");
        jTextFieldNPAD.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        int removeItem = jTable1.getSelectedRow();
        
        if (removeItem >= 0){
            model.removeRow(removeItem);
        }
        billCalculator();
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonLambShawarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLambShawarmaActionPerformed
        meal csMeal = mb.lambShawarmaMeal(false);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()*mb.getItemDiscount()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonLambShawarmaActionPerformed

    private void jButtonBeefShawarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeefShawarmaActionPerformed
        meal csMeal = mb.beefShawarmaMeal(false);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonBeefShawarmaActionPerformed

    private void jButtonHotTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHotTeaActionPerformed
        meal csMeal = mb.teaMeal(false);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonHotTeaActionPerformed

    private void jButtonChickenShawarmaCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChickenShawarmaCheeseActionPerformed
        meal csMeal = mb.chickenShawarmaMeal(true);
 
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonChickenShawarmaCheeseActionPerformed

    private void jButtonBeefShawarmaCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeefShawarmaCheeseActionPerformed
        meal csMeal = mb.beefShawarmaMeal(true);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonBeefShawarmaCheeseActionPerformed

    private void jButtonLambShawarmaCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLambShawarmaCheeseActionPerformed
        meal csMeal = mb.lambShawarmaMeal(true);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()*mb.getItemDiscount()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonLambShawarmaCheeseActionPerformed

    private void jButtonChickenShawarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChickenShawarmaActionPerformed
        meal csMeal = mb.chickenShawarmaMeal(false);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonChickenShawarmaActionPerformed

    private void jButtonCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCocaColaActionPerformed
        meal csMeal = mb.cocacolaMeal(false);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonCocaColaActionPerformed

    private void jButtonCocaColaIceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCocaColaIceActionPerformed
        meal csMeal = mb.cocacolaMeal(true);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonCocaColaIceActionPerformed

    private void jButtonSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpriteActionPerformed
        meal csMeal = mb.spriteMeal(false);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonSpriteActionPerformed

    private void jButtonSpriteExtraIceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpriteExtraIceActionPerformed
        meal csMeal = mb.spriteMeal(true);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonSpriteExtraIceActionPerformed

    private void jButtonIcedTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIcedTeaActionPerformed
        meal csMeal = mb.teaMeal(true);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonIcedTeaActionPerformed

    private void jTextFieldPBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPBDActionPerformed

    private void jTextFieldNPADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNPADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNPADActionPerformed

    private void jTextFieldDiscountAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiscountAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiscountAmountActionPerformed

    private void jComboBoxDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDiscountActionPerformed
        billCalculator();
    }//GEN-LAST:event_jComboBoxDiscountActionPerformed

    private void jButtonSetCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetCActionPerformed
        meal csMeal = mb.setCMeal(false,false);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()*mb.getBundleDiscount()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonSetCActionPerformed

    private void jButtonSetAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetAActionPerformed
        meal csMeal = mb.setAMeal(false,false);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()*mb.getBundleDiscount()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonSetAActionPerformed

    private void jButtonSetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetBActionPerformed
        meal csMeal = mb.setBMeal(false,false);
  
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{csMeal.getName(),"1",csMeal.getCost()*mb.getBundleDiscount()}); 

        billCalculator();
    }//GEN-LAST:event_jButtonSetBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBeefShawarma;
    private javax.swing.JButton jButtonBeefShawarmaCheese;
    private javax.swing.JButton jButtonChickenShawarma;
    private javax.swing.JButton jButtonChickenShawarmaCheese;
    private javax.swing.JButton jButtonCocaCola;
    private javax.swing.JButton jButtonCocaColaIce;
    private javax.swing.JButton jButtonHotTea;
    private javax.swing.JButton jButtonIcedTea;
    private javax.swing.JButton jButtonLambShawarma;
    private javax.swing.JButton jButtonLambShawarmaCheese;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSetA;
    private javax.swing.JButton jButtonSetB;
    private javax.swing.JButton jButtonSetC;
    private javax.swing.JButton jButtonSprite;
    private javax.swing.JButton jButtonSpriteExtraIce;
    private javax.swing.JComboBox<String> jComboBoxDiscount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelSetA;
    private javax.swing.JLabel jLabelSetB;
    private javax.swing.JLabel jLabelSetC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDiscountAmount;
    private javax.swing.JTextField jTextFieldNPAD;
    private javax.swing.JTextField jTextFieldPBD;
    // End of variables declaration//GEN-END:variables
}