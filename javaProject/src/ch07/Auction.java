package ch07;

public class Auction {
	private String name;
	private String id;
	private int pay;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getGrade() {
		if(pay > 100000) grade = "gold";
		else grade = "silver";
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println("이름\t\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+id+"\t\t"+pay+"\t"+getGrade());
	}
}
