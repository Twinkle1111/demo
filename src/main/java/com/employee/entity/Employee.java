package com.employee.entity;

import java.util.Set;

public class Employee {
	private int id;

	private String name;
	private Set<Department> depts;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "id"+id+"name"+name;
		
	}

}
