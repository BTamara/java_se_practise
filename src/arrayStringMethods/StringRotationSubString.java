package arrayStringMethods;

/**
 * Created by btamara on 2017.06.01..
 */

//Assume you have a method isSubstring which checks if one word is a substring of another Given two strings,s1 and s2,
//write code to check if s2 is a rotation of s1 using only one call to isSubstring (i e , “waterbottle” is a rotation of “erbottlewat”)

public class StringRotationSubString {

    public boolean isRotation(String input1, String input2){

        if(input1.length() == input2.length()) {
            String doubleInput1 = input1 + input1;
            if(doubleInput1.contains(input2) == true){
                System.out.println("it is subString");
                return true;
            }else{
                System.out.println("it isn't subString");
                return false;
            }
        }
        System.out.println("false");
        return false;
    }
}
