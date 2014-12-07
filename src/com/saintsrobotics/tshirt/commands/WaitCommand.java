/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saintsrobotics.tshirt.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Benjamin
 */
public class WaitCommand extends CommandBase {
    private final double waitTime; 
    private Timer timer;
    public WaitCommand(double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        waitTime = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() > waitTime;
    }

    // Called once after isFinished returns true
    protected void end() {
        timer.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
