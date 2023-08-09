}
package com.xworkz.boot.six_level;

import com.xworkz.app.six_level.ResearchAssistant;

public class ResearchStudentRunner {

	public static void main(String[] args) {
		ResearchAssistant student = new ResearchAssistant("Vinay S", 1234, "Machine Learning");

		System.out.println("====================================================================================");
		student.introduce();
	}

}