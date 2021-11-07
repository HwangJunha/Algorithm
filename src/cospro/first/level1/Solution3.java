package cospro.first.level1;

public class Solution3 {
	public int solution(String pos) {
        // Write code here.
		// 0	 1		2	   3	  4		5	   6	   7	
		// (1,2) (1,-2) (-1,2) (-1,2) (2,1) (2,-1) (-2,-1) (-2,1)
        int[] dx = {1,1,-1,-1,2,2,-2,-2};
        int[] dy = {2,-2,-2,2,1,-1,-1,1};
        
		
		int answer = 0;
        
        char[] location = pos.toCharArray();
        int y = location[0]-'A'; 
        int x = location[1]-'0'-1; 
        System.out.println(x+" "+y);
        
        for(int i=0; i<8; i++) {
        		int nx = x+dx[i];
        		int ny = y+dy[i];
        		if(nx>=0 && nx<8 && ny >=0 && ny<8) {
        			answer++;
        		}
        }
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.printf("첫 번째 예제의 답은 %d 입니다.\n", 3);
        System.out.printf("solution 함수의 반환 값은 %d 입니다.\n", ret);
    }
}
