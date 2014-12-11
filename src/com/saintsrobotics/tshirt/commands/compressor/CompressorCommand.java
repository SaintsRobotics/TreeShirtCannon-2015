package com.saintsrobotics.tshirt.commands.compressor;

import com.saintsrobotics.tshirt.commands.CommandBase;

public class CompressorCommand extends CommandBase {

    protected void initialize() {
        requires(compressorSubsystem);
    }

    protected void execute() {
        if(compressorSubsystem.getPressureSwitch() && !compressorSubsystem.getCompressor()) {  //If Pressure is less than 115 psi and compressor is off--this may need to be changed based on orientation of pressure switch
                compressorSubsystem.setCompressor(true);   //Turn on compressor
        }
        
        else if (compressorSubsystem.getPressureSwitch() && compressorSubsystem.getCompressor()){
            compressorSubsystem.setCompressor(false);  //If pressure is already 115 and compressor in on, turn off compressor.
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
