package com.saintsrobotics.tshirt.commands.compressor;

import com.saintsrobotics.tshirt.OI;
import com.saintsrobotics.tshirt.RobotMap;
import com.saintsrobotics.tshirt.commands.CommandBase;

public class CompressorCommand extends CommandBase {

    protected void initialize() {
        requires(compressorSubsystem);
    }

    protected void execute() {
        if (RobotMap.MANUAL_COMPRESSOR)
            compressorSubsystem.setCompressor(oi.getAxis(OI.TRIGGERS) > 0.5);
        else
            compressorSubsystem.setCompressor(compressorSubsystem.getPressureSwitch());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
