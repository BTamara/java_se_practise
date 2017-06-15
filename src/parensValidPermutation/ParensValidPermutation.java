package parensValidPermutation;

/**
 * Created by btamara on 2017.06.14..
 */

//https://www.youtube.com/watch?v=pD2VNU2x8w8
public class ParensValidPermutation {

    public void brackets(String output, int open, int close, int pairs){
        if(open == pairs && close == pairs){
            System.out.println(output);
        }else{
            if(open < pairs){
                brackets(output + "(", open+1, close, pairs);
            }
            if(close < open){
                brackets(output + ")", open, close+1, pairs);
            }
        }
    }


}
