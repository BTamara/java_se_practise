package tripleStep;

/**
 * Created by btamara on 2017.06.07..
 */
public class TripleStep {

    public int countStep(int n){
        if(n<0){
            return 0;
        }else if(n == 0){
            return 1;
        }else{
            //System.out.println(countStep(n-1)+countStep(n-2)+countStep(n-3));
            return countStep(n-1)+countStep(n-2)+countStep(n-3);
        }
    }

}
