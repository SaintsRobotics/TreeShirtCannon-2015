package com.saintsrobotics.treeshirtcannon;

import com.saintsrobotics.treeshirtcannon.commands.CommandBase;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

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
