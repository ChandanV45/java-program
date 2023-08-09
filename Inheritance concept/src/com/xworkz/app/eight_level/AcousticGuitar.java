package com.xworkz.app.eight_level;

public class AcousticGuitar extends Guitar {
    public boolean hasFretboardMarkers;

    public AcousticGuitar(String type, int numStrings, String guitarType, boolean hasFretboardMarkers) {
        super(type, numStrings, GuitarType);
        System.out.println("Invoking const in AcousticGuitar");
        this.hasFretboardMarkers = hasFretboardMarkers;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Has Fretboard Markers: " + hasFretboardMarkers);
    }

}
