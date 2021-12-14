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
public class Circlem
{
  Circlem()
  {
    NxtRobot robot=new NxtRobot();
    Gear gear=new Gear();
    robot.addPart(gear);
    gear.setSpeed(60);
    gear.leftArc(0.2,7000);
    gear.rightArc(0.2);
    Tools.delay(5000);
    robot.exit();
  }
  public static void main(String args[])
  {
    new Circlem();
  }
  }

