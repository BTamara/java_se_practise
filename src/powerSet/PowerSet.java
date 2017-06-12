package powerSet;

/**
 * Created by btamara on 2017.06.12..
 */
public class PowerSet {


    public void combinations(int[] helper, int x, int[] input) {
        if (x == helper.length - 1) {
            helper[x] = 0;
            printArray(helper, input);
            helper[x] = 1;
            printArray(helper, input);
            return;
        }
        helper[x] = 0;
        combinations(helper, x + 1, input);
        helper[x] = 1;
        combinations(helper, x + 1, input);
    }

    public void printArray(int[] helper, int[] input) {
        boolean isNULL = true;
        System.out.print("{ ");
        for (int i = 0; i < input.length; i++) {
            if (helper[i] == 1) {
                System.out.print(input[i] + " ");
                isNULL = false;
            }
        }
        if (isNULL == false) {
            System.out.print("}");
            System.out.print(" ");
        }

        if (isNULL) {
            System.out.print("");
            System.out.print("} ");
        }
    }

    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        int[] input = { 1, 2, 3 };
        int[] helper = new int[input.length];
        powerSet.combinations(helper, 0, input);

    }
}
