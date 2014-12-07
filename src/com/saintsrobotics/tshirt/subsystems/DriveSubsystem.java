
package com.saintsrobotics.tshirt.subsystems;

import com.saintsrobotics.tshirt.commands.drive.DriveCommand;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
    
    SpeedController left;
    SpeedController right;
    
    public void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }
    
    public void setTankDrive(double l, double r) {
        left.set(l);
        right.set(r);
    }
}