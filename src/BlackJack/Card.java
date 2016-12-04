package BlackJack;

/**
 * Created by Ruoyu Wang on 2016/12/3.
 */
public class Card {
    private int faceValue;
    private Suit suit;

    public Card(int v, Suit s) {
        faceValue = v;
        suit = s;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public Suit getSuit() {
        return suit;
    }
}
