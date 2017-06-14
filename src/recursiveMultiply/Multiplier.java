package recursiveMultiply;

/**
 * Created by btamara on 2017.06.12..
 */
public class Multiplier {

    int multiply (int a,int b){
        if(a==0 || b ==0){
            return 0;
        }
        if(a==1){
            return b;
        }
        if (b==1){
            return a;
        }else{
            return (multiply (a,b-1)+a);
        }
    }
}
