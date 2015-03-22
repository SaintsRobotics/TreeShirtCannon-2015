package com.saintsrobotics.treeshirtcannon.subsystems;

import com.saintsrobotics.treeshirtcannon.RobotMap;
import com.saintsrobotics.treeshirtcannon.commands.drive.DriveCommand;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
    
    SpeedController right1 = new Talon(RobotMap.MOTOR_RIGHT_1);
    SpeedController right2 = new Talon(RobotMap.MOTOR_RIGHT_2);
    SpeedController left1 = new Talon(RobotMap.MOTOR_LEFT_1);
    SpeedController left2 = new Talon(RobotMap.MOTOR_LEFT_2);
    
    public void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }
    
    public void setTankDrive(double l, double r) {
        left1.set(-l);
        left2.set(-l);
        right1.set(r);
        right2.set(r);
    }
    
    public void setArcadeDrive(double drive, double turn) {
        setTankDrive(drive+turn, drive-turn);
    }
}