package com.xworkz.app;

public class Sniper {
	private String name;
    private String rifleModel;
    private int experience;
    private String camouflage;
    private String location;
    private int age;

    public Sniper() {
        System.out.println("no-arg constructor");
    }

    public Sniper(String name, String rifleModel, int experience, String camouflage, String location, int age) {
        super();
        this.name = name;
        this.rifleModel = rifleModel;
        this.experience = experience;
        this.camouflage = camouflage;
        this.location = location;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sniper [name=" + name + ", rifleModel=" + rifleModel + ", experience=" + experience + ", camouflage="
                + camouflage + ", location=" + location + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Invoking equals in Sniper");
        if (obj != null && obj instanceof Sniper) {
            Sniper casted = (Sniper) obj;
            if (casted.name.equals(name)) {
                System.out.println("Sniper name is same");
                return true;
            } else {
                System.err.println("Sniper name is not same");
            }
        }
        return false;
    }


}


