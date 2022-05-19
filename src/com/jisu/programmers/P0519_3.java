package com.jisu.programmers;

import java.util.ArrayList;

public class P0519_3 {
	//폰켓몬
	
	public static int solution(int[] nums) {
		int answer = 0; 
		
		int sum = nums.length/2; //내가 가질 수 있는 폰켓몬의 마리 수
		
		//폰켓몬의 종류를 담기위한 list 
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//배열의 요소를 확인해서 
		for(int i=0; i<nums.length; i++) {
			//중복되지 않도록 폰켓몬의 종류 하나씩만 추출하여 list에 저장 
			if(!list.contains(nums[i])) { //포함여부 확인
				list.add(nums[i]);
			}
		}//for
		
		//위의 반복을 통해 추출된 최종 폰켓몬의 종류 
		int kinds = list.size(); 
		
		//폰켓몬의 종류와 내가 가져갈 수 있는 폰켓몬의 마리수를 비교하여 더 작은 값을 뽑으면 된다. 
		answer = Math.min(sum, kinds);
		
		return answer; 
	}
	
	public static void main(String[] args) {

		int[] arr = {3,3,3,2,2,4};
		System.out.println(solution(arr));
		
	}

}
