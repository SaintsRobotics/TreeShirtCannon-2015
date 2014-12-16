package com.saintsrobotics.tshirt.subsystems;

import com.saintsrobotics.tshirt.RobotMap;
import com.saintsrobotics.tshirt.commands.compressor.CompressorCommand;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CompressorSubsystem extends Subsystem {
    
    DigitalInput pressureSwitch = new DigitalInput(RobotMap.PRESSURE_SWITCH);
    Relay compressorRelay = new Relay(RobotMap.COMPRESSOR_RELAY, RobotMap.COMPRESSOR_DIRECTION);

    protected void initDefaultCommand() {
        setDefaultCommand(new CompressorCommand());
    }
    
    /**
     * Opens or closes the valve connected to the firing tube.
     * 
     * @param val true for open, false for closed
     */
    public void setCompressor(boolean val) {
        compressorRelay.set(val ? Relay.Value.kOn : Relay.Value.kOff);
    }
    
    /**
     * Gets the current setting of the tank valve.
     * 
     * @return true if on (or forward in bidirectional mode), false if off
     * (or backwards in bidirectional mode).
     */
    public boolean getCompressor() {
        return compressorRelay.get().equals(Relay.Value.kOn)||
               compressorRelay.get().equals(Relay.Value.kForward);
    }
    
    /**
     * Gets the value of the pressure switch.
     * 
     * @return true if pressure is high, false if pressure is low
     */
    public boolean getPressureSwitch() {
        return pressureSwitch.get();
    }
}
