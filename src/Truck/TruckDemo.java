package Truck;

import static java.lang.System.out;

public class TruckDemo {
    public static void main(String args[]){
        Truck semi = new Truck(2,200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);

        out.println("Truck can grab " + semi.getCargocap() + " funts");
        out.println("For distance " + dist + " miles truck need " + gallons + " of fuel. \n");

        gallons = pickup.fuelneeded(dist);

        out.println("Pickup can grab " + pickup.getCargocap() + " funts");
        out.println("For distance " + dist + " miles pickup need " + gallons + " of fuel.");
    }
}