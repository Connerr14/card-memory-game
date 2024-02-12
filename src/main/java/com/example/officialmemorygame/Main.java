package com.example.officialmemorygame;

import com.example.officialmemorygame.Card;

public class Main {

    public static void main (String[] args) {
        Card aceOfSpades = new Card("spades", "ace");
        System.out.println(aceOfSpades);

        Card kingOfHearts = new Card("hearts", "king");

        System.out.println(kingOfHearts);

        Card twoOfHearts = new Card("hearts", "2");

        System.out.println(twoOfHearts.getValue());

        DeckOfCards deck = new DeckOfCards();

        deck.shuffle();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Top cards: " + deck.dealTopCard());
        }
        System.out.println(deck);
    }
}