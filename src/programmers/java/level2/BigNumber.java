//https://programmers.co.kr/learn/courses/30/lessons/42746?language=java
package programmers.java.level2;

import java.util.ArrayList;
import java.util.Collections;

public class BigNumber {
	public String solution(int[] numbers) {
        String answer = "";
        // int to String
        ArrayList<String> list = new ArrayList();
        for(int i=0; i<numbers.length; i++){
            list.add(Integer.toString(numbers[i]));
        }
        
        // 내림차순 정렬
        Collections.sort(list, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        if(list.get(0).substring(0,1).equals("0")){ //첫 번째값 문자열이 0일경우 0을 리턴
            return "0";
        }
        
        
        // answer에 정렬된 것을 담기
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }
        return answer;
        
    }

//dfs 사용시 메모리 초과
//private void dfs(int []numbers, int depth, String temp){
//        
//        if(depth==numbers.length){ //깊이가 가장 깊어질때
//            list.add(temp);
//            return;
//        }
//        
//        for(int i=0; i<numbers.length; i++){
//            if(!check[i]){
//                check[i]=true;
//                String value = Integer.toString(numbers[i]);
//                //System.out.println("add:"+temp+" "+value+"depth:"+depth);
//                temp += value; 
//                int size = value.length(); //길이 
//                dfs(numbers, depth+1, temp);
//                check[i]=false;
//                temp=temp.substring(0,temp.length()-size); //뒤에 글자 짜르기
//            }
//        }
//    }
}
