package com.saintsrobotics.tshirt.commands.firing;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Reloads, then fires.
 */
public class ReloadAndFireCommand extends CommandGroup {
    
    public ReloadAndFireCommand() {
        addSequential(new ReloadCommand());
        addSequential(new FireCommand());
    }
}
