package com.xworkz.app.six_level;

public class phDStudent extends MasterStudent {

	public phDStudent(String name, int studentId, String researchTopic) {
        super(name, studentId, researchTopic);
        System.out.println("invoking const in PhDstudent");
    }

    public void introduce() {
        super.introduce();
        System.out.println("I am pursuing a PhD.");
    }
}