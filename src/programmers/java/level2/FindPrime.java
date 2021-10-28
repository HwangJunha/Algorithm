package programmers.java.level2;

import java.util.ArrayList;

public class FindPrime {
	int answer = 0;
    ArrayList<Integer> arr = new ArrayList<>();
    boolean[] check = new boolean[10];
    
    public int solution(String numbers) { 
        String temp = "";
        for(int i=0; i<numbers.length(); i++){
            dfs(numbers, temp, i+1); //깊이는 1부터 시작이기 때문에 i+1
        }
        for(int i=0; i<arr.size(); i++){
            if(isPrime(arr.get(i)))
                answer++;   
        }
        
        
        return answer;
    }
    private void dfs(String numbers, String temp, int depth){
        if(temp.length()==depth){
            int value = Integer.parseInt(temp);
            if(!arr.contains(value))
                arr.add(value);
            return;
        }else{
            for(int i=0; i<numbers.length(); i++){
                if(!check[i]){
                    check[i]=true;
                    temp += numbers.charAt(i);
                    dfs(numbers, temp, depth);
                    check[i]=false;
                    temp = temp.substring(0,temp.length()-1); //지나온값 제거 ex "17" -> "1", "1" -> ""
                }
            }
        }
    }
    
    //소수 판별 메소드
    private boolean isPrime(int n){
        if(n==0) return false;
        if(n==1) return false;
        
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
