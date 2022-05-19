package com.jisu.programmers;

import java.util.Arrays;

public class P0519_2 {
	//예산
	
	public static int solution(int[] d, int budget) {
		
		//내 풀이 방법 : 부서의 지원금액을 더해서 합계와 비교해보는 방식
		/*int answer = 0; //지원 가능한 부서의 "최대" 수
		int result = 0; //부서의 지원금액 합계 => 예산(budget)과 비교하기 위함
		
		//1.전달받은 배열을 먼저 오름차순으로 정렬한다. 
		//오름차순 정렬 이유 : 지원 가능한 부서의 최대 경우의 수를 구하는 것이기 때문애
		//금액이 적은 부서들을 모을 수록 지원 가능한 부서의 수가 커지기 때문이다. 
		Arrays.sort(d);
		
		//2.배열의 길이만큼 반복을 통해 배열의 모든 요소들을 차례대로 result에 누적시킨다. 
		for(int i=0; i<d.length; i++) {
			
			result += d[i]; //배열의 i번째를 result에 누적 
			
			//근데 만약 부서의 지원금액 합계가 예산을 초과하면 반복을 종료해야 하므로 
			if(result > budget) {
				//부서의 수는 현재 반복의 횟차에 해당하는 i를 저장하고
				//만약 현재 i번째 지원금액을 담았을 때 예산이 초과해버리면 
				//answer에 i가 담기는데 인덱스가 0부터 시작하므로 i가 담겨도 된다. 
				//ex) 예산 9일때 1+2+3+4 에서 4를 담는 순간 예산 초과인데 
				//    현재 i는 3을 가리키고 있으므로 지원 가능 부서의 수 는 "3"이(1,2,3 3개) 맞다. 
				answer = i;  
				break; //반복 종료
			}
		}//for
		
		//위의 반복문을 모두 돌고 나왔는데(break를 만나지 못한 경우) 
		//모든 부서의 합계금액이 예산보다 적거나 같다면 => 모든 부서의 지원금액을 지원해줄 수 있다는 의미이다. 
		if(result <= budget) {
			answer = d.length; 
		}
		
		return answer;*/
		
		//다른사람 풀이 방법 : 예산에서 지원금액을 빼가는 방식
		int answer = 0; 
		Arrays.sort(d);
		
		for(int i=0; i<d.length; i++) {
			
			budget -= d[i]; //예산에서 하나씩(배열의 요소) 빼기 
			if(budget < 0) break;
			answer++; //지원가능한 부서의 수 증가(위 52행의 if문을 만나지 않음) 
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,4};
		int budget = 9; 
		System.out.println(solution(arr, budget));
		
	}

}
