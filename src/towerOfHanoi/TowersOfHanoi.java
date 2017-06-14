package towerOfHanoi;

/**
 * Created by btamara on 2017.06.13..
 */
public class TowersOfHanoi {

    public void mover (int index, String start, String temporary, String end){
        if(index == 1){
            System.out.println(start + " to " + end);
        }else{
            mover(index-1, start, end, temporary);
            System.out.println(start + " to " + end);
            mover(index-1, temporary, start, end);
        }
    }
}
