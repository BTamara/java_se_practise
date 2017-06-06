package arrayStringMethods;

/**
 * Created by btamara on 2017.05.30..
 */

//Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the
//end of the string to hold the additional characters

public class Replacer {

    public String replace(String input){
        String[] splitted = input.split(" ");
        StringBuilder sentence = new StringBuilder();
        sentence.append(splitted[0]);
        for(int i=1; i<splitted.length; i++){
            sentence.append("%20");
            sentence.append(splitted[i]);
        }
        System.out.println(sentence.toString());
        return sentence.toString();
    }
}
