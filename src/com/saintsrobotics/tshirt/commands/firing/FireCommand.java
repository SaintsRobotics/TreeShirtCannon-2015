package com.saintsrobotics.tshirt.commands.firing;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Fires the cannon.
 * 
 * <p>Closes the tank valve, then opens and closes the firing valve to shoot
 * once.</p>
 */
public class FireCommand extends CommandGroup {
    
    public FireCommand() {
        addSequential(new ValveCommand(ValveCommand.TANK_VALVE, ValveCommand.CLOSED, 0));
        addSequential(new ValveCommand(ValveCommand.FIRING_VALVE, ValveCommand.OPEN, 500));
        addSequential(new ValveCommand(ValveCommand.FIRING_VALVE, ValveCommand.CLOSED, 0));
    }
}
