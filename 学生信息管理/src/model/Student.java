package model;
import java.io.Serializable;

public class Student{
	String id;
	String name;
	float math;
	float physical;
	float english;
	public Student(String id, String name, float math, float physical, float english) {
		super();
		this.id = id;
		this.name = name;
		this.math = math;
		this.physical = physical;
		this.english = english;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	public float getPhysical() {
		return physical;
	}
	public void setPhysical(float physical) {
		this.physical = physical;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", math=" + math + ", physical=" + physical + ", english="
				+ english + "]";
	}
}
