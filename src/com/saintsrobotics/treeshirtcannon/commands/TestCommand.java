package com.saintsrobotics.treeshirtcannon.commands;

import com.saintsrobotics.treeshirtcannon.commands.firing.ValveCommand;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Fires, then reloads.
 */
public class TestCommand extends CommandGroup {
    
    public TestCommand() {
        addSequential(new ValveCommand(ValveCommand.Valve.TANK_VALVE, ValveCommand.ValvePosition.OPEN, 500));
        addSequential(new ValveCommand(ValveCommand.Valve.TANK_VALVE, ValveCommand.ValvePosition.CLOSED, 500));
        addSequential(new ValveCommand(ValveCommand.Valve.FIRING_VALVE, ValveCommand.ValvePosition.OPEN, 500));
        addSequential(new ValveCommand(ValveCommand.Valve.FIRING_VALVE, ValveCommand.ValvePosition.CLOSED, 500));
    }
}
