package com.jisu.programmers;

public class P0516_2 {
	//나머지가 1이 되는 수 찾기 
	
	public static void main(String[] args) {

		int n = 12; 
		int x = n-1; 
		
		for(int i=10; i>0; i--) {
			if(n%i == 1) x = i;
		}
		
		System.out.println(x);
	}

}
