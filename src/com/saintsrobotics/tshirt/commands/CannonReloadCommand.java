/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saintsrobotics.tshirt.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author s-yinb
 */
public class CannonReloadCommand extends CommandBase {
    private Timer timer;
    private double waittime;    
    public CannonReloadCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        timer = new Timer();
        timer.start();
        this.waittime = waittime;
        //Start close firing valve
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() >= waittime;
    }

    // Called once after isFinished returns true
    protected void end() {
        //open other valve
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}