package com.railworld;

import java.util.Objects;

public class Employee {
public int empid;
public String name;
public int age;
public String gender;
public Employee(int empid, String name, int age, String gender) {
	super();
	this.empid = empid;
	this.name = name;
	this.age = age;
	this.gender = gender;
}

public String info() {
	return " [EmpId is " + empid + " Emp name is " + name + " Emp age is " + age + " and gender " + gender + "]";
}

@Override
public int hashCode() {
	return Objects.hash(age, empid, gender, name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return age == other.age && empid == other.empid && Objects.equals(gender, other.gender)
			&& Objects.equals(name, other.name);
}




}
