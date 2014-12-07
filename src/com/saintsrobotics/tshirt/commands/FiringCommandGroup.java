package com.saintsrobotics.tshirt.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class FiringCommandGroup extends CommandGroup {
    /**
     * FiringCommandGroup will open and close the valves to cycle the firing tank like an airlock.
     */
    public FiringCommandGroup() {
        // Add Commands here:
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.
        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        
        addSequential(new SetTankValveCommand(false));
        addSequential(new SetFiringValveCommand(true));
        addSequential(new SetFiringValveCommand(false));
        addSequential(new SetTankValveCommand(true));
        // these will run in order.
    }
}
