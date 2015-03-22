package com.saintsrobotics.treeshirtcannon.commands.firing;

import com.saintsrobotics.treeshirtcannon.RobotMap;
import com.saintsrobotics.treeshirtcannon.commands.firing.ValveCommand.Valve;
import com.saintsrobotics.treeshirtcannon.commands.firing.ValveCommand.ValvePosition;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Reloads the cannon.
 * 
 * Closes the firing valve, opens the tank valve for a period of time, then
 * closes the tank valve.
 */
public class ReloadCommand extends CommandGroup {
    
    public ReloadCommand() {
        addSequential(new ValveCommand(Valve.FIRING_VALVE, ValvePosition.CLOSED, 0));
        addSequential(new ValveCommand(Valve.TANK_VALVE, ValvePosition.OPEN, RobotMap.RELOAD_TIME));
        addSequential(new ValveCommand(Valve.TANK_VALVE, ValvePosition.CLOSED, 0));
    }
}
