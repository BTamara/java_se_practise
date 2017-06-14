package permutationWithoutDups;

/**
 * Created by btamara on 2017.06.14..
 */
public class Main {

    public static void main(String args[]) {
        String inputString = "abcd";
        PermutationWithoutDups permutationWithoutDups = new PermutationWithoutDups();
        permutationWithoutDups.permute(inputString.toCharArray(), 0, inputString.length() - 1);
    }
}
