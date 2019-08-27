
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 * @author cglan
 */

public class drivetrain{

    public static SpeedController LeftMotor;
    public static SpeedController RightMotor;
    public static RobotDrive robotDrive;
    
    
    
    public void DrivetrainInit(){
    LeftMotor = new Talon(2);
    RightMotor = new Talon(3);
    robotDrive = new RobotDrive(LeftMotor,RightMotor);
}

    
    
    public void arcadeBDrive() {
        
       robotDrive.arcadeDrive(OI.driverStick, 1, OI.driverStick, 3);
        
        robotDrive.setSafetyEnabled(false);
        
    }
    
    
    public void arcadeDrive() {
        
       robotDrive.arcadeDrive(OI.driverStick, 1, OI.driverStick, 2);
        
        robotDrive.setSafetyEnabled(false);
      
    }
    
    
      public void tankDrive() {

       robotDrive.tankDrive(OI.driverStick, 2, OI.driverStick, 5);

        robotDrive.setSafetyEnabled(false);
      
    }
    
    public static void fans(boolean x){
    
    
        
    
    }
    
    
    
    
    
    
    
    public void stop(){
    
    LeftMotor.set(0.00);
    RightMotor.set(0.00);
    }
    
    
    
    
    
    
    
}
