package com.saintsrobotics.treeshirtcannon.commands.compressor;

import com.saintsrobotics.treeshirtcannon.commands.CommandBase;
import com.saintsrobotics.treeshirtcannon.OI;
import com.saintsrobotics.treeshirtcannon.Robot;

public class CompressorCommand extends CommandBase {
    
    public CompressorCommand() {
        requires(Robot.compressor);
    }
    
    protected void execute() {
        if (Robot.oi.getAxis(OI.TRIGGERS) > 0.5)
            Robot.compressor.setCompressor(false); // left trigger
        else
            Robot.compressor.setCompressor(!Robot.compressor.getPressureSwitch());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
