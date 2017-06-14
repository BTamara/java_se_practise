package permutationWithoutDups;

import java.util.Arrays;

/**
 * Created by btamara on 2017.06.14..
 */

//Heap's algorithm
public class PermutationWithoutDups {

    public void permute(char[] array, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            System.out.println(String.valueOf(array));
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                swap(array, startIndex, i);
                permute(array, startIndex + 1, endIndex);
                swap(array, startIndex, i);
            }
        }
    }

    public void swap(char[] array, int x, int y) {
        char temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

