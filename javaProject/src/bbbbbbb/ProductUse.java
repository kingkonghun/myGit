package bbbbbbb;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> list = new ArrayList<>();
//		System.out.println("2건의 제품정보를 입력하세요");
//		Product p1= new Product();
//		p1.input();
//		
//		Product p2 =new Product()	;
//		p2.input();
//		
//		list.add(p1);
//		list.add(p2);
//		
//		System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)\t부가가치세(천원)");
//		System.out.println("-------------------------------------------------------------------");
//		for(int i=0; i< list.size(); i++) {
//			Product pr = list.get(i);
//			System.out.println(pr.getProdNum()+"\t\t"+pr.getProdName()
//            +"\t\t"+pr.getCompany()+"\t\t"+pr.getPrice()+"\t\t"+
//            pr.getQuantity()+"\t"+String.format("%,d", pr.getMoney())+"\t"+String.format("%,d", pr.getVat())+"\n");
//		}
		
		
		System.out.println("제품정보를 입력하세요");
		
		
		while(true) {
			Product pr = new Product();
			pr.input();
			list.add(pr);
			System.out.print("계속 하려면 아무정수 두번, 끝내려면 exit또는 0 입력하세요 : ");
			
        if(sc.nextLine().equalsIgnoreCase("exit")) {
				break;
	}else if(
		sc.nextLine().equalsIgnoreCase("0")) {
		break;
	}
       
		}
        System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t수량\t금액(천원)\t부가가치세(천원)");
		System.out.println("-------------------------------------------------------------------");
		for(int i=0; i< list.size(); i++) {
			Product pr1 = list.get(i);
		System.out.println(pr1.getProdNum()+"\t\t"+pr1.getProdName()
        +"\t\t"+pr1.getCompany()+"\t\t"+pr1.getPrice()+"\t\t"+
        pr1.getQuantity()+"\t"+String.format("%,d", pr1.getMoney())+"\t"+String.format("%,d", pr1.getVat())+"\n");
}}}
