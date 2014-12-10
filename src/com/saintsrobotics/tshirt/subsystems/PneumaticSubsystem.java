package com.saintsrobotics.tshirt.subsystems;

import com.saintsrobotics.tshirt.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PneumaticSubsystem extends Subsystem {
    
    DigitalInput pressureSwitch = new DigitalInput(RobotMap.PRESSURE_SWITCH);
    Relay firingValve = new Relay(RobotMap.FIRING_RELAY, RobotMap.FIRING_DIRECTION);
    Relay tankValve = new Relay(RobotMap.TANK_RELAY, RobotMap.TANK_DIRECTION);
    
    protected void initDefaultCommand() { }

    /**
     * Opens or closes the valve connected to the air tanks.
     * 
     * @param val true for open, false for closed
     */
    public void setTankValve(boolean val) {
        tankValve.set(invert(val, RobotMap.TANK_INVERTED) ? Relay.Value.kOn : Relay.Value.kOff);
    }
    
    /**
     * Opens or closes the valve connected to the firing tube.
     * 
     * @param val true for open, false for closed
     */
    public void setFiringValve(boolean val) {
        firingValve.set(invert(val, RobotMap.FIRING_INVERTED) ? Relay.Value.kOn : Relay.Value.kOff);
    }
    
    /**
     * Gets the current setting of the tank valve.
     * 
     * @return true if on (or forward in bidirectional mode), false if off
     * (or backwards in bidirectional mode).
     */
    public boolean getTankValve() {
        return tankValve.get().equals(Relay.Value.kOn)||
               tankValve.get().equals(Relay.Value.kForward);
    }
    
    /**
     * Gets the current setting of the firing valve.
     * 
     * @return true if on (or forward in bidirectional mode), false if off
     * (or backwards in bidirectional mode).
     */
    public boolean getFiringValve() {
        return firingValve.get().equals(Relay.Value.kOn) ||
               firingValve.get().equals(Relay.Value.kForward);
    }
    
    /**
     * Gets the value of the pressure switch.
     * 
     * @return true if pressure is high, false if pressure is low
     */
    public boolean getPressureSwitch() {
        return invert(pressureSwitch.get(), RobotMap.PRESSURE_SWITCH_INVERTED);
    }
    
    /**
     * Invert a value if it's supposed to be.
     * 
     * @param val the original value
     * @param inv whether or not to invert
     * @return {@code val} inverted if it's supposed to be
     */
    private boolean invert(boolean val, boolean inv) {
        return val ^ inv;
    }
}
