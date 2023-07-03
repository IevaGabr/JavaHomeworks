package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(301, 420),
    INTERMEDIATE(241, 300),
    ADVANCED(180, 240);

    private final int minimumTime;
    private final int maximumTime;

    Runner(int minimumTime, int maximumTime) {
        this.minimumTime = minimumTime;
        this.maximumTime = maximumTime;
    }

    public int getMinimumTime() {
        return minimumTime;
    }

    public int getMaximumTime() {
        return maximumTime;
    }

    public static Runner getFitnessLevel(int runTime) {
        if (runTime < ADVANCED.maximumTime) {
            return ADVANCED;
        } else if (runTime > ADVANCED.maximumTime && runTime < INTERMEDIATE.maximumTime) {
            return INTERMEDIATE;
        } else {
            return BEGINNER;
        }
    }
}
