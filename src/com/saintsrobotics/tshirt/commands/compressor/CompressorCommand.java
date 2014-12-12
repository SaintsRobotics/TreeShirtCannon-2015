package com.saintsrobotics.tshirt.commands.compressor;

import com.saintsrobotics.tshirt.commands.CommandBase;

public class CompressorCommand extends CommandBase {

    protected void initialize() {
        requires(compressorSubsystem);
    }

    protected void execute() {
        if(compressorSubsystem.getPressureSwitch()) {  //If Pressure is less than 115 psi
                compressorSubsystem.setCompressor(true);   //Turn on compressor
        }
        
        else {
            compressorSubsystem.setCompressor(false);  //If pressure is already 115, turn off compressor.
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
