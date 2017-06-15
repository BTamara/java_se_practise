package eightQueens;

/**
 * Created by btamara on 2017.06.15..
 */
public class NQueens {

    Integer[] queensList;

    public NQueens (Integer n){
        queensList = new Integer[n];
    }

    public void printTheBoard(Integer[] placeOfTheQueens) {
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
        System.out.println();
    }

    public boolean canPlaceQueen(Integer row, Integer column) {
        for (int i = 0; i < row; i++) {
            if (queensList[i] == column)
            {
                System.out.println("not a possible way");
                return false;
            }
            if((i - row) == (queensList[i] - column)){
                System.out.println("not a possible way");
                return false;
            }
            if((i - row) == (column - queensList[i])){
                System.out.println("not a possible way");
                return false;
            }
        }
        return true;
    }

    public void placeNqueens(Integer row, Integer numberOfQueens) {

        for (int i = 0; i < numberOfQueens; i++) {
            if (canPlaceQueen(row, i) == true) {
                queensList[row] = i;
                if (row == numberOfQueens - 1) {
                    printTheBoard(queensList);
                } else {
                    placeNqueens(row + 1, numberOfQueens);
                }
            }
        }
    }
}
