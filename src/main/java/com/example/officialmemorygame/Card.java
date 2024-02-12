package com.example.officialmemorygame;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String suite;

    private String faceName;

    public Card (String suit, String faceName) {
        setSuite(suit);
        setFaceName(faceName);
    }

    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts", "diamonds", "spades", "clubs");
    }


    public String getSuite() {
        return suite;
    }

    /**
     * Valid suits are "hearts", "diamonds", "spades", "clubs"
     * @param suite
     */

    public void setSuite(String suite) {
        suite = suite.toLowerCase();
        if (getValidSuits().contains(suite)) {
            this.suite = suite;
        }
        else
        {
            throw new IllegalArgumentException(suite + "is an invalid suit, must be one of" + getValidSuits());
        }
    }

    public static List<String> getValidFaceNames() {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "king", "queen", "ace");
    }


    /**
     * Valid face names are, "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "king", "queen", "ace"
     * @return
     */
    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        if (getValidFaceNames().contains(faceName))
        {
            this.faceName = faceName;
        }
        else {
            throw new IllegalArgumentException("Invalid face name. Valid face names include" + getValidFaceNames());
        }
    }

    public String toString ()
    {
        return faceName + " of " + suite;
    }

    public String getColor (String suite)
    {
        if (suite.equals("hearts") || suite.equals("diamonds"))
        {
            return "red";
        }
        else {
            return "black";
        }
    }

    /**
     * Valid face names are
     * ["2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "king", "queen", "ace"]
     * @return
     */
    public int getValue ()
    {
       return getValidFaceNames().indexOf(faceName) + 2;
    }

    /**
     * This method wil return an image that represents the card
     */
    public Image getImage () {
        String pathName = "images/"+faceName+"_of_"+suite+".png";
        return new Image(Card.class.getResourceAsStream(pathName));
    }

    public Image getBackOfCardImage () {
        return new Image(Card.class.getResourceAsStream("images/back_of_card.png"));
    }
}
