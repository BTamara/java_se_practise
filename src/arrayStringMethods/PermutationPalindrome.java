package arrayStringMethods;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by btamara on 2017.05.31..
 */

//Given a string, write a function to check if it is a permutation of a palindrome.
//The palindrome does not need to be limited to just dictionary words.
public class PermutationPalindrome {

    public boolean isPalindrome(String input){
        Set<Character> unpairedCharacters = new HashSet<>();

        for(char i : input.toCharArray()){
            if(!unpairedCharacters.contains(i)){
                unpairedCharacters.add(i);
            }else{
                unpairedCharacters.remove(i);
            }
        }

        // the string has a palindrome permutation if it
        // has one or zero characters without a pair
        if(unpairedCharacters.size() <= 1){
            System.out.println("it can be a palindrome");
            return true;
        }else {
            System.out.println("it can't be a palindrome");
            return false;
        }
    }


}
