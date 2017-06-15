package paintImage;

import java.util.Arrays;

/**
 * Created by btamara on 2017.06.15..
 */
public class Main {
    public static void main(String[] args) {
        PaintFill paintFill = new PaintFill();

        char[][]image = new char[][]{
                {'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
        };
        char originalColor = image[0][0];
        char newColor = 'B';
        int row = 3;
        int column = 3;
        char [][] newImage = paintFill.fill(image, row, column, originalColor, newColor);
        System.out.println(Arrays.deepToString(newImage));

    }

}
