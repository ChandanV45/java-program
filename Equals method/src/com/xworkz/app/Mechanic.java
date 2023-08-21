package com.xworkz.app;

public class Mechanic {
	private String name;
    private String specialization;
    private int experience;
    private String certification;
    private String workshop;
    private int age;

    public Mechanic() {
        System.out.println("no-arg constructor");
    }

    public Mechanic(String name, String specialization, int experience, String certification, String workshop, int age) {
        super();
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.certification = certification;
        this.workshop = workshop;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mechanic [name=" + name + ", specialization=" + specialization + ", experience=" + experience
                + ", certification=" + certification + ", workshop=" + workshop + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Invoking equals in Mechanic");
        if (obj != null && obj instanceof Mechanic) {
            Mechanic casted = (Mechanic) obj;
            if (casted.name.equals(name)) {
                System.out.println("Mechanic name is same");
                return true;
            } else {
                System.err.println("Mechanic name is not same");
            }
        }
        return false;
    }

}


