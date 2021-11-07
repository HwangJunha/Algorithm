//https://programmers.co.kr/learn/courses/30/lessons/42587
package programmers.java.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int value: priorities){
            queue.offer(value);
        }
        while(!queue.isEmpty()){ //큐가 비어질때 까지
            int value= queue.poll();
            
            for(int number : queue){ // 우선순위 검사
                if(value<number){ //뒤로 가기
                    queue.offer(value);
                    value=-1; //출력 실패
                    if(location==0){ //해당값이 자신의 출력물이었을 경우
                        location = queue.size()-1;
                    }else{
                        location--;
                    } 
                    break;
                }    
            }
            if(location==0 && value!=-1){
                return answer;
            }
            if(value!=-1){ //출력 성공
                answer++;
                location--;
            }
            
        }
        return answer;
    }
}
