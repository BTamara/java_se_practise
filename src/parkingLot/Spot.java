package parkingLot;

/**
 * Created by btamara on 2017.06.07..
 */
public class Spot {
    int type;
    int placeNumber;
    boolean isFree;
    static int counter = 1;

    public void setFree() {
        isFree = false;
    }


    public Spot(int type) {
        this.type = type;
        this.placeNumber = counter;
        counter++;
        this.isFree = true;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }


}
