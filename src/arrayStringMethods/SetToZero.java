package arrayStringMethods;

/**
 * Created by btamara on 2017.06.01..
 */

//if an element in an MxN matrix is 0, its entire row and column is set to 0


public class SetToZero {

    public int[][] setToZero(int[][] input){

        boolean row[] = new boolean[input.length];
        boolean column[] = new boolean[input[0].length];

        for(int i=0; i<input.length; i++){
            for(int j=0; j<input[i].length; j++){
                if(input[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i=0; i<input.length; i++){
            for(int j=0; j<input[i].length; j++) {
                if(row[i] || column[j] == true){
                    input[i][j] = 0;
                }
            }
        }

        for(int i=0;i<input.length;i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + " ");
            }
        }

        return input;
    }
}
