package com.saintsrobotics.tshirt;

import com.saintsrobotics.tshirt.commands.TestCommand;
import com.saintsrobotics.tshirt.commands.firing.ReloadAndFireCommand;
import com.saintsrobotics.tshirt.commands.firing.FireCommand;
import com.saintsrobotics.tshirt.commands.firing.ReloadCommand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    private static final int JOYSTICK_PORT = 1;
    
    public static final int LEFT_X = 1;
    public static final int LEFT_Y = 2;
    public static final int TRIGGERS = 3;
    public static final int RIGHT_X = 4;
    public static final int RIGHT_Y = 5;
    
    public static final int BUTTON_A = 1;
    public static final int BUTTON_B = 2;
    public static final int BUTTON_X = 3;
    public static final int BUTTON_Y = 4;
    public static final int BUTTON_LB = 5;
    public static final int BUTTON_RB = 6;
    public static final int BUTTON_BACK = 7;
    public static final int BUTTON_START = 8;
    public static final int BUTTON_L3 = 9;
    public static final int BUTTON_R3 = 10;
    
    private final Joystick xbox;
    
    public OI() {
        xbox = new Joystick(JOYSTICK_PORT);
        Button a = new JoystickButton(xbox, BUTTON_A);
        Button b = new JoystickButton(xbox, BUTTON_B);
        Button x = new JoystickButton(xbox, BUTTON_X);
        Button y = new JoystickButton(xbox, BUTTON_Y);
        a.whenPressed(new ReloadAndFireCommand());
        b.whenPressed(new FireCommand());
        x.whenPressed(new ReloadCommand());
        y.whenPressed(new TestCommand());
    }
    
    public double getAxis(int axis) {
        if (axis<1 || axis>5)
            return 0;
        return xbox.getRawAxis(axis);
    }
}

