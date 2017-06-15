package eightQueens;

import java.util.Arrays;

/**
 * Created by btamara on 2017.06.15..
 */
public class NQueens {

    static Integer[] placeOfTheQueens;

    public NQueens (Integer n){
        placeOfTheQueens = new Integer[n];
    }

    public void printQueens(Integer[] placeOfTheQueens) {
        for (int i = 0; i < placeOfTheQueens.length; i++) {
            for (int j = 0; j < placeOfTheQueens.length; j++) {
                if (placeOfTheQueens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens(3);
        placeOfTheQueens[0] = 0;
        placeOfTheQueens[1] = 1;
        placeOfTheQueens[2] = 2;
        nQueens.printQueens(placeOfTheQueens);
        System.out.println(Arrays.deepToString(placeOfTheQueens));

    }
}
