package com.openshiftdeployement.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	private String Name;
	private int age;
	private String city;
	private Long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", age=" + age + ", city=" + city + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, int age, String city, Long salary) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
	}
	public Employee()
	{	
	}	
	
	
}