package com.saintsrobotics.tshirt.subsystems;

import com.saintsrobotics.tshirt.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PneumaticSubsystem extends Subsystem {
    
    DigitalInput pressureSwitch = new DigitalInput(RobotMap.PRESSURE_SWITCH);
    Relay compressorSpike = new Relay(RobotMap.COMPRESSOR_RELAY, RobotMap.COMPRESSOR_DIRECTION);
    
    protected void initDefaultCommand() { }
    
    public void setCompressor(boolean val) {
        
    }
    
    /**
     * Gets the value of the pressure switch.
     * 
     * @return true if pressure is high, false if pressure is low
     */
    public boolean getPressureSwitch() {
        return pressureSwitch.get() ^ RobotMap.PRESSURE_SWITCH_INVERTED;
    }
    
    /**
     * Gets the current setting of the Relay.
     * 
     * @return true if on (or forward in bidirectional mode), false if off
     * (or backwards in bidirectional mode).
     */
    public boolean getCompressor() {
        return compressorSpike.get().equals(Relay.Value.kOn) || compressorSpike.get().equals(Relay.Value.kForward);
    }
}
