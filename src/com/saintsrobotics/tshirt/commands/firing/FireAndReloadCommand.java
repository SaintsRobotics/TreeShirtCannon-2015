package com.saintsrobotics.tshirt.commands.firing;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * Fires, then reloads.
 */
public class FireAndReloadCommand extends CommandGroup {
    
    public FireAndReloadCommand() {
        addSequential(new FireCommand());
        addSequential(new ReloadCommand());
    }
}
