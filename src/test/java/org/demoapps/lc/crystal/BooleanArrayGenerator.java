package org.demoapps.lc.crystal;

public class BooleanArrayGenerator {
    public static boolean[] generate(int size, int location) {
        boolean[] floorPlan = new boolean[size];
        for (int i = location; i < size; i++) {
            floorPlan[i] = true;
        }
        return floorPlan;
    }
}
