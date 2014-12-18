package com.saintsrobotics.tshirt.commands.compressor;

import com.saintsrobotics.tshirt.OI;
import com.saintsrobotics.tshirt.commands.CommandBase;

public class CompressorCommand extends CommandBase {
    
    public CompressorCommand() {
        requires(compressorSubsystem);
    }
    
    protected void initialize() {
    }

    protected void execute() {
        if (oi.getAxis(OI.TRIGGERS) > 0.5)
            compressorSubsystem.setCompressor(false); // left trigger
        else
            compressorSubsystem.setCompressor(!compressorSubsystem.getPressureSwitch());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
