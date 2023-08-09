package com.xworkz.app.eight_level;

public class FenderStartocaster extends SolidBodyElectricGuitar {
    public String finish;

    public FenderStartocaster(String type, int numStrings, String guitarType, String pickupType, boolean hasTremoloSystem, String finish) {
        super(type, numStrings, guitarType, pickupType, hasTremoloSystem);
        this.finish = finish;
    }

    public void playSound() {
        super.playSound();
        System.out.println("Finish: " + finish);
    }

}