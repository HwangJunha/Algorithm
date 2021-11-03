package cospro.first.level1;

public class Solution1 {
    public long solution(long num) {
        // Write code here.
        long answer = 0;
        char[] toChar = Long.toString(num+1).toCharArray();
        for(int i=0; i<toChar.length; i++) {
        	if(toChar[i]=='0') {
        		toChar[i]='1';
        	}
        }
        answer= Long.parseLong(String.valueOf(toChar));
        
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}