package com.jisu.programmers;

public class P0517_2_1 {
	//3진법 뒤집기_다른 풀이 참조 
	
	public static int solution(int n) {
		
		String a = "";
		
		while(n>0) {
			a = (n%3) + a;
			n /= 3;
		}
		
		//생성된 문자열을 뒤집기 위해 StringBuilder 객체를 생성하여 reverse() 해준 뒤 다시 String 형으로 변환하는 과정
		a = new StringBuilder(a).reverse().toString();
		
		//위에서 변환된 문자열을 다시 10진법으로 변환
		return Integer.parseInt(a, 3);
		
	}
	
	
	public static void main(String[] args) {

		System.out.println(solution(125));
		
	}

}
