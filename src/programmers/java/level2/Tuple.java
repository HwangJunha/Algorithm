//https://programmers.co.kr/learn/courses/30/lessons/64065
package programmers.java.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Tuple {
	public int[] solution(String s) {
        int[] answer = {};
        s = s.replace("},{", " ");
		String[] arr = s.substring(2, s.length()-2).split(" "); //앞에 "{{" 글자 제외 "}}" 뒤에 글자 제외
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        StringTokenizer st;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> temp;
        for(String value: arr){
            st=new StringTokenizer(value,",");
            temp = new ArrayList<>();
            while(st.hasMoreTokens()){
                temp.add(Integer.parseInt(st.nextToken()));
            }
            list.add(temp);
        }
        Collections.sort(list, (a,b)-> Integer.compare(a.size(), b.size())); //크기 순으로 정렬
        
        temp=new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(i).size(); j++){
                if(!map.containsKey(list.get(i).get(j))){ // 겹치지 않았을 경우
                    map.put(list.get(i).get(j),0); //맵에 값 추가
                    temp.add(list.get(i).get(j)); // list에 값 추가
                }    
            }
            
        }
        
        answer = new int[temp.size()];
        
        for(int i=0; i<temp.size(); i++){
            answer[i] = temp.get(i);
        }
        
        
        return answer;
    }
}
