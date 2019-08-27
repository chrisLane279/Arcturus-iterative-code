/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


//import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.IterativeRobot;


/**If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 *
 *@author cglan
 */
public class RobotTemplate extends IterativeRobot {

    public static teleopRunner TeleopRunner = new teleopRunner();
    public static drivetrain Drivetrain = new drivetrain();
    public static NI9403 ni9403 = new NI9403();
    public static OI oi = new OI();
    
    public void robotInit(){
   ni9403.module2init();
    Drivetrain.DrivetrainInit();
    oi.oiInit();
    

    }
    
    
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        
    }
    
    
    
    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {

        TeleopRunner.iterate();
          System.out.println("enabled");
    }
    
    
    
    public void teleopPeriodic(){
    operatorControl();

    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
    
    
    
    
    
    public void disabled(){
        
    Drivetrain.stop();
    System.out.println("disabled");
    
    }
    
    
    
     
    public void disabledPeriodic(){
    disabled();
   // System.out.println(time.get());
    }
    
}
