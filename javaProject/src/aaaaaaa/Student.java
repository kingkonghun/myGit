package aaaaaaa;

public class Student {
	private String name;
	private String num;
	private String major;
	private int year;
	
	public Student() {}
	public void input(String name, String num, String majour, int year) {
		this.name = name;
		this.num = num;
		this.major = majour;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
