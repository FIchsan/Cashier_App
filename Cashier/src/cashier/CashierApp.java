package cashier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class CashierApp extends javax.swing.JFrame {

    /**
     * Creates new form CashierApp
     */
    public CashierApp() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        baksourat = new javax.swing.JTextField();
        jCheckBox1BAKSOURAT = new javax.swing.JCheckBox();
        jCheckBox1BAKSOTELUR = new javax.swing.JCheckBox();
        baksotelur = new javax.swing.JTextField();
        jCheckBox1MIEAYAM = new javax.swing.JCheckBox();
        jCheckBox1MIEAYAMBAKSO = new javax.swing.JCheckBox();
        mieayam = new javax.swing.JTextField();
        mieayambakso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JTextField();
        HITUNG = new javax.swing.JButton();
        HAPUS = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Bakso Kekinian");

        baksourat.setEditable(false);
        baksourat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baksouratActionPerformed(evt);
            }
        });

        jCheckBox1BAKSOURAT.setText("Bakso Urat @ Rp.8000");
        jCheckBox1BAKSOURAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1BAKSOURATActionPerformed(evt);
            }
        });

        jCheckBox1BAKSOTELUR.setText("Bakso Telur @ Rp.8000");
        jCheckBox1BAKSOTELUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1BAKSOTELURActionPerformed(evt);
            }
        });

        baksotelur.setEditable(false);
        baksotelur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baksotelurActionPerformed(evt);
            }
        });

        jCheckBox1MIEAYAM.setText("Mie Ayam @ Rp.6000");
        jCheckBox1MIEAYAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1MIEAYAMActionPerformed(evt);
            }
        });

        jCheckBox1MIEAYAMBAKSO.setText("Mie Ayam Bakso @ Rp.8000");
        jCheckBox1MIEAYAMBAKSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1MIEAYAMBAKSOActionPerformed(evt);
            }
        });

        mieayam.setEditable(false);
        mieayam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mieayamActionPerformed(evt);
            }
        });

        mieayambakso.setEditable(false);
        mieayambakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mieayambaksoActionPerformed(evt);
            }
        });

        jLabel2.setText("Jumlah");

        TOTAL.setEditable(false);

        HITUNG.setText("Hitung");
        HITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HITUNGActionPerformed(evt);
            }
        });

        HAPUS.setText("Hapus");
        HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HAPUSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1BAKSOURAT)
                            .addComponent(jCheckBox1BAKSOTELUR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(baksourat, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(baksotelur, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1MIEAYAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mieayam, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jCheckBox1MIEAYAMBAKSO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HITUNG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HAPUS))
                            .addComponent(mieayambakso, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(TOTAL))))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baksourat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1BAKSOURAT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1BAKSOTELUR)
                    .addComponent(baksotelur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1MIEAYAM)
                    .addComponent(mieayam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1MIEAYAMBAKSO)
                    .addComponent(mieayambakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HITUNG)
                    .addComponent(HAPUS))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void baksouratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baksouratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baksouratActionPerformed

    private void jCheckBox1BAKSOTELURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1BAKSOTELURActionPerformed
  if (jCheckBox1BAKSOTELUR.isSelected() == true){
            baksotelur.setEditable(true);
        } else {
            baksotelur.setEditable(false);
            baksotelur.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1BAKSOTELURActionPerformed

    private void baksotelurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baksotelurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baksotelurActionPerformed

    private void jCheckBox1MIEAYAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1MIEAYAMActionPerformed
  if (jCheckBox1MIEAYAM.isSelected() == true){
            mieayam.setEditable(true);
        } else {
            mieayam.setEditable(false);
            mieayam.setText("");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MIEAYAMActionPerformed

    private void jCheckBox1MIEAYAMBAKSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1MIEAYAMBAKSOActionPerformed
   if (jCheckBox1MIEAYAMBAKSO.isSelected() == true){
            mieayambakso.setEditable(true);
        } else {
            mieayambakso.setEditable(false);
            mieayambakso.setText("");
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MIEAYAMBAKSOActionPerformed

    private void mieayamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mieayamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mieayamActionPerformed

    private void mieayambaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mieayambaksoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mieayambaksoActionPerformed

    private void jCheckBox1BAKSOURATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1BAKSOURATActionPerformed
                                                    
        // TODO add your handling code here:
        if (jCheckBox1BAKSOURAT.isSelected() == true){
            baksourat.setEditable(true);
        } else {
            baksourat.setEditable(false);
            baksourat.setText("");
        }
                       
    // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1BAKSOURATActionPerformed

    private void HITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HITUNGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HITUNGActionPerformed

    private void HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HAPUSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HAPUSActionPerformed

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
            java.util.logging.Logger.getLogger(CashierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HAPUS;
    private javax.swing.JButton HITUNG;
    private javax.swing.JTextField TOTAL;
    private javax.swing.JTextField baksotelur;
    private javax.swing.JTextField baksourat;
    private javax.swing.JCheckBox jCheckBox1BAKSOTELUR;
    private javax.swing.JCheckBox jCheckBox1BAKSOURAT;
    private javax.swing.JCheckBox jCheckBox1MIEAYAM;
    private javax.swing.JCheckBox jCheckBox1MIEAYAMBAKSO;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField mieayam;
    private javax.swing.JTextField mieayambakso;
    // End of variables declaration//GEN-END:variables
}
