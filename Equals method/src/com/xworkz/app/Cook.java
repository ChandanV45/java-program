package com.xworkz.app;

public class Cook {
    private String name;
    private String cuisineSpecialization;
    private int experience;
    private String restaurant;
    private String location;
    private int age;

    public Cook() {
        System.out.println("no-arg constructor");
    }

    public Cook(String name, String cuisineSpecialization, int experience, String restaurant, String location, int age) {
        super();
        this.name = name;
        this.cuisineSpecialization = cuisineSpecialization;
        this.experience = experience;
        this.restaurant = restaurant;
        this.location = location;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cook [name=" + name + ", cuisineSpecialization=" + cuisineSpecialization + ", experience=" + experience
                + ", restaurant=" + restaurant + ", location=" + location + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Invoking equals in Cook");
        if (obj != null && obj instanceof Cook) {
            Cook casted = (Cook) obj;
            if (casted.name.equals(name)) {
                System.out.println("Cook name is same");
                return true;
            } else {
                System.err.println("Cook name is not same");
            }
        }
        return false;
    }


}
