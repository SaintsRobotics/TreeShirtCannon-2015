
package com.saintsrobotics.tshirt.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
    
    SpeedController left;
    SpeedController right;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setTankDrive(double l, double r) {
        left.set(l);
        right.set(r);
    }
}