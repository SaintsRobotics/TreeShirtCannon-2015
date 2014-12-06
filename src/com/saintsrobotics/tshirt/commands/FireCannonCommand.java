package com.saintsrobotics.tshirt.commands;
import edu.wpi.first.wpilibj.Timer;
//* @author Precociouslydigital
public class FireCannonCommand extends CommandBase {
    private Timer timer;
    private double waittime;
    public FireCannonCommand(double waittime) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        timer = new Timer();
        timer.start();
        this.waittime = waittime;
        //Start relay (close valve)
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
        //open firing valve
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
