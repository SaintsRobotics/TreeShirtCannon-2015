package com.saintsrobotics.treeshirtcannon.commands.drive;

import com.saintsrobotics.treeshirtcannon.OI;
import com.saintsrobotics.treeshirtcannon.commands.CommandBase;

public class DriveCommand extends CommandBase {

    public DriveCommand() {
        requires(driveSubsystem);
    }

    protected void initialize() {
    }

    protected void execute() {
        driveSubsystem.setTankDrive(oi.getAxis(OI.LEFT_Y), oi.getAxis(OI.RIGHT_Y));
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
