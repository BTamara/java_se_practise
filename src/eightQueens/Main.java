package eightQueens;

/**
 * Created by btamara on 2017.06.15..
 */
//https://www.youtube.com/watch?v=xouin83ebxE

public class Main {

    public static void main(String[] args) {
        NQueens nQueens = new NQueens(4);
        //System.out.println(Arrays.deepToString(nQueens.queensList));
        nQueens.placeNqueens(0,nQueens.queensList.length);
    }
}
