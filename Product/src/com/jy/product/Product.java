package com.jy.product;

// 제품 만드는 공장
public class Product {
	private String name;
	private int price;
	
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	// Object 클래스 toString을 오버라이딩하여  Jaeyong 클래스에 
	// list()메소드 출력할시 arr이 주소로 찍히는걸 방지하기위한 toString 오버라이딩
	@Override
	public String toString() {
		return String.format("제품 : %s 가격 : %d", name, price);
	}
	
}
