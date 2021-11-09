//https://programmers.co.kr/learn/courses/30/lessons/42578
package programmers.java.level2;

import java.util.HashMap;

public class Camouflage {
	public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }
        for(String key: map.keySet()){
            System.out.println(key+":"+map.get(key));
            answer*=map.get(key)+1;
        }
        
        
        return answer-1;
    }
}
