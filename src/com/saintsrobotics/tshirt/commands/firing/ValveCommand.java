package com.saintsrobotics.tshirt.commands.firing;

import com.saintsrobotics.tshirt.commands.CommandBase;

/**
 * Sets a valve to a value and then delays.
 * 
 * <p>Note that the delay is increased by the time it takes for the valve to
 * close, which is stored in {@code VALVE_DELAY}.
 */
public class ValveCommand extends CommandBase {
    
    /** The delay for turning the valve on in milliseconds. */
    public static final int VALVE_DELAY = 20;
    
    public static final int FIRING_VALVE = 0;
    public static final int TANK_VALVE = 1;
    
    public static final boolean OPEN = true;
    public static final boolean CLOSED = false;
    
    private final int valve;
    private final boolean position;
    
    /**
     * Creates a new {@code ValveCommand} with a specified duration, valve, and
     * value.
     * 
     * @param valve valve to set, either {@code ValveCommand.FIRING_VALVE} or
     * {@code ValveCommand.TANK_VALVE}
     * @param position whether to open or close the valve, {@code ValveCommand.OPEN} (true) to
     * open, and {@code ValveCommand.CLOSED} (false) to close.
     * @param time time to delay after setting valve, in milliseconds
     */
    public ValveCommand(int valve, boolean position, double time) {
        requires(pneumatics);
        this.setTimeout(time/1000 + VALVE_DELAY);
        this.valve = valve;
        this.position = position;
    }
    
    protected void initialize() {
        switch(valve) {
            case FIRING_VALVE:
                pneumatics.setFiringValve(position);
                break;
            case TANK_VALVE:
                pneumatics.setTankValve(position);
                break;
        }
    }
    
    protected boolean isFinished() {
        return isTimedOut();
    }
    
    protected void execute() { }
    protected void end() { }
    protected void interrupted() { }
}
