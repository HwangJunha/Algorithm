package programmers.java.level2;

public class TargetNumber {
	int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0);
        
        return answer;
    }
    private void dfs(int[] numbers,int target, int sum, int depth){
        if(depth==numbers.length){
            if(target==sum) answer++;
            return;
        }else{
            sum+=numbers[depth]; //+ 기호 사용
            dfs(numbers,target,sum,depth+1); //깊이가 깊어진다
            sum-=numbers[depth]; //되돌아 왔다
            sum+=(-1*numbers[depth]); //- 기호 사용
            dfs(numbers,target,sum,depth+1); //깊이가 깊어진다
        }
    }
}
