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
public class HelpMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form HelpMenuFrame
     */
    public HelpMenuFrame() {
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

        helpMenuPanel = new javax.swing.JPanel();
        helpMenuTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        helpMenuNavigation = new javax.swing.JPanel();
        exitHelpButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        helpTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help");

        helpMenuPanel.setBackground(new java.awt.Color(0, 153, 0));
        helpMenuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        helpMenuTitle.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Noteworthy", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Help");

        javax.swing.GroupLayout helpMenuTitleLayout = new javax.swing.GroupLayout(helpMenuTitle);
        helpMenuTitle.setLayout(helpMenuTitleLayout);
        helpMenuTitleLayout.setHorizontalGroup(
            helpMenuTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        helpMenuTitleLayout.setVerticalGroup(
            helpMenuTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpMenuTitleLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        helpMenuNavigation.setBackground(new java.awt.Color(153, 153, 0));
        helpMenuNavigation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        exitHelpButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        exitHelpButton.setText("Back");
        exitHelpButton.setMaximumSize(new java.awt.Dimension(90, 38));
        exitHelpButton.setMinimumSize(new java.awt.Dimension(90, 38));
        exitHelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitHelpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout helpMenuNavigationLayout = new javax.swing.GroupLayout(helpMenuNavigation);
        helpMenuNavigation.setLayout(helpMenuNavigationLayout);
        helpMenuNavigationLayout.setHorizontalGroup(
            helpMenuNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitHelpButton, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        helpMenuNavigationLayout.setVerticalGroup(
            helpMenuNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitHelpButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        helpTextArea.setEditable(false);
        helpTextArea.setColumns(20);
        helpTextArea.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        helpTextArea.setLineWrap(true);
        helpTextArea.setRows(5);
        helpTextArea.setText("Rules:\nThe goal of snake is to eat as much food as \npossible! To get the highest score without \nhitting the wall or eating yourelf. And that's \nit, that's the whole thing.\n\nControls:\nUse arrow keys to change direction\nPress P to pause\nPress Q to quit");
        jScrollPane1.setViewportView(helpTextArea);

        javax.swing.GroupLayout helpMenuPanelLayout = new javax.swing.GroupLayout(helpMenuPanel);
        helpMenuPanel.setLayout(helpMenuPanelLayout);
        helpMenuPanelLayout.setHorizontalGroup(
            helpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(helpMenuTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(helpMenuPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(helpMenuNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        helpMenuPanelLayout.setVerticalGroup(
            helpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpMenuPanelLayout.createSequentialGroup()
                .addComponent(helpMenuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(helpMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(helpMenuNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitHelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitHelpButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    SnakeWithPartner.mainFrame = new MainFrame();
                    new MainFrame().setVisible(true);
                }
            });
            this.dispose();
    }//GEN-LAST:event_exitHelpButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitHelpButton;
    private javax.swing.JPanel helpMenuNavigation;
    private javax.swing.JPanel helpMenuPanel;
    private javax.swing.JPanel helpMenuTitle;
    private javax.swing.JTextArea helpTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
