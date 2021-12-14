/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotics;

/**
 *
 * @author Aman
 */
import ch.aplu.robotsim.*;
public class MoveWithMotors
{
  public  MoveWithMotors()
  {
    NxtRobot robot=new  NxtRobot();
    Motor motA=new Motor(MotorPort.A);
    Motor motB=new Motor(MotorPort.B);
    robot.addPart(motA);
    robot.addPart(motB);
    motA.forward();
    motB.forward();
    Tools.delay(2000);
    
    motA.stop();
    Tools.delay(1050);
    motA.forward();
    Tools.delay(2000);
    
    motB.stop();
    Tools.delay(1050);
    motB.forward();
    Tools.delay(2000);
    
    robot.exit();
  }
  public static void main(String args[])
  {
    new MoveWithMotors();
  }
}
