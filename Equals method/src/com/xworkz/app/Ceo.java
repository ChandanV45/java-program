package com.xworkz.app;

	public class Ceo {
	    private String name;
	    private String companyName;
	    private int experience;
	    private String education;
	    private String address;
	    private int age;

	    public Ceo() {
	        System.out.println("invoking no-arg constructor in Ceo");
	    }

	    public Ceo(String name, String companyName, int experience, String education, String address, int age) {
	        super();
	        this.name = name;
	        this.companyName = companyName;
	        this.experience = experience;
	        this.education = education;
	        this.address = address;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "CEO [name=" + name + ", companyName=" + companyName + ", experience=" + experience + ", education="
	                + education + ", address=" + address + ", age=" + age + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        System.out.println("Invoking equals in CEO");
	        if (obj != null && obj instanceof Ceo) {
	            Ceo casted = (Ceo) obj;
	            if (casted.name.equals(name)) {
	                System.out.println("CEO name is same");
	                return true;
	            } else {
	                System.err.println("CEO name is not same");
	            }
	        }
	        return false;
	    }


	}



