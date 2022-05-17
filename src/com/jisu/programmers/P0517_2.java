package com.jisu.programmers;

public class P0517_2 {
	//3진법 뒤집기_내 풀이
	
	public static int solution(int n) {
		
		//결과 변수 
		int answer = 0;
		
		//n이 3보다 작은 경우 n 그대로 return
		if(n < 3) {
			answer = n;
		}else {
			//1.들어온 10진수 n을 3진수로 만들어준다. 
			String str = ""; //3진수로 변환된 결과를 받을 변수
			while(n>0) { //n을 몫으로 칭한다. 몫이 0보다 클 때까지만 반복
				str += n%3; //n을 3으로 나눈 "나머지"를 문자열에 누적시키고
				n/=3; //n은 3으로 나눈 "몫"으로 계속 업데이트 해준다
			}
			
			//2.결과로 도출된 3진수(str)를 다시 10진수로 변환하기 
			//ex.21 => (2*3의1승)+(1*3의0승) = 6+1 = 7
			//ex.22111 => (2*3의4승)+(2*3의3승)+(1*3의2승)+(1*3의1승)+(1*3의0승) = 162+54+9+3+1 = 229
			
			int idx = 0;
			//문자열의 길이만큼 반복하고
			//앞자리부터 뒤자리를 탐색하는 방법으로 반복한다.
			for(int i=str.length()-1; i>=0; i--) {
				int num = Character.getNumericValue(str.charAt(idx)); //문자열의 idx번째를 추출하여 int형으로 변환
				answer += num * (int)Math.pow(3, i); //결과값에 위에서 추출된 숫자에 3의i승을 해준다. 
				idx++; //추출한 문자열 위치 인덱스 증가
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

		System.out.println(solution(45)); 
		
	}

}
