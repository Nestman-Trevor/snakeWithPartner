/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner.frames;

import snakewithpartner.SnakeWithPartner;
import snakewithpartner.players.Player;

/**
 *
 * @author trevornestman
 */
public class EnterPlayerName extends javax.swing.JFrame {

    /**
     * Creates new form EnterPlayerName
     */
    public EnterPlayerName() {
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

        getNamePanel = new javax.swing.JPanel();
        getNameTitlePanel = new javax.swing.JPanel();
        getNameTitleLabel = new javax.swing.JLabel();
        playerNameField = new javax.swing.JTextField();
        nameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter Player Name");

        getNamePanel.setBackground(new java.awt.Color(0, 153, 0));

        getNameTitlePanel.setBackground(new java.awt.Color(0, 153, 0));

        getNameTitleLabel.setFont(new java.awt.Font("Marker Felt", 3, 24)); // NOI18N
        getNameTitleLabel.setText("Please enter your name!");

        javax.swing.GroupLayout getNameTitlePanelLayout = new javax.swing.GroupLayout(getNameTitlePanel);
        getNameTitlePanel.setLayout(getNameTitlePanelLayout);
        getNameTitlePanelLayout.setHorizontalGroup(
            getNameTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getNameTitlePanelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(getNameTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        getNameTitlePanelLayout.setVerticalGroup(
            getNameTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, getNameTitlePanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(getNameTitleLabel)
                .addContainerGap())
        );

        playerNameField.setText("Playa");

        nameButton.setText("Submit");
        nameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout getNamePanelLayout = new javax.swing.GroupLayout(getNamePanel);
        getNamePanel.setLayout(getNamePanelLayout);
        getNamePanelLayout.setHorizontalGroup(
            getNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getNameTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(getNamePanelLayout.createSequentialGroup()
                .addGroup(getNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(getNamePanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(playerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(getNamePanelLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(nameButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getNamePanelLayout.setVerticalGroup(
            getNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getNamePanelLayout.createSequentialGroup()
                .addComponent(getNameTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameButton)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String playerName = playerNameField.getText();
                Player player = new Player();
                player.setName(playerName);
                SnakeWithPartner.playMenuFrame = new PlayMenuFrame(player);
                SnakeWithPartner.playMenuFrame.setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_nameButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(EnterPlayerName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EnterPlayerName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EnterPlayerName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EnterPlayerName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EnterPlayerName().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel getNamePanel;
    private javax.swing.JLabel getNameTitleLabel;
    private javax.swing.JPanel getNameTitlePanel;
    private javax.swing.JButton nameButton;
    private javax.swing.JTextField playerNameField;
    // End of variables declaration//GEN-END:variables
}
