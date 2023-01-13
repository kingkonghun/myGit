package bbbbbbb;

import java.util.Scanner;

public class Product {

		private String prodNum;
		private String prodName;
		private String	 company;
		private int	 price;
		private int	 quantity;
		private int money;
		private int vat;	
		
		public String getProdNum() {
			return prodNum;
		}
		public void setProdNum(String prodNum) {
			this.prodNum = prodNum;
		}
		public String getProdName() {
			return prodName;
		}
		public void setProdName(String prodName) {
			this.prodName = prodName;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getMoney() {
			return price*quantity;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		public int getVat() {
			return (price*quantity)/10;
		}
		public void setVat(int vat) {
			this.vat = vat;
		}
		public void input() {
			Scanner sc = new Scanner(System.in);
			System.out.println("제품번호 : ");
			prodNum = sc.next()	;
			System.out.println("제품명 : ");
			prodName = sc.next();
			System.out.println("제조사 : ");
			company = sc.next()	;
			System.out.println("단가 : ");
			price = sc.nextInt()	;
			System.out.println("수량 : ");
			quantity = sc.nextInt()	;
			
			
		}
		
		
}
