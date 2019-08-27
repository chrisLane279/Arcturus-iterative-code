
package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.DigitalOutput;
/**
 *
 * @author cglan
 */

public class NI9403{// for running the NI9403 digital module
    
    
public static boolean Di2;
 public static DigitalOutput DO1= new DigitalOutput(2);
    
    
    public void module2init(){
        
        DO1.set(false);
        
    }
    
    public void module2run(){
    
    
    
    }
    
    
    
}
