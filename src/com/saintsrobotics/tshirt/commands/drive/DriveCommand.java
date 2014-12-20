package com.saintsrobotics.tshirt.commands.drive;

import com.saintsrobotics.tshirt.OI;
import com.saintsrobotics.tshirt.commands.CommandBase;

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
