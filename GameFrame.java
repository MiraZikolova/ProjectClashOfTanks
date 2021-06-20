package project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class GameFrame extends javax.swing.JFrame {

//constructor 
    public GameFrame() {
        initComponents();   //initializes the form
        //creates the sky color
        koordinate.setBackground(Color.getHSBColor(20, 120, 230));    //Creates a Color object based on the specified values
//        koordinate.setBackground(Color.blue); 

    }

    @SuppressWarnings("unchecked")

    
   //adding  the basic elements of the panel
    private void initComponents() {

        koordinate = new javax.swing.JPanel();
        Buttons = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        angle_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        speed_txt = new javax.swing.JTextField();
        shootbut = new javax.swing.JButton();
        clearbut = new javax.swing.JButton();
        exitbut = new javax.swing.JButton();
        shootbut2 = new javax.swing.JButton();
        startbut = new javax.swing.JButton();

        
        //Sets the operation that will happen by default when the user initiates a "close" on this frame
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  //Exit the application using the System exit method

        javax.swing.GroupLayout koordinateLayout = new javax.swing.GroupLayout(koordinate); //hierarchicallygroups components in order to position them in a Container
        koordinate.setLayout(koordinateLayout);
        koordinateLayout.setHorizontalGroup(   //Sets the Group that positions and sizescomponents along the horizontal axis
            koordinateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        koordinateLayout.setVerticalGroup(
            koordinateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
 
        //color of the buttons
        Buttons.setBackground(Color.pink);
        Buttons.setForeground(Color.getHSBColor(20, 120, 230));

        jLabel1.setText("Insert Angle: ");

        jLabel2.setText("Insert Speed: ");

        //design and listener of Shoot1
        shootbut.setBackground(Color.getHSBColor(20, 120, 230));
        shootbut.setForeground(new java.awt.Color(0, 0, 0));
        shootbut.setText("Shoot1");
        shootbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootbutActionPerformed(evt);    //the event to be processed
            }
        });
 
        //design and listener of Shoot2
        shootbut2.setBackground(Color.getHSBColor(20, 120, 230));
        shootbut2.setForeground(new java.awt.Color(0, 0, 0));
        shootbut2.setText("Shoot2");
        shootbut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootbut2ActionPerformed(evt);
            }
        });
        
        //design and listener of New Game
        clearbut.setBackground(Color.getHSBColor(20, 120, 230));
        clearbut.setForeground(new java.awt.Color(0, 0, 0));
        clearbut.setText("New Game");
        clearbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbutActionPerformed(evt);
            }
        });

        //design and functionality of Exit
        exitbut.setBackground(Color.getHSBColor(20, 120, 230));
        exitbut.setForeground(new java.awt.Color(0, 0, 0));
        exitbut.setText("Exit");
        exitbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbutActionPerformed(evt);
            }
        });

     
        //design and functionality of Start
        startbut.setBackground(Color.getHSBColor(20, 120, 230));
        startbut.setForeground(new java.awt.Color(0, 0, 0));
        startbut.setText("Start");
        startbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbutActionPerformed(evt);
            }
        });

        //positions the buttons in an adequate way
        //hierarchicallygroups components in order to position them in a Container
        javax.swing.GroupLayout ButtonsLayout = new javax.swing.GroupLayout(Buttons);
        Buttons.setLayout(ButtonsLayout);
        ButtonsLayout.setHorizontalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(angle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(speed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startbut, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shootbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shootbut2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ButtonsLayout.setVerticalGroup(
            ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ButtonsLayout.createSequentialGroup()
                        .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shootbut, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(clearbut)))
                        .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ButtonsLayout.createSequentialGroup()
                                .addGroup(ButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(angle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(speed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ButtonsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(exitbut)
                                .addContainerGap(15, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(shootbut2)
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(koordinate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(koordinate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();      //Causes this Window to be sized to fit the preferred size and layouts of its subcomponents
    }
    
    //creates the two tank objects
   FinalProject obj = new FinalProject();
    Image img;
    Image img2;

    //prints the two chosen tanks 
    private void loadImage() {
        String path = "src\\project\\tanksgame.png";   //the place where the image is saved
        File file = new File(path);
        try {
            img = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadImage2() {
        String path = "src\\project\\tank2.png";      //the place where the image is saved
        File file = new File(path);
        try {
            img2 = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    //creates the functionality of the methods invoked when a button is pressed
    
    //when tank1 shoots
    private void shootbutActionPerformed(java.awt.event.ActionEvent evt) {
    	//draws the first ball
        Graphics g = koordinate.getGraphics();
        obj.setStartX1(obj.getX1());
        obj.setBallX1(obj.getStartX1());
        obj.setLastPointX1(obj.getStartX1());
        obj.setStartY1(koordinate.getHeight() - 100);
        obj.setBallY1(obj.getStartY1());
        obj.setLastPointY1(obj.getStartY1());
        obj.getUserInput(angle_txt.getText(), speed_txt.getText());
        while (obj.inBounds(koordinate.getWidth(), koordinate.getHeight()) != false && obj.isB() == true) {  //while it is still in the frame
            try {
            	Thread.sleep(20);   //in millisecs //used to determine when to interrupt a player's turn, because the ball left the frame
                obj.paint1(g);
                obj.moveBall1();
                g.setColor(Color.BLACK);
                Thread.sleep(20);
                Graphics f = koordinate.getGraphics();
                f.setColor(Color.getHSBColor(20, 120, 230));
                f.fillOval((int) (obj.getLastPointX1()), (int) (obj.getLastPointY1()), 10, 10);
                //if the ball hits the tank then display the winner
                if (obj.PerfectShot1(koordinate.getHeight() - 100)) {
                    koordinate.repaint();
                    new Winner1().setVisible(true);
                    //Releases all of the native screen resources used by this Window, its subcomponents, and all of its owned children
                    dispose();
                }
                //when the ball leaves the frame
            } catch (InterruptedException ex) {   //Thrown when a thread is waiting, sleeping, or otherwise occupied,and the thread is interrupted, either before or during the activity
            } catch (java.lang.NullPointerException e) {
            }
        }

        int x1 = obj.getX1();
        int x2 = obj.getX2();
        obj = new FinalProject();
        obj.setX1(x1);
        obj.setX2(x2);
    }

    //when tank2 shoots  (the same as tank1, but reversed)
    private void shootbut2ActionPerformed(java.awt.event.ActionEvent evt) {
        Graphics g = koordinate.getGraphics();
        obj.setStartX2(obj.getX2());
        obj.setBallX2(obj.getStartX2());
        obj.setLastPointX2(obj.getStartX2());
        obj.setStartY2(koordinate.getHeight() - 100);
        obj.setBallY2(obj.getStartY2());
        obj.setLastPointY2(obj.getStartY2());
        obj.getUserInput(angle_txt.getText(), speed_txt.getText());
        while (obj.inBounds2(koordinate.getWidth(), koordinate.getHeight()) != false && obj.isB() == true) {
            try {
                Thread.sleep(20);
                obj.paint2(g);
                obj.moveBall2();
                g.setColor(Color.BLACK);
                Thread.sleep(20);
                Graphics f = koordinate.getGraphics();
                f.setColor(Color.getHSBColor(20, 120, 230));
                f.fillOval((int) (obj.getLastPointX2()), (int) (obj.getLastPointY2()), 10, 10);
                if (obj.PerfectShot2(koordinate.getHeight() - 100)) {
                    koordinate.repaint();
                    new Winner2().setVisible(true);
                    dispose();
                }
            } catch (InterruptedException ex) {
            } catch (java.lang.NullPointerException e) {
            }
        }
        int x1 = obj.getX1();
        int x2 = obj.getX2();
        obj = new FinalProject();
        obj.setX1(x1);
        obj.setX2(x2);
    }
    
    //when the button New Game is pressed all the fields are cleared
    private void clearbutActionPerformed(java.awt.event.ActionEvent evt) {
        angle_txt.setText("");   //delete the previous values
        speed_txt.setText("");
        koordinate.repaint();
        startbut.setEnabled(true);   //creates setup for a new game (the start button works again)
    }

    //when the button Exit is pressed
    private void exitbutActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }


    //when the button Start is pressed
    private void startbutActionPerformed(java.awt.event.ActionEvent evt) {
        obj.StartKoordanatesX1(koordinate.getWidth());
        obj.StartKoordanatesX2(koordinate.getWidth());

        Graphics g = koordinate.getGraphics();
        g.setColor(Color.GREEN);   //draws the grass
        g.fillRect(0, koordinate.getHeight() - 80, koordinate.getWidth(), koordinate.getHeight() - 80);
        g.setColor(Color.BLACK);
        loadImage();   //places tank1
        g.drawImage(img, obj.getX1() - 35, koordinate.getHeight() - 105, 35, 35, this);
        loadImage2();   //places tank2
        g.drawImage(img2, obj.getX2() + 10, koordinate.getHeight() - 110, 40, 40, this);
        startbut.setEnabled(false);    //the start button becomes grey when there is a game in progress
    }

   //we use this to catch other exceptions
    public static void main(String args[]) {
      
    	//"Look" refers to the appearance of GUI widgets (more formally, JComponents) and "feel" refers to the way the widgets behave
    	//Returns an array of LookAndFeelInfos representing the LookAndFeel implementations currently available
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {     //Nimbus uses Java 2D vector graphics to draw the user interface (UI)
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {  //when no definition for the class with the specified name could be found
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {  //when the specified class object cannot be instantiated
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {   //when the currently executing method does not have access to the definition of the specified class, field, method or constructor
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {  // the requested look & feel management classes are not present on the user's system
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
      //  The Runnable interface should be implemented by anyclass whose instances are intended to be executed by a thread
        //creates and displays the form
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GameFrame().setVisible(true);  //makes the frame visible
            }
       });

    }

    // Variables declaration
    private javax.swing.JPanel Buttons;
    private javax.swing.JTextField angle_txt;
    private javax.swing.JButton clearbut;
    private javax.swing.JButton exitbut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel koordinate;
    private javax.swing.JButton shootbut;
    private javax.swing.JButton shootbut2;
    private javax.swing.JTextField speed_txt;
    private javax.swing.JButton startbut;

}
