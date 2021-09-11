package com.training.objrelation;

public class Professor {

	Student student;
	public Professor() {
		
	}

	public void teach(Course course) {
		student.remember(course.getKnowledge());
	}
}

