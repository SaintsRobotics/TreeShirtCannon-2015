package com.saintsrobotics.tshirt;

import edu.wpi.first.wpilibj.Relay;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    public static final int PRESSURE_SWITCH = 1;
    public static final int COMPRESSOR_RELAY = 2;
    public static final boolean PRESSURE_SWITCH_INVERTED = false;
    public static final Relay.Direction COMPRESSOR_DIRECTION = Relay.Direction.kForward;
}
