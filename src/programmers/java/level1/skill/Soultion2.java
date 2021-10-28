package programmers.java.level1.skill;

import java.util.Arrays;

public class Soultion2 {
	 public String[] solution(String[] strings, int n) {
		 String[] answer = {};
		 answer = new String[strings.length]; //배열의 길이 만큼 증가

		 for (int i = 0; i < strings.length; i++) {
			 String point = strings[i].substring(n, n + 1); //포인트를 기준으로 정렬 
			 strings[i] = point + strings[i]; //포인트 추가
		 }

		 Arrays.sort(strings); //정렬

		 for (int i = 0; i < strings.length; i++) {
			 answer[i] = strings[i].substring(1); //포인트를 제거하고 answer값 대입
		 }



		 return answer;
	 }
}
