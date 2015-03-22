package com.saintsrobotics.treeshirtcannon.commands.firing;

import com.saintsrobotics.treeshirtcannon.RobotMap;
import com.saintsrobotics.treeshirtcannon.commands.firing.ValveCommand.Valve;
import com.saintsrobotics.treeshirtcannon.commands.firing.ValveCommand.ValvePosition;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Fires the cannon.
 * 
 * <p>Closes the tank valve, then opens and closes the firing valve to shoot
 * once.</p>
 */
public class FireCommand extends CommandGroup {
    
    public FireCommand() {
        addSequential(new ValveCommand(Valve.TANK_VALVE, ValvePosition.CLOSED, 0));
        addSequential(new ValveCommand(Valve.FIRING_VALVE, ValvePosition.OPEN, RobotMap.FIRE_TIME));
        addSequential(new ValveCommand(Valve.FIRING_VALVE, ValvePosition.CLOSED, 0));
    }
}
