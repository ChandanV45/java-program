
package com.xworkz.app.six_level;

public class Fresherman extends UndergraduateStudent {

	public Fresherman(String name, int studentId) {
        super(name, studentId, 1);
        System.out.println("Invoking const in Freshman");
    }

    public void introduce() {
        super.introduce();
        System.out.println("I am a freshman.");
    }

}