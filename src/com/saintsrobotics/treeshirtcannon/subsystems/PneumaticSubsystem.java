package com.saintsrobotics.treeshirtcannon.subsystems;

import com.saintsrobotics.treeshirtcannon.RobotMap;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PneumaticSubsystem extends Subsystem {
    
    DigitalOutput firingValve = new DigitalOutput(RobotMap.FIRING_RELAY);
    DigitalOutput tankValve = new DigitalOutput(RobotMap.TANK_RELAY);
    
    protected void initDefaultCommand() { }

    /**
     * Opens or closes the valve connected to the air tanks.
     * 
     * @param val true for open, false for closed
     */
    public void setTankValve(boolean val) {
        tankValve.set(val);
    }
    
    /**
     * Opens or closes the valve connected to the firing tube.
     * 
     * @param val true for open, false for closed
     */
    public void setFiringValve(boolean val) {
        firingValve.set(val);
    }
}
