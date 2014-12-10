package com.saintsrobotics.tshirt.commands.firing;

import com.saintsrobotics.tshirt.commands.firing.ValveCommand.Valve;
import com.saintsrobotics.tshirt.commands.firing.ValveCommand.ValvePosition;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Reloads the cannon.
 * 
 * <p>Closes the firing valve, opens the tank valve for a period of time, then
 * closes the tank valve.</p>
 */
public class ReloadCommand extends CommandGroup {
    
    public ReloadCommand() {
        addSequential(new ValveCommand(Valve.FIRING_VALVE, ValvePosition.CLOSED, 0));
        addSequential(new ValveCommand(Valve.TANK_VALVE, ValvePosition.OPEN, 1000));
        addSequential(new ValveCommand(Valve.TANK_VALVE, ValvePosition.CLOSED, 0));
    }
}
