package programmers.lever1.skill;

public class Soultion1 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		answer = new int[arr1.length][arr1[0].length];
		for(int i=0; i<answer.length; i++){
			for(int j=0; j<answer[i].length; j++){
				answer[i][j]=arr1[i][j]+arr2[i][j]; //answer값에 각각의 값 저장
			}
		} 
		return answer;
	}
}
