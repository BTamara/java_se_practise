package parkingLot;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by btamara on 2017.06.07..
 */
public class ParkingLot {

    public boolean canParking(Vehicle vehicle, ArrayList<Spot> spots){
        for(Spot spot : spots){
            if(spot.isFree == true && spot.type == vehicle.type){
                System.out.println("free to park here: " + spot.placeNumber + "\n");
                spot.setFree();
                return true;
            }else{
                System.out.println("already reserved spot: " + spot.getPlaceNumber());
            }
        }return false;
    }


}
