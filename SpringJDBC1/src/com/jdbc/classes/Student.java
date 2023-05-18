package com.jdbc.classes;

public class Student {
	public int Id;
	public String Name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + Id + ", name=" + Name + "]";
	}
	
}
