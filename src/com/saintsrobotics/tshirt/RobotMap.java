package com.saintsrobotics.tshirt;

import edu.wpi.first.wpilibj.Relay;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    public static final boolean MANUAL_COMPRESSOR = true;
    
    public static final int PRESSURE_SWITCH = 12; // Digital I/O
    public static final int FIRING_RELAY = 2; // Digital I/O
    public static final int TANK_RELAY = 3; // Digital I/O

    public static final int COMPRESSOR_RELAY = 3; // Relay
    public static final Relay.Direction COMPRESSOR_DIRECTION = Relay.Direction.kForward;
    
    public static final int RELOAD_TIME = 6000;
    public static final int FIRE_TIME = 1000;
    
    public static final int MOTOR_RIGHT_1 = 1;
    public static final int MOTOR_RIGHT_2 = 2;
    public static final int MOTOR_LEFT_1 = 3;
    public static final int MOTOR_LEFT_2 = 4;
}
