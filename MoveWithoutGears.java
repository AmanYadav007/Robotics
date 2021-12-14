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
class MoveWithoutGears
{
  MoveWithoutGears()  
  {
    TurtleRobot robot=new TurtleRobot();
    robot.forward(100);
    robot.left(45);
    robot.forward(200);
    robot.right(90);
    robot.backward(100);
    robot.exit();
   }
    public static void main(String args[])
    {
     MoveWithoutGears  m=new MoveWithoutGears();
    }
}          

