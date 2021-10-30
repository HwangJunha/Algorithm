//https://programmers.co.kr/learn/courses/30/lessons/42577

package programmers.java.level2;

import java.util.HashMap;

public class PhoneBook {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String,Integer> map = new HashMap<>();
        
        //Hash값에 데이터 넣기 중요한건 Key
        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i],i);
        }
        //값 찾기 substring으로 값을 쪼개면서 찾기
        for(int i=0; i<phone_book.length; i++){
            for(int j=1; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        
        
        
        return answer;
    }
}
