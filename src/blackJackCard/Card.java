package blackJackCard;

/**
 * Created by btamara on 2017.06.02..
 */
public class Card {
    private String rank;
    private String suit;

    public Card(String r,String s) {
        rank=r;
        suit=s;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return rank+" of "+suit;
    }
}
