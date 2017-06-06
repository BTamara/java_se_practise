package blackJackCard;

/**
 * Created by btamara on 2017.06.02..
 */

public class Game {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.showCards();
        System.out.println("");
        myDeck.shuffle();
        System.out.println("");
        myDeck.showCards();
    }

}

