package io.codelex.oop.parcels;

public class Parcels implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcels(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        int countErr = 0;
        if (this.xLength + this.yLength + this.zLength > 300) {
            System.out.println("Sum of the dimensions (x, y, z) exceeds 300.");
            countErr++;
        }
        if (this.xLength < 30) {
            System.out.println("Dimension x is less than 30");
            countErr++;
        }
        if (this.yLength < 30) {
            System.out.println("Dimension y is less than 30");
            countErr++;
        }
        if (this.zLength < 30) {
            System.out.println("Dimension z is less than 30");
            countErr++;
        }
        if (!isExpress) {
            if (weight > 30) {
                System.out.println("Weight exceeds 30");
                countErr++;
            }
        } else {
            if (weight > 15) {
                System.out.println("Weight exceeds 15");
                countErr++;
            }
        }
        return countErr == 0;
    }
}
