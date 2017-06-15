package paintImage;

import java.util.Arrays;

/**
 * Created by btamara on 2017.06.15..
 */
public class PaintFill {

    public char[][] fill(char[][] image, int row, int column, char originalColor, char newColor) {
        if (row < 0 || row >= image.length || column < 0 || column >= image[0].length) {
            return image;
        }
        if (image[row][column] == originalColor) {
            image[row][column] = newColor;
            fill(image, row - 1, column, originalColor, newColor);
            fill(image, row + 1, column, originalColor, newColor);
            fill(image, row, column - 1, originalColor, newColor);
            fill(image, row, column + 1, originalColor, newColor);
        }
        //System.out.println(Arrays.deepToString(image));
        return image;
    }
}
