package arrayStringMethods;

/**
 * Created by btamara on 2017.05.31..
 */

//Implement a method to perform basic string compression using the counts of repeated characters.
//For example, the string aabcccccaaa would become a2blc5a3.
//If the "compressed" string would not become smaller than the original string, your method should return the original string.

public class StringCompression {

    public String compressor(String input){
        StringBuilder result = new StringBuilder();
        int counter = 1;
        char temp = input.charAt(0);
        for(int i=1; i<input.length();i++){
            if(temp == input.charAt(i)){
                counter++;
            }else{
                result.append(temp);
                result.append(counter);
                temp = input.charAt(i);
                counter = 1;
            }
        }
        result.append(temp).append(counter);
        if(result.length() < input.length()){
            System.out.println(result.toString());
            return result.toString();
        }else{
            System.out.println(input);
            return input;
        }
    }
}
