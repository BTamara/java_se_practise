package robotInAGrid;

/**
 * Created by btamara on 2017.06.08..
 */
public class Maze {

    public int pathVariationFinder(int y, int x, String path) {
        int counter = 0;
        path = path+ y +","+ x +"  ";
        if(y==0 && x==0) {
            System.out.println(path);
            return 1;
        }

        if(y==0){
            counter = pathVariationFinder(y, x-1, path);
        }else if(x==0){
            counter = pathVariationFinder(y-1, x, path);
        }else{
            counter = pathVariationFinder(y, x-1, path) + pathVariationFinder(y-1, x, path);
        }
        //System.out.println(counter);
        return counter;
    }
}
