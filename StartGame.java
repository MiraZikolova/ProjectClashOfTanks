package project;

import java.awt.Color;

public class StartGame extends javax.swing.JFrame {

   //creates a new form Start Game
    public StartGame() {
        initComponents();
    }

    // This method is called from within the constructor to initialize the form.


    private void initComponents() {

    	//creates several objects
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  //The exit application default window close operation

        //creates the background
        jPanel1.setBackground(Color.white);

        
       //adding a logo
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/танклогоо.png"))); 

        
        //creates the design and listener of the play button
        jButton2.setBackground(Color.black);
        jButton2.setForeground(Color.orange);
        jButton2.setText("LETS PLAYYYYYYYY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        //creates the basic layout of the first pop up panel
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();    //Causes this Window to be sized to fit the preferred sizeand layouts of its subcomponents
    }

    //describes the functionality of the listener used in the Play button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        new GameFrame().setVisible(true);   //makes the next frame (the main one) visible
        dispose();          //Releases all of the native screen resources used by this Window, its subcomponents, and all of its owned children
    }


    public static void main(String args[]) {
    	//"Look" refers to the appearance of GUI widgets (more formally, JComponents) and "feel" refers to the way the widgets behave
    	//Returns an array of LookAndFeelInfos representing the LookAndFeel implementations currently available
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {    //Nimbus uses Java 2D vector graphics to draw the user interface (UI)
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {   //when no definition for the class with the specified name could be found
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {   //when the specified class object cannot beinstantiated
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {   //when the currently executing method does not have access to the definition of the specified class, field, method or constructor
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {   // the requested look & feel management classes are not present on the user's system
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
//The Runnable interface should be implemented by anyclass whose instances are intended to be executed by a thread

   //creates and displays the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGame().setVisible(true);   //makes the first starting panel visible
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;

}
