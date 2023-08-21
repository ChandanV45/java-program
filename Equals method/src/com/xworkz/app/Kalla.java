package com.xworkz.app;

public class Kalla {
	private String name;
    private String specialization;
    private int experience;
    private String attribute;
    private String location;
    private int age;

    public Kalla() {
        System.out.println("no-arg constructor");
    }

    public Kalla(String name, String specialization, int experience, String attribute, String location, int age) {
        super();
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.attribute = attribute;
        this.location = location;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kalla [name=" + name + ", specialization=" + specialization + ", experience=" + experience
                + ", attribute=" + attribute + ", location=" + location + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Invoking equals in Kalla");
        if (obj != null && obj instanceof Kalla) {
            Kalla casted = (Kalla) obj;
            if (casted.name.equals(name)) {
                System.out.println("Kalla name is same");
                return true;
            } else {
                System.err.println("Kalla name is not same");
            }
        }
        return false;
    }


}

