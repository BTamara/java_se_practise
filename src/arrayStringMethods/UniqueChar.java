package arrayStringMethods;

import java.util.HashSet;

/**
 * Created by btamara on 2017.05.29..
 */

//"Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?"

public class UniqueChar {

    public boolean isUnique(String input){
        HashSet<Character> unique = new HashSet<>();
        for(int i=0; i<input.length(); i++){
            unique.add(input.toCharArray()[i]);
        }
        if(unique.size() != input.length()) {
            System.out.println("not all the characters are unique");
            return false;
        }else{
            System.out.println("all the characters are unique");
            return true;
        }

    }
}
