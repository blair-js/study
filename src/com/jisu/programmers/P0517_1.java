package com.jisu.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P0517_1 {
	//두 개 뽑아서 더하기 
	
	public static int[] solution(int[] numbers) {
	
		//나의 풀이 방법 : list 사용
		//결과를 담을 list
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		
		//두 수를 더할 변수
		int result = 0;
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) { //기준인 i뒤부터 더한다
				result = numbers[i] + numbers[j]; //i와j를 더한다
				if(!list.contains(result)) list.add(result); //list에 해당 결과값이 없으면 저장(중복 방지)
			}
		}//for
		
		int[] answer = new int[list.size()]; //list의 요소만큼 배열 크기 할당하여 반환할 배열 생성
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i); //list에 있는 요소를 뽑아서 배열에 저장
		}
		
		Arrays.sort(answer); //배열 오름차순 정렬
		return answer;*/
		
		//다른 풀이 방법 : TreeSet 사용(오름차순 정렬을 별도로 해주지 않아도 된다)
		Set<Integer> set = new TreeSet();
		
		//i는 배열 길이의 -1 까지만 해도된다. 어짜피 마지막 인덱스는 뒤에 더할 수가 없기 때문이다.
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i]+numbers[j]); 
			}
		}//for
		
		int[] answer = new int[set.size()];
		
		//결과 배열의 인덱스 변수
		int idx = 0;
		
		Iterator itor = set.iterator(); //반복자 생성
		
		while(itor.hasNext()) { //다음 요소가 있으면 
			answer[idx++] = (int)itor.next(); //배열에 추가(next()의 반환형이 Object이므로 형변환 해주기)
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {2,1,3,4,1};
		System.out.println(Arrays.toString(solution(numbers)));
		
	}

}
