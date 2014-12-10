package com.saintsrobotics.tshirt.commands.firing;

import com.saintsrobotics.tshirt.commands.CommandBase;

/**
 * Sets a valve to a value and then delays.
 * 
 * <p>Note that the delay is increased by the time it takes for the valve to
 * close, which is stored in {@code VALVE_DELAY}.
 */
public class ValveCommand extends CommandBase {
    
    /**
     * Represents the port a valve is connected to.
     */
    public static class Valve {
        
        /** The valve connecting the airlock and firing tube. */
        public static final Valve FIRING_VALVE = new Valve(0);
        
        /** The valve connecting the tank to the firing valve. */
        public static final Valve TANK_VALVE = new Valve(1);
        
        /** Raw integer value of the port. */
        public final int port;
        
        /**
         * Constructs a Valve with the specified port.
         * 
         * @param valve the port the valve is connected to.
         */
        private Valve(int valve) {
            this.port = valve;
        }
    }
    
    /**
     * Represents the position of the valve.
     */
    public static class ValvePosition {
        
        public static final ValvePosition OPEN = new ValvePosition(true);
        public static final ValvePosition CLOSED = new ValvePosition(false);
        
        /** Raw boolean value of the position. */
        public final boolean position;
        
        /** Gets the raw boolean value.
         * 
         * @return true for open and false for closed.
         */
        public boolean get() { return position; }
        
        /**
         * Represents the position of a valve..
         * 
         * @param position true for open and false for closed
         */
        public ValvePosition(boolean position) {
            this.position = position;
        }
    }
    
    /** The delay for turning the valve on in milliseconds. */
    public static final int VALVE_DELAY = 20;
    
    private final Valve valve;
    private final ValvePosition valvePosition;
    
    /**
     * Creates a new {@code ValveCommand} with a specified duration, valve, and
     * value.
     * 
     * @param valve valve to set, either {@code ValveCommand.FIRING_VALVE} or
     * {@code ValveCommand.TANK_VALVE}
     * @param valvePosition whether to open or close the valve, {@code ValveCommand.OPEN} or true to
     * open, and {@code ValveCommand.CLOSED} or false to close.
     * @param time time to delay after setting valve, in milliseconds
     */
    public ValveCommand(Valve valve, ValvePosition valvePosition, double time) {
        requires(pneumaticSubsystem);
        this.setTimeout(time/1000 + VALVE_DELAY);
        this.valve = valve;
        this.valvePosition = valvePosition;
    }
    
    protected void initialize() {
        if (valve == Valve.FIRING_VALVE)
            pneumaticSubsystem.setFiringValve(valvePosition.get());
        else if (valve == Valve.TANK_VALVE)
            pneumaticSubsystem.setTankValve(valvePosition.get());
    }
    
    protected boolean isFinished() {
        return isTimedOut();
    }
    
    protected void execute() { }
    protected void end() { }
    protected void interrupted() { }
}
