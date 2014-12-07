package com.saintsrobotics.tshirt.commands;

import edu.wpi.first.wpilibj.Timer;
/**
 * SetTankValveCommand sets the tank valve then gives it a bit of time to finish opening/closing.
*/
public class SetTankValveCommand extends CommandBase {
    private Timer timer;
    private final boolean val;
    private double waittime = 0.5;
    public SetTankValveCommand(boolean val) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(pneumatics);
        this.val = val;
    }
    public SetTankValveCommand(double waittime, boolean val) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        this.waittime = waittime;
        requires(pneumatics);
        this.val = val;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        timer = new Timer();
        if(pneumatics.getTankValve() == val)
            waittime = 0.0;
        timer.start();
        pneumatics.setFiringValve(val);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() >= waittime || !pneumatics.getPressureSwitch();
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
