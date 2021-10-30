//https://programmers.co.kr/learn/courses/30/lessons/42626?language=java
package programmers.java.level2;

import java.util.PriorityQueue;

public class MoreSpicy {
	public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue(); //우선순위 큐

        for (int i=0; i<scoville.length; i++) {
            heap.add(scoville[i]);
        }

        while (heap.peek() <= K) { //K이하일때까지
            if (heap.size() <= 1) { //모든 스코빌 지수가 1이하일경우 K이상으로 만들 수 없다
                return -1;
            }
            
            int first = heap.poll();
            int second = heap.poll();


            int result = first + (second * 2);

            heap.offer(result);
            answer ++;
        }
        return answer;
    }
}
