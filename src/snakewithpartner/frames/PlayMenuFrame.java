/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakewithpartner.frames;

import snakewithpartner.Game;
import snakewithpartner.SnakeWithPartner;
import static snakewithpartner.enums.Difficulty.EASY;
import static snakewithpartner.enums.Difficulty.HARD;
import static snakewithpartner.enums.Difficulty.MEDIUM;
import snakewithpartner.players.Player;

/**
 *
 * @author josh
 */
public class PlayMenuFrame extends javax.swing.JFrame {
    
    Player  player;

    /**
     * Creates new form PlayMenuFrame
     */
    public PlayMenuFrame(Player player) {
        initComponents();
        this.player = player;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playMenuPanel = new javax.swing.JPanel();
        playMenuTitlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        playHardButton = new javax.swing.JButton();
        playEasyButton = new javax.swing.JButton();
        playMediumButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        playMenuPanel.setBackground(new java.awt.Color(0, 153, 0));
        playMenuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        playMenuTitlePanel.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Pick your difficulty");

        javax.swing.GroupLayout playMenuTitlePanelLayout = new javax.swing.GroupLayout(playMenuTitlePanel);
        playMenuTitlePanel.setLayout(playMenuTitlePanelLayout);
        playMenuTitlePanelLayout.setHorizontalGroup(
            playMenuTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playMenuTitlePanelLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(61, 61, 61))
        );
        playMenuTitlePanelLayout.setVerticalGroup(
            playMenuTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playMenuTitlePanelLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        playHardButton.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        playHardButton.setText("Hard");
        playHardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playHardButtonActionPerformed(evt);
            }
        });

        playEasyButton.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        playEasyButton.setText("Easy");
        playEasyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playEasyButtonActionPerformed(evt);
            }
        });

        playMediumButton.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        playMediumButton.setText("Medium");
        playMediumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playMediumButtonActionPerformed(evt);
            }
        });

        mainMenuButton.setText("Main Menu");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playMenuPanelLayout = new javax.swing.GroupLayout(playMenuPanel);
        playMenuPanel.setLayout(playMenuPanelLayout);
        playMenuPanelLayout.setHorizontalGroup(
            playMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playMenuPanelLayout.createSequentialGroup()
                .addGroup(playMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playMenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(playMenuTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(playMenuPanelLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(playMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playEasyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playMediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playHardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(playMenuPanelLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        playMenuPanelLayout.setVerticalGroup(
            playMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playMenuPanelLayout.createSequentialGroup()
                .addComponent(playMenuTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(playEasyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playMediumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playHardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playEasyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playEasyButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    player.setDifficulty(EASY);
                    Game game = new Game(player);
                    game.initGame();
                }
            });
            this.dispose();
    }//GEN-LAST:event_playEasyButtonActionPerformed

    private void playMediumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playMediumButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    player.setDifficulty(MEDIUM);
                    Game game = new Game(player);
                    game.initGame();
                }
            });
            this.dispose();
    }//GEN-LAST:event_playMediumButtonActionPerformed

    private void playHardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playHardButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    player.setDifficulty(HARD);
                    Game game = new Game(player);
                    game.initGame();
                }
            });
            this.dispose();
    }//GEN-LAST:event_playHardButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    SnakeWithPartner.mainFrame = new MainFrame();
                    SnakeWithPartner.mainFrame.setVisible(true);
                }
            });
            this.dispose();
    }//GEN-LAST:event_mainMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton playEasyButton;
    private javax.swing.JButton playHardButton;
    private javax.swing.JButton playMediumButton;
    private javax.swing.JPanel playMenuPanel;
    private javax.swing.JPanel playMenuTitlePanel;
    // End of variables declaration//GEN-END:variables
}
