package com.example.officialmemorygame;

public class MemoryCard extends Card{
    private boolean mathched;

    public MemoryCard(String suit, String faceName) {
        super(suit, faceName);
        this.mathched = false;
    }

    public boolean isMathched() {
        return mathched;
    }

    public void setMathched(boolean mathched) {
        this.mathched = mathched;
    }

    /**
     *
     */

    public boolean isSameCard (MemoryCard otherCard)
    {
        return (this.getSuite().equals(otherCard.getSuite()) &&
                this.getFaceName().equals(otherCard.getFaceName()));
    }
}
