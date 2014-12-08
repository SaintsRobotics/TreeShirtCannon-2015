package com.saintsrobotics.tshirt.commands.firing;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Reloads the cannon.
 * 
 * <p>Closes the firing valve, opens the tank valve for a period of time, then
 * closes the tank valve.</p>
 */
public class ReloadCommand extends CommandGroup {
    
    public ReloadCommand() {
        addSequential(new ValveCommand(ValveCommand.FIRING_VALVE, ValveCommand.CLOSED, 0));
        addSequential(new ValveCommand(ValveCommand.TANK_VALVE, ValveCommand.OPEN, 1000));
        addSequential(new ValveCommand(ValveCommand.TANK_VALVE, ValveCommand.CLOSED, 0));
    }
}
