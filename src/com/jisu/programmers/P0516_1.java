package com.jisu.programmers;

public class P0516_1 {
	//부족한 금액 계산하기
	
	public static void main(String[] args) {
		
		int price = 3;
		int money = 20;
		int count = 4;

		int sum = 0;
		for(int i=1; i<=count; i++) {
			sum += price*i;
		}
		
		System.out.println(sum-money > 0 ? sum-money : 0);
		
	}

}
