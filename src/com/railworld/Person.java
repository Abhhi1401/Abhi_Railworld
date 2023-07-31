package com.railworld;

public class Person implements Comparable<Person>{
	
	private String name;
	
	private int id;
	
	private int age;
	
	private String gender;
	
	private double salary;
	
	public Person() {
		
	}

	public Person(String name, int id, int age, String gender, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + ", gender=" + gender + ", salary=" + salary
				+ "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		 if(this.getAge()>(o.getAge())) {
			 return 1;
		}else {
			return-1;
		}
	
	}
	

}
