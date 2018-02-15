package org.stackroute.exercisetwo;

class Member {
	String name;
	int age;
	double salary;
	
	Member(String namePassed, int agePassed, double d) {
		name = namePassed;
		age = agePassed;
		salary = d;
	}
	
	void getAllValues() {
		System.out.println("Members Name: "+this.name);
		System.out.println("Members Age: "+this.age);
		System.out.println("Members Salary: "+this.salary);	
	}
}

