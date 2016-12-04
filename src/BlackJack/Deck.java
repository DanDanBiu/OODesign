package BlackJack;

import java.util.Random;

/**
 * Created by Ruoyu Wang on 2016/12/3.
 */
public class Deck {
    private static final Random random = new Random();
    private final Card[] cards = new Card[52];
    private int dealtIndex;

    public Deck() {
        int index = 0;
        for (int i = 1; i <= 13; i++) {
            for (Suit s : Suit.values()) {
                cards[index++] = new Card(i, s);
            }
        }
    }

    public void shuffle() {
        for (int i = cards.length - 1; i > 0; i--) {
            int index = new Random().nextInt(i + 1);
            swap(i, index, cards);
        }
    }

    private void swap(int i, int j, Card[] cards) {
        Card temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }

    private int remainingCards() {
        return cards.length - dealtIndex;
    }

    public Card[] dealHand(int number) {
        if (remainingCards() < number) {
            return null;
        }
        Card[] deal = new Card[number];
        for (int i = 0; i < number; i++) {
            deal[i] = dealCard();
        }
        return deal;
    }

    private Card dealCard() {
        return remainingCards() == 0 ? null : cards[dealtIndex++];
    }
}
