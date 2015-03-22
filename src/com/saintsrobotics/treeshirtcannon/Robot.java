package com.saintsrobotics.treeshirtcannon;

import com.saintsrobotics.treeshirtcannon.subsystems.CompressorSubsystem;
import com.saintsrobotics.treeshirtcannon.subsystems.DriveSubsystem;
import com.saintsrobotics.treeshirtcannon.subsystems.PneumaticSubsystem;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {
    
    public static OI oi;
    public static DriveSubsystem drive;
    public static PneumaticSubsystem pneumatics;
    public static CompressorSubsystem compressor;
    
    public void robotInit() {
        drive = new DriveSubsystem();
        pneumatics = new PneumaticSubsystem();
        compressor = new CompressorSubsystem();
        oi = new OI();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    public void testPeriodic() {
        LiveWindow.run();
    }
}
