package programmers.java.level3;

public class Network {
boolean check[];
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        check= new boolean[n]; //컴퓨터의 개수 만큼 초기화
        
        for(int i=0; i<computers.length; i++){
            if(!check[i]){
                dfs(computers,i);
                answer++;
            }
        }
        
        return answer;
    }
    private void dfs(int[][] computers, int depth){
        check[depth]=true;
        for(int i=0; i<computers[depth].length; i++){
            if(check[i]==false && computers[depth][i]==1){
                dfs(computers, i);
            }
        }
    }
}
