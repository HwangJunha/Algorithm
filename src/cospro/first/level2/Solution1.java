package cospro.first.level2;

import java.util.*;

public class Solution1 {
	public int[] solution(String[] shirtSize) {
        // Write code here.
        int[] answer = new int[6];
        String[] sizeKind = {"XS", "S", "M", "L","XL","XXL"};
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<sizeKind.length; i++) {
        	map.put(sizeKind[i], 0);
        }
        
        for(int i=0; i<shirtSize.length; i++) {
        	map.put(shirtSize[i],map.get(shirtSize[i])+1); //값 증가
        }
        
        for(int i=0; i<answer.length; i++) {
        	answer[i]=map.get(sizeKind[i]);
        }
        
        
        return answer;
    }
    
    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
        int[] ret = sol.solution(shirtSize);
 
        // Press Run button to receive output.  
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
}
