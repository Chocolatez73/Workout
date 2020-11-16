/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nano
 */
public class MainPanel extends javax.swing.JFrame {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        aNc = new javax.swing.JLabel();
        aNs = new javax.swing.JLabel();
        gNl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/label_Workout_Text.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 40, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PANEL.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 1350, 570));

        aNc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_abs_core.png"))); // NOI18N
        aNc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aNcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aNcMouseExited(evt);
            }
        });
        jPanel1.add(aNc, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 751, -1, -1));

        aNs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_arms_shoulder.png"))); // NOI18N
        aNs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aNsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aNsMouseExited(evt);
            }
        });
        jPanel1.add(aNs, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 857, -1, -1));

        gNl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_glutes_leg.png"))); // NOI18N
        gNl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gNlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gNlMouseExited(evt);
            }
        });
        jPanel1.add(gNl, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 963, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aNcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aNcMouseEntered
        // TODO add your handling code here:
        aNc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_abs_core_shade.png")));
    }//GEN-LAST:event_aNcMouseEntered

    private void aNcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aNcMouseExited
        // TODO add your handling code here:
        aNc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_abs_core.png")));
    }//GEN-LAST:event_aNcMouseExited

    private void aNsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aNsMouseEntered
        // TODO add your handling code here:
        aNs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_arms_shoulder_shade.png")));
    }//GEN-LAST:event_aNsMouseEntered

    private void aNsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aNsMouseExited
        // TODO add your handling code here:
        aNs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_arms_shoulder.png")));
    }//GEN-LAST:event_aNsMouseExited

    private void gNlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gNlMouseEntered
        // TODO add your handling code here:
        gNl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_glutes_leg_shade.png")));
    }//GEN-LAST:event_gNlMouseEntered

    private void gNlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gNlMouseExited
        // TODO add your handling code here:
        gNl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_glutes_leg.png")));
    }//GEN-LAST:event_gNlMouseExited

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
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aNc;
    private javax.swing.JLabel aNs;
    private javax.swing.JLabel gNl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
