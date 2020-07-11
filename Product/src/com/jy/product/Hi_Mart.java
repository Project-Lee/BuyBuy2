package com.jy.product;

import java.util.Scanner;

public class Hi_Mart {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product p = new Product();
		Jaeyong j = new Jaeyong();
		
		j.setMoney(1000);
		System.out.println("숫자입력");
		int num = 0;
		while(true) {
					
			try {
				num = scan.nextInt();
			} catch (Exception e) {
				System.out.println("숫자만 입력");
			}
			
			j.choice(num);
			
			if (num == 3) {
				System.out.println("종료");
				break;
			}
		}
		
		j.list();
		
		
		
	}

}
