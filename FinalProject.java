package project;

import java.awt.Color;
import java.awt.Graphics;
import java.util.InputMismatchException;
import java.util.Random;

import javax.swing.JOptionPane;

public class FinalProject {

    private static final double G = 9.8;             //gravity constant
    private double startX1, startY1, ballX1, ballY1;         //ball for player 1
    private double startX2, startY2, ballX2, ballY2;         //ball for player 2
    private double xSpeed, ySpeed, lastPointX1, lastPointY1, range, lastPointX2, lastPointY2;   //for balls 1 and 2
    private double time1, time2, deltaTime = 0.1;            //Δtime
    private int X1, X2;              
    private double speed, angle;
    private boolean b;

    
    //getters and setters for the PRIVATE variables 
    
    public double getSpeed() {
        return speed;
    }
    
    // NumberFormatException = if the string does not contain a parse-able double
    public void setSpeed(double speed) throws NumberFormatException {     //checks the input (should be a real positive number)
        if (speed >= 0) {
            this.speed = speed;
        } else {
            setB(false);
            JOptionPane.showMessageDialog(null, "Not a valid speed", "Error", JOptionPane.ERROR_MESSAGE);   //another panel to display an error message
        }
    }

    public double getAngle() {
        return angle;
    }
    
    // NumberFormatException = if the string does not contain a parse-able double
    public void setAngle(double angle) throws NumberFormatException {    //checks the input 
        this.angle = angle;
    }

    public int getX1() {
        return X1;
    }

    public void setX1(int X1) {
        this.X1 = X1;
    }

    public int getX2() {
        return X2;
    }

    public void setX2(int X2) {
        this.X2 = X2;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getStartX1() {
        return startX1;
    }

    public void setStartX1(double startX1) {
        this.startX1 = startX1;
    }

    public double getStartY1() {
        return startY1;
    }

    public void setStartY1(double startY1) {
        this.startY1 = startY1;
    }

    public double getBallX1() {
        return ballX1;
    }

    public void setBallX1(double ballX1) {
        this.ballX1 = ballX1;
    }

    public double getBallY1() {
        return ballY1;
    }

    public void setBallY1(double ballY1) {
        this.ballY1 = ballY1;
    }

    public double getStartX2() {
        return startX2;
    }

    public void setStartX2(double startX2) {
        this.startX2 = startX2;
    }

    public double getStartY2() {
        return startY2;
    }

    public void setStartY2(double startY2) {
        this.startY2 = startY2;
    }

    public double getBallX2() {
        return ballX2;
    }

    public void setBallX2(double ballX2) {
        this.ballX2 = ballX2;
    }

    public double getBallY2() {
        return ballY2;
    }

    public void setBallY2(double ballY2) {
        this.ballY2 = ballY2;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void setySpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public double getLastPointX1() {
        return lastPointX1;
    }

    public void setLastPointX1(double lastPointX1) {
        this.lastPointX1 = lastPointX1;
    }

    public double getLastPointY1() {
        return lastPointY1;
    }

    public void setLastPointY1(double lastPointY1) {
        this.lastPointY1 = lastPointY1;
    }

    public double getLastPointX2() {
        return lastPointX2;
    }

    public void setLastPointX2(double lastPointX2) {
        this.lastPointX2 = lastPointX2;
    }

    public double getLastPointY2() {
        return lastPointY2;
    }

    public void setLastPointY2(double lastPointY2) {
        this.lastPointY2 = lastPointY2;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public void getUserInput(String angle_txt, String speed_txt) {     //reading and saving what each player wrote
        try {
            setB(true);
            setAngle(Double.parseDouble(angle_txt));     //Returns a new double initialized to the value represented by the specified String
            setSpeed(Double.parseDouble(speed_txt));
            setxSpeed(speed * Math.cos(angle * (Math.PI / 180)));    //π (radians) = 180 degrees
            setySpeed(speed * Math.sin(angle * (Math.PI / 180)));    //we need to make the user input a degree
        } catch (NumberFormatException e) {
            setB(false);
            JOptionPane.showMessageDialog(null, "Invalid Value", "Error", JOptionPane.ERROR_MESSAGE);  //indicates for an error
        } catch (InputMismatchException e1) {     //InputMismatchException = the token does not match the pattern for the expected type or is out of range
            setB(false);
            JOptionPane.showMessageDialog(null, "Invalid Value", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //setting the coordinates for the moving balls
    public void moveBall1() {
        setBallX1(getStartX1() + (getxSpeed() * time1));
        setBallY1(getStartY1() - ((getySpeed() * time1) - (0.5 * G * Math.pow(time1, 2))));   //parabola
        time1 += deltaTime;                                //the balls don't fly at the same time
    }

    public void moveBall2() {
        setBallX2(getStartX2() - (getxSpeed() * time2));
        setBallY2(getStartY2() - ((getySpeed() * time2) - (0.5 * G * Math.pow(time2, 2))));   //parabola
        time2 += deltaTime;
    }

    //check if the ball fits in the respective space
    public boolean inBounds(double Width, double Height) {
        if (getBallX1() > Width || getBallY1() > Height - 80) {    //because of the green and orange parts(-80)
            return false;
        }
        return true;
    }

    public boolean inBounds2(double Width, double Height) {
        if (getBallX2() < 0 || getBallY2() > Height - 80) {
            return false;
        }
        return true;
    }

    
    //drawing the 2 balls
    public void paint1(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval((int) (getBallX1()), (int) (getBallY1()), 10, 10);
        setLastPointX1(getBallX1());
        setLastPointY1(getBallY1());
    }

    public void paint2(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval((int) (getBallX2()), (int) (getBallY2()), 10, 10);
        setLastPointX2(getBallX2());
        setLastPointY2(getBallY2());
    }

  //checks if ball1 hit the opponent's tank(2)
    public boolean PerfectShot1(double height) {
        if (getBallX1() >= getX2() + 10 &&       //depend on the size of the tank
        		getBallX1() <= getX2() + 50 && 
        		getBallY1() > height  &&
        		getBallY1() < height + 20 && 
        		getBallY1() > 0) {
            return true;
        }
        return false;
    }

    //checks if ball2 hit the opponent's tank(1)
    public boolean PerfectShot2(double height) {
        if (getBallX2() >= getX1() - 35 &&      //the two tanks are not the same size, so we have different constants
        		getBallX2() <= getX1() + 5 &&
        		getBallY2() > height && 
        		getBallY2() < height + 20 && 
        		getBallY2() > 0) {
            return true;
        }
        return false;
    }

    //places the tanks in different place each time the game starts
    public double StartKoordanatesX2(double Width) {
        Random rand = new Random();
        setX2(rand.nextInt((int) (Width - (Width / 2) + 1)) + (int) (Width / 2) - 40);  //permissible values for the placement
        return getX2();
    }

    public double StartKoordanatesX1(double Width) {
        Random rand = new Random();
        setX1(rand.nextInt(((int) Width / 2 + 1)) + 40);   //permissible values for the placement
        return getX1();
    }

    //constructor
    public FinalProject(double startX1, double startY1, double ballX1, double ballY1, double startX2, double startY2, double ballX2, double ballY2, double xSpeed, double ySpeed, double lastPointX1, double lastPointY1, double range, double lastPointX2, double lastPointY2, double time1, double time2, int X1, int X2) {
        this.startX1 = startX1;
        this.startY1 = startY1;
        this.ballX1 = ballX1;
        this.ballY1 = ballY1;
        this.startX2 = startX2;
        this.startY2 = startY2;
        this.ballX2 = ballX2;
        this.ballY2 = ballY2;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.lastPointX1 = lastPointX1;
        this.lastPointY1 = lastPointY1;
        this.range = range;
        this.lastPointX2 = lastPointX2;
        this.lastPointY2 = lastPointY2;
        this.time1 = time1;
        this.time2 = time2;
        this.X1 = X1;
        this.X2 = X2;
    }

    //sets all the values to be zero
    public FinalProject() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
