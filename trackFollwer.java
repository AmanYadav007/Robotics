package robotics;
import ch.aplu.robotsim.*;
/**
 *
 * @author Aman
 */

public class trackFollwer {
    public trackFollwer()
    {
        LegoRobot r=new LegoRobot();
        Gear g = new Gear();
        LightSensor ls = new LightSensor(SensorPort.S3);
        r.addPart(ls);
        r.addPart(g);
        while(true)
        {
            int p = ls.getValue();
            g.setSpeed(100);
            
            if(p>10)
            {
                g.forward();
            }            
            if(p>50 && p<1000)
            {
                g.rightArc(0.08);
            }
            
            System.out.println("Sensor Val:" +p);
        
             if(p==0)
              {
                   g.stop();
              }
              
             
        }
    }
    
    public static void main(String []arg)
    {
        new trackFollwer();
    }
    static
    {
        RobotContext.setStartPosition(80, 452);
        RobotContext.useBackground("sprites/track.PNG");
    }
}