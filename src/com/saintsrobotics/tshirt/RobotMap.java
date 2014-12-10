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
    public static final boolean PRESSURE_SWITCH_INVERTED = false;
    
    public static final int FIRING_RELAY = 2;
    public static final Relay.Direction FIRING_DIRECTION = Relay.Direction.kForward;
    public static final boolean FIRING_INVERTED = false;
    
    public static final int TANK_RELAY = 2;
    public static final Relay.Direction TANK_DIRECTION = Relay.Direction.kForward;
    public static final boolean TANK_INVERTED = false;
    
    public static int MOTOR_LEFT = 1;
    public static int MOTOR_RIGHT = 2;
}
