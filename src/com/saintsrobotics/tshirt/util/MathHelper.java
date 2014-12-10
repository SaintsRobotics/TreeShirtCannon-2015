package com.saintsrobotics.tshirt.util;

public class MathHelper {
    
    /**
     * Invert a value if it's supposed to be.
     * 
     * @param val the original value
     * @param inv whether or not to invert
     * @return {@code val} inverted if it's supposed to be
     */
    public static boolean invert(boolean val, boolean inv) {
        return val ^ inv;
    }
}
