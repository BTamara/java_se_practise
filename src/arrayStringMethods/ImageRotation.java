package arrayStringMethods;

/**
 * Created by btamara on 2017.06.01..
 */

//Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
//write a method to rotateLeft the image by 90 degrees Can you do this in place?
public class ImageRotation {

//    hint:
//    temp = top[i];
//    top[i] = left[i];
//    left[i] = bottom[i];
//    bottom[i]  = right[i];
//    right[i] = temp;

    public int[][] rotateLeft(int[][] input){

        int lengthOfInput = input.length;
        for (int i=0; i<lengthOfInput/2; i++){
            for(int j=i; j<lengthOfInput-i-1; j++){
                int temp = input[i][j];
//                System.out.println("input: " + input[i][j]);
//                System.out.println("input2: " + input[j][lengthOfInput-i-1]);
                input[i][j]= input[j][lengthOfInput-i-1];
                input[j][lengthOfInput-i-1] = input[lengthOfInput-i-1][lengthOfInput-j-1];
                input[lengthOfInput-i-1][lengthOfInput-j-1] = input[lengthOfInput-j-1][i];
                input[lengthOfInput-j-1][i] = temp;
            }
        }
        for(int i=0;i<input.length;i++) {
            for (int j = 0; j < input[0].length; j++) {
                System.out.print(input[i][j] + " ");
            }
        }

        return input;
    }

    public int[][] rotateRight(int[][] input){
        int lengthOfInput = input.length;
        int[][] result = new int[lengthOfInput][lengthOfInput];
        for(int i=0; i<lengthOfInput; i++) {
            for(int j=0; j<lengthOfInput; j++){
                result[i][j] = input[lengthOfInput-1-j][i];
            }
        }
        for(int i=0;i<result.length;i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
        return result;
    }
}
