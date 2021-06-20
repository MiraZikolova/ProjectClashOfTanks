package project;

import java.awt.Color;

public class Winner1 extends javax.swing.JFrame {

//creates new form winner1
    public Winner1() {
        initComponents();   //initializes the form
    }

    // This method is called from within the constructor to initialize the form.
    

   
    private void initComponents() {

    	//creates several objects
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        playagain = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        //The exit application default window close operation

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //fills the background
        jPanel1.setBackground(Color.pink);

        jLabel1.setFont(new java.awt.Font("Andalus", 2, 24)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" PLAYER 1 IS THE WINNER ");

        //creates the design and listeners of the play again button
        playagain.setBackground(Color.gray);
        playagain.setText("Play Again");
        playagain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playagainActionPerformed(evt);
            }
        });

        //creates the design and listeners of the exit button
        jButton2.setBackground(Color.gray);
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        //creates the basic layout
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(playagain, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playagain, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

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

        pack();  //Causes this Window to be sized to fit the preferred sizeand layouts of its subcomponents
    }

    
    //describes the functionality of the listener of the play again button
    private void playagainActionPerformed(java.awt.event.ActionEvent evt) {
        new GameFrame().setVisible(true);    //returns the user back to the start menu
        dispose();
    }

    //describes the functionality of the listener of the exit button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);             //leaves the site
    } 

  
    public static void main(String args[]) {
    	//"Look" refers to the appearance of GUI widgets (more formally, JComponents) and "feel" refers to the way the widgets behave
    	//Returns an array of LookAndFeelInfos representing the LookAndFeel implementations currently available
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {   //Nimbus uses Java 2D vector graphics to draw the user interface (UI)
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Winner1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Winner1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Winner1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Winner1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        //create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Winner1().setVisible(true);    //displays the banner that player 1 wins
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton playagain;

}
