package com.saintsrobotics.tshirt.subsystems;

import com.saintsrobotics.tshirt.RobotMap;
import com.saintsrobotics.tshirt.util.MathHelper;
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
        tankValve.set(MathHelper.invert(val, RobotMap.TANK_INVERTED));
    }
    
    /**
     * Opens or closes the valve connected to the firing tube.
     * 
     * @param val true for open, false for closed
     */
    public void setFiringValve(boolean val) {
        firingValve.set(MathHelper.invert(val, RobotMap.FIRING_INVERTED));
    }
}
