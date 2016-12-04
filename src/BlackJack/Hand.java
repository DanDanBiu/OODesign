package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ruoyu Wang on 2016/12/3.
 */
public abstract class Hand {
    private final List<Card> inHand = new ArrayList<>();

    public abstract int score();

    public void addCards(Card[] deal) {
        Collections.addAll(inHand, deal);
    }

    public int size() {
        return inHand.size();
    }
}
