package com.saintsrobotics.tshirt;

import com.saintsrobotics.tshirt.commands.firing.FireAndReloadCommand;
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
    
    public static final int LEFT_X = 1;
    public static final int LEFT_Y = 2;
    public static final int TRIGGERS = 3;
    public static final int RIGHT_X = 4;
    public static final int RIGHT_Y = 5;
    
    private static final int JOYSTICK_PORT = 1;
    private static final int BUTTON_A = 2;
    
    private final Joystick xbox;
    
    public OI() {
        xbox = new Joystick(JOYSTICK_PORT);
        Button a = new JoystickButton(xbox, BUTTON_A);
        Button b = new JoystickButton(xbox, BUTTON_A);
        Button x = new JoystickButton(xbox, BUTTON_A);
        a.whenPressed(new FireAndReloadCommand());
        b.whenPressed(new FireCommand());
        x.whenPressed(new ReloadCommand());
    }
    
    public double getAxis(int axis) {
        if (axis<1 || axis>5)
            return 0;
        return xbox.getRawAxis(axis);
    }
}

