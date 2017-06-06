import arrayStringMethods.*;

import linkedListMethods.*;



/**
 * Created by btamara on 2017.05.30..
 */
public class Main {

    static UniqueChar uniqueChar = new UniqueChar();
    public static String input;
    public static String input1;
    public static String input2;
    public static String input3;
    public static String input4;
    public static String input5;
    public static String input6;
    public static int[][] input7;
    public static String input8;
    public static String input9;
    static StringPermutation stringPermutation = new StringPermutation();
    static Replacer replacer = new Replacer();
    static PermutationPalindrome permutationPalindrome = new PermutationPalindrome();
    static OneEditDistanceString oneEditDistanceString = new OneEditDistanceString();
    static StringCompression stringCompression = new StringCompression();
    static ImageRotation imageRotation = new ImageRotation();
    static SetToZero setToZero = new SetToZero();
    static  StringRotationSubString stringRotationSubString = new StringRotationSubString();
    static LinkedList linkedList = new LinkedList();

    public static void main(String[] args) {
        input =  "Set.add() returns a boolean, so by checking the result you can bail out quickly if a duplicate is found.";
        input1 = "abcd";
        //uniqueChar.isUnique(input);
        //uniqueChar.isUnique(input1);

        input2 = "bcda";
        input3 = "deab";
        input4 = "ababc";
        input5 = "abcde";


//        stringPermutation.permutationChecker(input1,input2);
//        stringPermutation.permutationChecker(input1,input3);
//        stringPermutation.permutationChecker(input,input3);

//        replacer.replace(input);

        permutationPalindrome.isPalindrome(input1);
        permutationPalindrome.isPalindrome(input4);

//        oneEditDistanceString.isOneEditDistance(input1, input5);

        input6 = "aaaabbbccccccc";
//        stringCompression.compressor(input6);

        input7 = new int[][] {  {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 0, 19, 20},
                {21, 22, 23, 24, 25}};

//        imageRotation.rotateLeft(input7);
//        System.out.println("");
//        imageRotation.rotateRight(input7);

//       setToZero.setToZero(input7);

        input8 = "waterbottle";
        input9 = "erbottlewat";

//        stringRotationSubString.isRotation(input8, input9);

        LinkedList myLinkedList = new LinkedList();
        //Node newNode = new Node(1);
        myLinkedList.insert(1);
        myLinkedList.insert(2);
        myLinkedList.insert(3);
        myLinkedList.insert(4);
        myLinkedList.insert(5);
//        System.out.println(myLinkedList.size());
//        myLinkedList.remove(2);
//
//        myLinkedList.traverseList();
//        myLinkedList.deleteDuplicates();
//        myLinkedList.traverseList();
//        myLinkedList.findTheKthElement(2);
//        myLinkedList.removeMiddle();
    }
}
