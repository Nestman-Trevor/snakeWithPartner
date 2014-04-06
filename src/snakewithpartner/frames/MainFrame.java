/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner.frames;

import snakewithpartner.SnakeWithPartner;

/**
 *
 * @author trevornestman
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jpMenuItems = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        highScoreButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtWelcome = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake");

        jpBody.setBackground(new java.awt.Color(0, 153, 0));
        jpBody.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpTitle.setBackground(new java.awt.Color(0, 153, 0));

        jlTitle.setFont(new java.awt.Font("Noteworthy", 1, 48)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(0, 51, 204));
        jlTitle.setText("#NumNumNumNum");

        javax.swing.GroupLayout jpTitleLayout = new javax.swing.GroupLayout(jpTitle);
        jpTitle.setLayout(jpTitleLayout);
        jpTitleLayout.setHorizontalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(122, 122, 122))
        );
        jpTitleLayout.setVerticalGroup(
            jpTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTitleLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jlTitle))
        );

        jpMenuItems.setBackground(new java.awt.Color(153, 153, 0));
        jpMenuItems.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        playButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        highScoreButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        highScoreButton.setText("High Scores");
        highScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoreButtonActionPerformed(evt);
            }
        });

        helpButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        quitButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuItemsLayout = new javax.swing.GroupLayout(jpMenuItems);
        jpMenuItems.setLayout(jpMenuItemsLayout);
        jpMenuItemsLayout.setHorizontalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(highScoreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpMenuItemsLayout.setVerticalGroup(
            jpMenuItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highScoreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtWelcome.setEditable(false);
        jtWelcome.setColumns(20);
        jtWelcome.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jtWelcome.setLineWrap(true);
        jtWelcome.setRows(5);
        jtWelcome.setText("Welcome to Snake!\nVersion: 1.0\nThe goal is to eat the food and not yourself.\nAlso, avoid the walls.");
        jtWelcome.setWrapStyleWord(true);
        jtWelcome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtWelcome.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(jtWelcome);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addComponent(jpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_quitButtonActionPerformed

    private void highScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_highScoreButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    SnakeWithPartner.helpMenuFrame = new HelpMenuFrame();
                    new HelpMenuFrame().setVisible(true);
                }
            });
    }//GEN-LAST:event_helpButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    SnakeWithPartner.enterPlayerName = new EnterPlayerName();
                    new EnterPlayerName().setVisible(true);
                }
            });
    }//GEN-LAST:event_playButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton helpButton;
    private javax.swing.JButton highScoreButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMenuItems;
    private javax.swing.JPanel jpTitle;
    private javax.swing.JTextArea jtWelcome;
    private javax.swing.JButton playButton;
    private javax.swing.JButton quitButton;
    // End of variables declaration//GEN-END:variables
}
