package com.jy.product;

import java.util.ArrayList;
import java.util.List;

// 제품 구매하는 클래스
public class Jaeyong {
	List<Product> arr = new ArrayList();
	
	Product p = new Product();
	Product pTv = new Tv();
	Product pCom = new Computer();
	
	private int money;
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void addTv() {
		System.out.println("제품 이름 : " + pTv.getName());
		System.out.println("가격 : " + pTv.getPrice());
	}
	
	public void addCom() {
		System.out.println("제품 이름 : " + pCom.getName());
		System.out.println("가격 : " + pCom.getPrice());
	}
	
	public void choice(int num) {
		
		if (num == 1) {
			money -= pTv.getPrice();
			addTv();
			arr.add(pTv);
			
		} else if (num == 2) {
			money -= pCom.getPrice();
			addCom();
			arr.add(pCom);
			
		} else {
			System.out.println("1, 2번 만 입력가능");
		}
	}
	
	
	// Product 클래스에 toString()보면서 이해하기
	
	public void list() {
		for(int i=0; i<arr.size(); i++) {
			System.out.printf("%d %s\n",i+1,arr.get(i));
		}
		
		
	}
	
	
	
	
}
