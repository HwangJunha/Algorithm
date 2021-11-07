package cospro.first.level1;


class Solution2 {
	int[][] pane; //판
	//소용돌이로 돌기 위한 값
	// k=0 오른쪽 k=1 아래 k=2 왼쪽 k=3 위쪽
	int dx[] = {1, 0, -1, 0};
	int dy[] = {0, 1, 0, -1}; 
	boolean inRange(int i, int j, int n){ // 판에서 벗어 날 경우 false 판 안일경우 true
		return 0 <= i && i < n && 0 <= j && j < n;
	}
	
	public int solution(int n) {
		pane = new int[n][n];
        int ci = 0;
        int cj = 0;
        int num = 1;
        while(inRange(ci, cj, n) && pane[ci][cj] == 0){ //판 안일경우 이면서 값이 아직 0인 것들
            for(int k = 0; k < 4; k++){ // x, y값 차례대로
                if(!inRange(ci, cj, n) || pane[ci][cj] != 0) break; // 판에서 벗어 나거나 값이 0일경우 break
                while(true){
                    pane[ci][cj] = num++;
                    int ni = ci + dy[k];
                    int nj = cj + dx[k];
                    
                    if(!inRange(ni, nj, n) || pane[ni][nj] != 0){
                        ci += dy[(k + 1) % 4]; 
                        cj += dx[(k + 1) % 4]; 
                        break;
                    }
                    ci = ni;
                    cj = nj;
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) ans += pane[i][i];
        for(int i=0; i<pane.length; i++) {
        	for(int j=0; j<pane[i].length; j++) {
        		System.out.print(pane[i][j]+" ");
        	}
        	System.out.println();
        }
        
        
        return ans;
    }
    

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
}