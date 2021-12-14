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
class MoveWithGear
{
  MoveWithGear()
  {
    NxtRobot robot=new NxtRobot();
    Gear gear=new Gear();
    robot.addPart(gear);	

    gear.forward(400);
    gear.setSpeed(30);
    
    gear.left(800);
    gear.forward(200);
    gear.right(480);
    robot.exit();
  }
  public static void main(String args[])	
  {
    MoveWithGear  m=new MoveWithGear();
  }
}       
