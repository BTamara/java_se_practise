package powerSet;

/**
 * Created by btamara on 2017.06.12..
 */
public class Main {

    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        int[] input = { 1, 2, 3 };
        int[] helper = new int[input.length];
        powerSet.combinations(helper, 0, input);

    }
}
