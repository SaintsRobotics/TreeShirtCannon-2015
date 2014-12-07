package com.saintsrobotics.tshirt.commands.firing;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Opens the tank valve, waits, then closes the tank valve.
 */
public class ReloadCommand extends CommandGroup {
    
    public ReloadCommand() {
        addSequential(new ValveCommand(ValveCommand.TANK_VALVE, ValveCommand.OPEN, 1000));
        addSequential(new ValveCommand(ValveCommand.TANK_VALVE, ValveCommand.CLOSED, 0));
    }
}
