package cospro.first.level2;

import java.util.*;

public class Solution2 {
    public int solution(int price, String grade) {
        // Write code here.
        int answer = 0;
        int value = 0;
        if("S".equals(grade)) {
        	value=(int) (price*0.05);
        }else if("G".equals(grade)) {
        	value=(int) (price*0.1);
        }else if("V".equals(grade)) {
        	value=(int) (price*0.15);
        }
        answer=price-value;
        
        return answer;
    }    

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}