package com.jisu.programmers;

public class P0519_1 {
	//약수의 개수와 덧셈
	
	public static int solution(int left, int right) {
		
		//나의 풀이 방법 
		/*int even = 0; //약수의 개수가 짝수인 i의 합계를 담을 변수
		int odd = 0; //약수의 개수가 홀수인 i의 합계를 담을 변수
		
		for(int i=left; i<=right; i++) { //left부터 right까지 반복
			int count = 0; //약수의 개수를 담을 변수 => 반복될 때마다 초기화 된다
			for(int j=1; j<=i; j++) { //약수를 확인하는 반복문(i를 1부터 i까지 나눠본다.)
				if(i%j == 0) { //나눠지면 
					count++; //약수이므로 갯수 증가 
				}
			}//for
			
			//위에서 담긴 count(약수의 개수)가 짝수이면 
			if(count %2 == 0) {
				even += i; //짝수의 합계를 담을 변수에 i 누적
			}else { //count가 홀수이면
				odd += i; //홀수의 합계를 답을 변수에 i 누적
			}
		}
		
		//짝수의 합에서 홀수의 합을 뺀다
		return even - odd;*/
		
		
		//다른 사람의 풀이 방법
		//수가 제곱수이면 약수의 개수는 홀수가 될 수 밖에 없고, 
		//나머지는 짝수일 수 밖에 없다. 
		//ex) 4, 9, 16, 25 등.. 제곱수는 약수의 개수가 무조건 "홀수" 
		
		int answer = 0; //최종합계
		
		for(int i=left; i<right; i++) {
			
			//i를 i의 제곱근으로 나누었을 때 0으로 떨어지면 i는 제곱수이다. => 약수 개수 홀수
			if(i % Math.sqrt(i) == 0) { 
				answer -= i; //최종 합계에서 i를 뺀다.
			}else { //제곱수가 아닌 경우 => 약수 개수 짝수
				answer += i;
			}
		}//for
		
		return answer;
		
	}
	
	public static void main(String[] args) {

		System.out.println(solution(13, 17));
		
	}

}
