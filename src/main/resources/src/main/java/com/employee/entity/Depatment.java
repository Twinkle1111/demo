package com.employee.entity;

public class Depatment {
	private int departmentid;
	private String name;
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "departmentid"+departmentid+"name"+name;
	}

}
