/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuas;

/**
 *
 * @author LENOVO
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
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
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mndpd = new javax.swing.JMenuItem();
        mndprd1 = new javax.swing.JMenuItem();
        mndprd2 = new javax.swing.JMenuItem();
        thn = new javax.swing.JMenu();
        mn2009 = new javax.swing.JMenuItem();
        mn2014 = new javax.swing.JMenuItem();
        mn2019 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("SELAMAT DATANG DI DATA BPS PEMILU");

        jLabel2.setText("14 DESEMBER 2022");

        jMenu1.setText("STATISTIK PEMILU");

        mndpd.setText("DPD");
        mndpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mndpdActionPerformed(evt);
            }
        });
        jMenu1.add(mndpd);

        mndprd1.setText("DPRD I");
        mndprd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mndprd1ActionPerformed(evt);
            }
        });
        jMenu1.add(mndprd1);

        mndprd2.setText("DPRD II");
        mndprd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mndprd2ActionPerformed(evt);
            }
        });
        jMenu1.add(mndprd2);

        jMenuBar1.add(jMenu1);

        thn.setText("TAHUN ");

        mn2009.setText("2009");
        mn2009.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn2009ActionPerformed(evt);
            }
        });
        thn.add(mn2009);

        mn2014.setText("2014");
        mn2014.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn2014ActionPerformed(evt);
            }
        });
        thn.add(mn2014);

        mn2019.setText("2019");
        mn2019.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn2019ActionPerformed(evt);
            }
        });
        thn.add(mn2019);

        jMenuBar1.add(thn);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mndpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mndpdActionPerformed
        // TODO add your handling code here:
        DPD d = new DPD();
        d.setVisible(true);
    }//GEN-LAST:event_mndpdActionPerformed

    private void mn2009ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn2009ActionPerformed
        // TODO add your handling code here:
        CekData c = new CekData();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mn2009ActionPerformed

    private void mndprd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mndprd1ActionPerformed
        // TODO add your handling code here:
        DPRD1 d = new DPRD1();
        d.setVisible(true);
    }//GEN-LAST:event_mndprd1ActionPerformed

    private void mndprd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mndprd2ActionPerformed
        // TODO add your handling code here:
        DPRD2 d = new DPRD2();
        d.setVisible(true);
    }//GEN-LAST:event_mndprd2ActionPerformed

    private void mn2014ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn2014ActionPerformed
        // TODO add your handling code here:
        CekData c = new CekData();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mn2014ActionPerformed

    private void mn2019ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn2019ActionPerformed
        // TODO add your handling code here:
        CekData c = new CekData();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mn2019ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mn2009;
    private javax.swing.JMenuItem mn2014;
    private javax.swing.JMenuItem mn2019;
    private javax.swing.JMenuItem mndpd;
    private javax.swing.JMenuItem mndprd1;
    private javax.swing.JMenuItem mndprd2;
    private javax.swing.JMenu thn;
    // End of variables declaration//GEN-END:variables
}
