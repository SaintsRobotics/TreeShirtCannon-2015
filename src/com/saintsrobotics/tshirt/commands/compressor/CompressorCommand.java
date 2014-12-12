package com.saintsrobotics.tshirt.commands.compressor;

import com.saintsrobotics.tshirt.commands.CommandBase;

public class CompressorCommand extends CommandBase {

    protected void initialize() {
        requires(compressorSubsystem);
    }

    protected void execute() {
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
