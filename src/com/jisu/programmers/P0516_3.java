package com.jisu.programmers;

public class P0516_3 {
	//최소직사각형 
	
	public static int solution(int[][] sizes) {
		
		/* mWidth = 0; //최대 가로 길이
		int mHeight = 0; //최대 세로 길이 
		
		for(int i=0; i<sizes.length; i++) { //배열의 개수만큼 반복
			
			int tmp; //가로와 세로의 길이를 변경해줄 변수(변경하는 이유 : 길이가 긴 것을 가로로 할 예정)
				
			//배열에서 현재 i번째 요소(이것도 배열)에서 
			//가로를 의미하는 0번째 요소와 세로를 의미하는 1번째 요소를 비교하여
			//세로가 더 크다면 서로 값을 체인지 한다.
			if(sizes[i][0] < sizes[i][1]) {
				tmp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = tmp;
			}
			
			//현재 요소의 가로길이가 최대 가로길이보다 크다면 변경
			if(sizes[i][0] > mWidth) mWidth = sizes[i][0];

			//현재 요소의 세로길이가 최대 세로길이보다 크다면 변경
			if(sizes[i][1] > mHeight) mHeight = sizes[i][1];
					
		}//for
		
		return mWidth * mHeight;*/
		
		//다른 풀이 : 향상된 for문 이용
		int max = 0; 
		int min = 0;
		
		for(int[] size : sizes) {
			int paramMax = Math.max(size[0], size[1]); //요소 가로, 세로 중 큰 값 추출
			int paramMin = Math.min(size[0], size[1]); //요소 가로, 세로 중 작은 값 추출
			
			if(paramMax > max) max = paramMax;
			if(paramMin > min) min = paramMin;
		}
		
		return max * min;
		
	}
		
	public static void main(String[] args) {
		
		int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(solution(arr));
		
	}

}
