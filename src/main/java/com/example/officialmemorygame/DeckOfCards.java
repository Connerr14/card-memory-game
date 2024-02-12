package com.example.officialmemorygame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards () {
        this.deck = new ArrayList<>();
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getValidFaceNames();

        for (String suit: suits) {
            for (String faceName: faceNames)
            {
                deck.add(new Card(suit, faceName));
            }
        }

    }

    public String toString ()
    {
        return deck.toString();
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card dealTopCard()
    {
        if (deck.size() > 0)
        {
            return deck.remove(0);
        }
        else {
            return null;
        }
    }

    public int getnumOfCards () {
        return deck.size();
    }


}
