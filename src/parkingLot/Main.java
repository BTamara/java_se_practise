package parkingLot;

import java.util.ArrayList;

/**
 * Created by btamara on 2017.06.07..
 */
public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        Spot spot1 = new Spot(1);
        Spot spot2 = new Spot(1);
        Spot spot3 = new Spot(2);
        Spot spot4 = new Spot(2);
        Vehicle vehicle1 = new Vehicle(1);
        Vehicle vehicle2 = new Vehicle(1);
        Vehicle vehicle3 = new Vehicle(2);
        Vehicle vehicle4 = new Vehicle(2);
        ArrayList<Spot> spots = new ArrayList<>();
        spots.add(spot1);
        spots.add(spot2);
        spots.add(spot3);
        spots.add(spot4);

        parkingLot.canParking(vehicle1, spots);
        parkingLot.canParking(vehicle2, spots);
        parkingLot.canParking(vehicle3, spots);
        parkingLot.canParking(vehicle4, spots);


    }
}
