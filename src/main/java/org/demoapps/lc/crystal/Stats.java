package org.demoapps.lc.crystal;


public class Stats {

    int floorJumpComparison;
    int linearComparison;

    public int getFloorJumpComparison() {
        return floorJumpComparison;
    }

    public void setFloorJumpComparison(int floorJumpComparison) {
        this.floorJumpComparison = floorJumpComparison;
    }

    public int getLinearComparison() {
        return linearComparison;
    }

    public void setLinearComparison(int linearComparison) {
        this.linearComparison = linearComparison;
    }

    public void incrementFloorJumpCounter() {
        floorJumpComparison++;
    }

    public void incrementLinearComparison() {
        linearComparison++;
    }

    public int getTotal() {
        return floorJumpComparison + linearComparison;
    }

    public String logSummary() {
        return String.format("[J:%2d, I: %2d, T:%2d]", getFloorJumpComparison(), getLinearComparison(), getTotal());
    }
}
