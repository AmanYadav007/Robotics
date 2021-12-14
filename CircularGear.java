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
class CircularGear
{
   CircularGear()
 {
    NxtRobot robot=new NxtRobot();
   Gear gear=new Gear();
   robot.addPart(gear);
  gear.forward(200);
  gear.setSpeed(20);
  gear.leftArc(0.2,7000);
 gear.forward(200);
  gear.leftArc(0.2,7000);
gear.forward(200);
 gear.leftArc(0.2,7000);
gear.forward(200);
    gear.leftArc(0.2,7000);
  gear.forward(200);
 robot.exit();
}
 public static void main(String args[])
{
    CircularGear  m=new  CircularGear();
    NxtContext.setStartPosition(250,200);
   NxtContext.setStartDirection(90);
  }
}
