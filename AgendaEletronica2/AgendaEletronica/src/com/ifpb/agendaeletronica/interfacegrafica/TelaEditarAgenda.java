/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.agendaeletronica.interfacegrafica;

import com.ifpb.agendaeletronica.entidades.Agenda;

/**
 *
 * @author romulo
 */
public class TelaEditarAgenda extends javax.swing.JFrame {

    /**
     * Creates new form TelaEditarAgenda
     */
    private static Agenda agen;
    public TelaEditarAgenda(Agenda a) {
        this.agen = a; 
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

        campoNomeAgenda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botaoAtualizarAgenda = new javax.swing.JButton();
        botaoExcluirAgenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoNomeAgenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoNomeAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeAgendaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        botaoAtualizarAgenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoAtualizarAgenda.setText("Update");
        botaoAtualizarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarAgendaActionPerformed(evt);
            }
        });

        botaoExcluirAgenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoExcluirAgenda.setText("Excluir");
        botaoExcluirAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirAgendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(campoNomeAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(botaoAtualizarAgenda)
                        .addGap(57, 57, 57)
                        .addComponent(botaoExcluirAgenda)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNomeAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizarAgenda)
                    .addComponent(botaoExcluirAgenda))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeAgendaActionPerformed

    private void botaoAtualizarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarAgendaActionPerformed

    }//GEN-LAST:event_botaoAtualizarAgendaActionPerformed

    private void botaoExcluirAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirAgendaActionPerformed

    }//GEN-LAST:event_botaoExcluirAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarAgenda(agen).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtualizarAgenda;
    private javax.swing.JButton botaoExcluirAgenda;
    private javax.swing.JTextField campoNomeAgenda;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}