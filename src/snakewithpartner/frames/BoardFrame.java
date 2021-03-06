/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithpartner.frames;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import snakewithpartner.Game;
import snakewithpartner.Snake;
import snakewithpartner.TailSection;
import javax.swing.ImageIcon;
import snakewithpartner.Food;
import snakewithpartner.players.Player;

/**
 *
 * @author trevornestman
 */
public class BoardFrame extends javax.swing.JFrame implements ActionListener {

    Game game;
    Snake snake;
    ImageIcon icon = new ImageIcon("circle.jpg");
    JLabel[] tailLabels;
    JLabel foodLabel;

    /**
     * Creates new form board
     *
     * @param game
     */
    public BoardFrame(Game game, Snake snake) {
        initComponents();
        boardPanel.requestFocusInWindow();
        boardPanel.setLayout(null);
        this.game = game;
        this.snake = snake;
    }

    public BoardFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void paintBoard(Snake snake, Food food, Player player) {
        TailSection[] tail = snake.getTail();
        boardPanel.removeAll();
        boardPanel.revalidate();
        boardPanel.repaint();
        
        //paint snake
        for (int i = 0; i < tail.length; i++) {
            tailLabels = new JLabel[tail.length];
            tailLabels[i] = new javax.swing.JLabel("O");
            boardPanel.add(tailLabels[i]);
            tailLabels[i].setLocation(tail[i].getxCordinate() * 10, tail[i].getyCordinate() * 10);
            tailLabels[i].setSize(10, 10);
        }
        
        //paint food
            foodLabel = new JLabel();
            foodLabel = new javax.swing.JLabel("X");
            boardPanel.add(foodLabel);
            foodLabel.setLocation(food.getxFood() * 10, food.getyFood() * 10);
            foodLabel.setSize(10, 10);
            foodLabel.setForeground(Color.magenta );
            
       //paint player score
            playerScoreLabel.setText(Integer.toString(player.getScore()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        gameBoardPanel = new javax.swing.JPanel();
        boardTitlePanel = new javax.swing.JPanel();
        boardTitle = new javax.swing.JLabel();
        scoreTitle = new javax.swing.JLabel();
        playerScoreLabel = new javax.swing.JLabel();
        boardPanel = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake");
        setMinimumSize(new java.awt.Dimension(540, 640));
        setResizable(false);

        gameBoardPanel.setBackground(new java.awt.Color(0, 0, 0));
        gameBoardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        boardTitlePanel.setBackground(new java.awt.Color(0, 0, 204));
        boardTitlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        boardTitle.setFont(new java.awt.Font("Noteworthy", 1, 48)); // NOI18N
        boardTitle.setForeground(new java.awt.Color(51, 255, 51));
        boardTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        boardTitle.setText("SNAKE!");

        scoreTitle.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        scoreTitle.setForeground(new java.awt.Color(255, 102, 102));
        scoreTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreTitle.setText("Score");

        playerScoreLabel.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        playerScoreLabel.setForeground(new java.awt.Color(255, 51, 102));
        playerScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout boardTitlePanelLayout = new javax.swing.GroupLayout(boardTitlePanel);
        boardTitlePanel.setLayout(boardTitlePanelLayout);
        boardTitlePanelLayout.setHorizontalGroup(
            boardTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(boardTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        boardTitlePanelLayout.setVerticalGroup(
            boardTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boardTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boardTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boardTitlePanelLayout.createSequentialGroup()
                        .addComponent(scoreTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(boardTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );

        boardPanel.setBackground(new java.awt.Color(0, 153, 0));
        boardPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boardPanelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout boardPanelLayout = new javax.swing.GroupLayout(boardPanel);
        boardPanel.setLayout(boardPanelLayout);
        boardPanelLayout.setHorizontalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        boardPanelLayout.setVerticalGroup(
            boardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout gameBoardPanelLayout = new javax.swing.GroupLayout(gameBoardPanel);
        gameBoardPanel.setLayout(gameBoardPanelLayout);
        gameBoardPanelLayout.setHorizontalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boardTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(gameBoardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        gameBoardPanelLayout.setVerticalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameBoardPanelLayout.createSequentialGroup()
                .addComponent(boardTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameBoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gameBoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void boardPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boardPanelKeyPressed
        game.handleKeyStroke(evt);
    }//GEN-LAST:event_boardPanelKeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardPanel;
    private javax.swing.JLabel boardTitle;
    private javax.swing.JPanel boardTitlePanel;
    private javax.swing.JPanel gameBoardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel playerScoreLabel;
    private javax.swing.JLabel scoreTitle;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
