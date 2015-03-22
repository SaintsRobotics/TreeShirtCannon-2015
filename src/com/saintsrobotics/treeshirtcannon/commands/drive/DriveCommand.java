package com.saintsrobotics.treeshirtcannon.commands.drive;

import com.saintsrobotics.treeshirtcannon.OI;
import com.saintsrobotics.treeshirtcannon.Robot;
import com.saintsrobotics.treeshirtcannon.commands.CommandBase;

public class DriveCommand extends CommandBase {

    public DriveCommand() {
        requires(Robot.drive);
    }

    protected void execute() {
        Robot.drive.setTankDrive(Robot.oi.getAxis(OI.LEFT_Y), Robot.oi.getAxis(OI.RIGHT_Y));
    }

    protected boolean isFinished() {
        return false;
    }
}
