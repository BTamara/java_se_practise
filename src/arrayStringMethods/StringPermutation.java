package arrayStringMethods;

import java.util.Arrays;

/**
 * Created by btamara on 2017.05.30..
 */

//How to determine if two strings are permutations of each other
public class StringPermutation {

    public boolean permutationChecker(String input1, String input2){
        char[] char1 = input1.toCharArray();
        char[] char2 = input2.toCharArray();

        if(input1.length() != input2.length()){
            System.out.println("!= length");
            return false;
        }else{
            Arrays.sort(char1);
            Arrays.sort(char2);
            if(Arrays.equals(char1,char2)){
                System.out.println("permutation");
                return true;
            }else{
                System.out.println("not permutation");
                return false;
            }
        }
    }
}
