//https://programmers.co.kr/learn/courses/30/lessons/42586
package programmers.java.level2;
import java.util.ArrayList;
public class FunctionDevelopment {
	 public int[] solution(int[] progresses, int[] speeds) {
	        int[] answer = {};
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        
	        int count=0;
	        for(int i=0; i<progresses.length; i+=count){
	            //하루의 반복
	            count=0;
	            while(true){
	                if(progresses[i]>=100){
	                    count++;
	                    for(int z=i+1; z<progresses.length; z++){
	                        if(progresses[z]<100){
	                            break;
	                        }
	                        count++;
	                    }
	                    break;
	                }
	                for(int j=0; j<progresses.length; j++){
	                    progresses[j]+=speeds[j];   
	                }
	            }
	            list.add(count);
	        }
	        //값 대입
	        answer = new int[list.size()];
	        for(int i=0; i<list.size(); i++){
	            answer[i]= list.get(i);
	        }
	        
	        return answer;
	    }
}
