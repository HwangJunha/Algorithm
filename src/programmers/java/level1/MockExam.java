//https://programmers.co.kr/learn/courses/30/lessons/42840
package programmers.java.level1;

import java.util.ArrayList;

public class MockExam {
	 public int[] solution(int[] answers) {
	        int[] answer = {};
	        //1,2,3번 수포자의 패턴
	        int[] pattern1 = {1,2,3,4,5};
	        int[] pattern2 = {2,1,2,3,2,4,2,5};
	        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
	        
	        //1,2,3번 수포자가 맞은 정답
	        int[] count = {0,0,0};
	        
	        //i%pattern1.length으로 인덱스 값을 설정
	        //값이 일치한다면 해당 패턴 값 증가
	        for(int i=0; i<answers.length; i++){
	            if(pattern1[i%pattern1.length]==answers[i]) count[0]++;
	            if(pattern2[i%pattern2.length]==answers[i]) count[1]++;
	            if(pattern3[i%pattern3.length]==answers[i]) count[2]++;
	        }
	        //최대값 찾기
	        int max = count[0]; 
	        for(int i=1; i<count.length; i++){
	            if(max < count[i]){
	                max=count[i];
	            }
	        }
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for(int i=0; i<count.length; i++){
	            //max값과 동일하다면 값을 넣음
	            if(max==count[i]){
	                list.add(i+1);
	            }
	        }
	        //answer 생성
	        answer = new int[list.size()];
	        for(int i=0; i<answer.length; i++){
	            answer[i] = list.get(i);
	        }
	        
	        return answer;
	    }
}
