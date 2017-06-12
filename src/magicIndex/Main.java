package magicIndex;

/**
 * Created by btamara on 2017.06.08..
 */
public class Main {

    public static void main(String[] args) {
        MagicIndexFinder magicIndexFinder = new MagicIndexFinder();
        int[] array1 = {-1,1,2,3};
        int[] array2 = {-3,0,1,2,3,4,5,6,7,8};
        magicIndexFinder.finder(array1);
        magicIndexFinder.finder(array2);
    }
}
