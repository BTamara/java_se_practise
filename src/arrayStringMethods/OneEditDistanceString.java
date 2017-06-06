package arrayStringMethods;

/**
 * Created by btamara on 2017.05.31..
 */

//Check if the two string is one edit away
public class OneEditDistanceString {

    public boolean isOneEditDistance(String input1, String input2){
        if(input1.equals(input2)){
            System.out.println("hey! it is the same");
            return false;
        }
        if(input1.length() - input2.length() > 1){
            System.out.println("there was too much changes");
            return false;
        }
        if(input2.length() - input1.length() > 1){
            System.out.println("there was too much changes");
            return false;
        }
        if(input1.length()- input2.length() == 1){
            return oneDeletion(input1, input2);
        }
        if(input1.length() - input2.length() == 0){
            System.out.println("it is a replace");
            return oneModeify(input1,input2);
        }
        return oneDeletion(input2, input1);

    }

    public boolean oneDeletion(String input1, String input2){
        System.out.println("it is an inserton/deletion");
        for(int i=0,j=0;i<input1.length() && j<input2.length();i++,j++){
            if(input1.charAt(i) != input2.charAt(j)){
                if(input1.substring(i+1).equals(input2.substring(j))){
                    System.out.println("tr");
                    return true;
                }else{
                    System.out.println("fl");
                    return false;
                }

            }
        }
        System.out.println("true");
        return true;
    }

    public boolean oneModeify(String input1, String input2){
        int diff =0;
        for(int i=0;i<input1.length();i++){
            if(input1.charAt(i) != input2.charAt(i)) diff++;
        }
        if(diff==1){
            System.out.println("the difference between the two string is one");
            return true;
        }else{
            System.out.println("the difference between the two string is more than one");
            return false;
        }
    }

}
