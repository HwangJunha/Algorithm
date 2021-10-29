package programmers.java.level3;

import java.util.ArrayList;
import java.util.Collections;

public class TravelRoute {
	boolean[] check;
    ArrayList<String> list = new ArrayList<>();
        
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        check= new boolean[tickets.length];
        
        dfs(tickets, 0, "ICN","ICN");
        
        Collections.sort(list);
        answer=new String[list.get(0).length()/3];
        for(int i=0; i<list.get(0).length()/3; i++){
            answer[i] = list.get(0).substring(i*3,(i*3)+3);
        }
        
        return answer;
    }
    private void dfs(String[][] tickets, int depth, String temp, String present){
        if(depth==tickets.length){
            list.add(temp);
            return;
        }
        for(int i=0; i<tickets.length; i++){
            if(!check[i] && tickets[i][0].equals(present)){
                check[i]=true;
                dfs(tickets, depth+1,temp+tickets[i][1],tickets[i][1]);
                check[i]=false;
            }
        }
    }
}
