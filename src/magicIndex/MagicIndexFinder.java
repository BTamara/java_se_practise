package magicIndex;

/**
 * Created by btamara on 2017.06.08..
 */

/*Magic Index: A magic index in an array A[ 1 ... n-1] is defined to be an index such that A[ i] =i.
 Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in array A.
 FOLLOW UP
 What if the values are not distinct?*/

public class MagicIndexFinder {

    public int finder(int[]array){
        for(int i=0; i<array.length; i++){
            if(array[i] == i){
                System.out.println(i);
                return i;
            }
        }
        System.out.println("there is no match");
        return 0;
    }
}
