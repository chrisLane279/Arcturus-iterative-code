
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 *
 * @author cglan
 */

//This operator interface file is made to work with Xbox controllers

public class OI{

    public static Joystick driverStick;
    public static Joystick operatorStick;
    
    
    //---------------------------------------------driver buttons
  public static JoystickButton driverA;
  public static JoystickButton driverB;
  public static JoystickButton driverX;
  public static JoystickButton driverY;  
  public static JoystickButton driverRMB;
  public static JoystickButton driverLMB;
  public static JoystickButton driverRSB;
  public static JoystickButton driverLSB;   
  public static JoystickButton driverRB;
  public static JoystickButton driverLB;

  
  
  //-----------------------------------------operator buttons 
  public static JoystickButton operatorA;
  public static JoystickButton operatorB;
  public static JoystickButton operatorX;
  public static JoystickButton operatorY;  
  public static JoystickButton operatorRMB;
  public static JoystickButton operatorLMB;
  public static JoystickButton operatorRSB;
  public static JoystickButton operatorLSB;   
  public static JoystickButton operatorRB;
  public static JoystickButton operatorLB;
    
    
    

    
    public void oiInit() {
   
        driverStick = new Joystick(1);
       operatorStick= new Joystick(2);
        
       
       
       
    driverA = new JoystickButton(driverStick,1);
    driverB= new JoystickButton(driverStick,2);
    driverX= new JoystickButton(driverStick,3);
    driverY= new JoystickButton(driverStick,4);  
    driverRMB= new JoystickButton(driverStick,8);
    driverLMB= new JoystickButton(driverStick,7);
    driverRSB= new JoystickButton(driverStick,10);
    driverLSB= new JoystickButton(driverStick,9);   
    driverRB= new JoystickButton(driverStick,6);
    driverLB= new JoystickButton(driverStick,5);

  
 
   
  
  
  
  operatorA= new JoystickButton(operatorStick,1);
  operatorB= new JoystickButton(operatorStick,2);
  operatorX= new JoystickButton(operatorStick,3);
  operatorY= new JoystickButton(operatorStick,4);  
  operatorRMB= new JoystickButton(operatorStick,8);
  operatorLMB= new JoystickButton(operatorStick,7);
  operatorRSB= new JoystickButton(operatorStick,10);
  operatorLSB= new JoystickButton(operatorStick,9);   
  operatorRB= new JoystickButton(operatorStick,6);
  operatorLB= new JoystickButton(operatorStick,5);
  
        
        
        
        
        
    }

    
}

