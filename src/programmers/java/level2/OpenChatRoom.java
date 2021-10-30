//https://programmers.co.kr/learn/courses/30/lessons/42888
//오픈채팅방
package programmers.java.level2;

import java.util.*;

public class OpenChatRoom {
	public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        for(int i=0; i<record.length; i++){
            StringTokenizer st = new StringTokenizer(record[i]," ");
            String commend = st.nextToken();
            String id = st.nextToken();
             
            
            //enter, leave, change 
            if(commend.equals("Enter")){
                String nick = st.nextToken();
                list.add(id+" "+"Enter");
                map.put(id,nick);
            }else if(commend.equals("Leave")){
                list.add(id+" "+"Leave");
            }else{
                String nick = st.nextToken();
                map.put(id,nick);
            }
        }
        
        //값 최종 변환
        answer = new String[list.size()];
        int count=0;
        for(String e: list){
            StringTokenizer st = new StringTokenizer(e," ");
            String temp="";
            String id = st.nextToken();
            String commend = st.nextToken();
            temp+=map.get(id);
            
            if(commend.equals("Enter")){
                temp+="님이 들어왔습니다.";
            }else{
                temp+="님이 나갔습니다.";
            }
            
            answer[count]=temp;
            count++;
        }
        
            
        return answer;
    }
}
