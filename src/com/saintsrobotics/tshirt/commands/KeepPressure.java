/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saintsrobotics.tshirt.commands;

import edu.wpi.first.wpilibj.Relay;

/**
 *
 * @author s-ranes
 */
public class KeepPressure extends CommandBase {
    

    public KeepPressure() {
        //requires business
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //start compressor
        //WILL HAVING COMPRESSOR PERPETUALLY RUNNING BE A PROBLEM?
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (!pneumatics.getPressureSwitch()) {
            pneumatics.setValve(true);
        }
        
        else {
            pneumatics.setValve(true);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        //don't run if FireCanon is running
    }
}
