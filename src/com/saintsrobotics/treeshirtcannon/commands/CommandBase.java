package com.saintsrobotics.treeshirtcannon.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 * This class overrides the default abstract methods
 * from Command. For readability and code simplicity.
 */
public class CommandBase extends Command {

    protected void initialize() { }
    protected void execute() { }
    protected boolean isFinished() { return false; }
    protected void end() { }
    protected void interrupted() { }
}