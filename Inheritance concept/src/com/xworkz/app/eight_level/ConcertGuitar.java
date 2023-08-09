package com.xworkz.app.eight_level;

public class ConcertGuitar extends ClasscialGuitar {
    public boolean hasCutaway;

    public ConcertGuitar(String type, int numStrings, String guitarType, boolean hasFretboardMarkers, boolean hasNylonStrings, String bodyStyle, boolean hasCutaway) {
        super(type, numStrings, guitarType, hasFretboardMarkers, hasNylonStrings, bodyStyle);
        System.out.println("Invoking const in ConcertGuitar");
        this.hasCutaway = hasCutaway;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Has Cutaway: " + hasCutaway);
    }
}