package io.codelex.oop.parcels;

public class ParcelTestApp {
    public static void main(String[] args) {
        Parcels parcel1 = new Parcels(30, 40, 60, 25, false);
        Parcels parcel2 = new Parcels(30, 40, 60, 10, true);
        Parcels parcel3 = new Parcels(100, 150, 90, 35, false);
        Parcels parcel4 = new Parcels(15, 20, 29, 19, true);
        System.out.println(parcel1.validate());
        System.out.println(parcel2.validate());
        System.out.println(parcel3.validate());
        System.out.println(parcel4.validate());
    }
}
