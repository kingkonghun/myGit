package ch07;

public class Employee {
	private String name;
	private String part;
	private String position;
	private int basic;
	private int bonus;
	private int total;
	private int tax;
	private int salary;//실수령액(총액-세액)
	public void input(String name, String part, String position, int basic) {
		
		this.name = name;
		this.part = part;
		this.position = position;
		this.basic = basic;//소스 두번째
	}
	public void calc() {
		bonus=basic*3;//보너스 기본급 300%
		total=basic+bonus;
		tax=(int)(total*0.033);
		salary=total-tax;
	}
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"+bonus+"\t"+total+"\t"+tax+"\t"+salary);
	}
}
