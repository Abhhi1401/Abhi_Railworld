package com.railworld;

public class Student {
	public String name;
	
	public int rollno;
	
	public int age;
	 
	public String gender;

	public Student(String name, int rollno, int age, String gender) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.gender = gender;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name="  +name + ", rollno=" + rollno + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	

}
