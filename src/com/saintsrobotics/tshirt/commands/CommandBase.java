package com.saintsrobotics.tshirt.commands;

import com.saintsrobotics.tshirt.OI;
import com.saintsrobotics.tshirt.subsystems.CompressorSubsystem;
import com.saintsrobotics.tshirt.subsystems.DriveSubsystem;
import com.saintsrobotics.tshirt.subsystems.PneumaticSubsystem;
import edu.wpi.first.wpilibj.command.Command;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static DriveSubsystem driveSubsystem;
    public static PneumaticSubsystem pneumaticSubsystem;
    public static CompressorSubsystem compressorSubsystem;
    
    public static void init() {
        driveSubsystem = new DriveSubsystem();
        pneumaticSubsystem = new PneumaticSubsystem();
        compressorSubsystem = new CompressorSubsystem();
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
