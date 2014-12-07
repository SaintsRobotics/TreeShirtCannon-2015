package com.saintsrobotics.tshirt;


import com.saintsrobotics.tshirt.commands.CommandBase;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class SwagCannonBot extends IterativeRobot {

    public void robotInit() {
        CommandBase.init(); // Initialize all subsystems
    }
    
    public void autonomousInit() {
        
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void teleopInit() {
        
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
