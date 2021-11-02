//https://programmers.co.kr/learn/courses/30/lessons/1844
package programmers.java.level2;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortPath {
	
boolean[][] check;
    
    int[] dx = {0,0,-1,1};
    int[] dy = {-1,1,0,0};
    public int solution(int[][] maps) {
        int answer = 0;
        check = new boolean[maps.length][maps[0].length];
        answer = bfs(0,0,maps);
        
        
        return answer;
    }
    private int bfs(int x, int y, int[][] maps){
        Queue<Path> queue = new LinkedList<>();
        queue.offer(new Path(x,y,1));
        check[x][y]=true;
        //반복
        while(!queue.isEmpty()){
            Path path = queue.poll();
            if(path.x == maps.length-1 && path.y == maps[0].length-1) return path.count; //끝에 도달 했을 경우
            for(int i = 0; i<4;i++){ // 상, 하, 좌, 우
                int nx = path.x + dx[i];
                int ny = path.y + dy[i];

                if(nx>=0 && ny>=0 && nx<maps.length && ny<maps[0].length){
                    if(maps[nx][ny]==1 &&!check[nx][ny]){
                        check[nx][ny] = true;
                        queue.offer(new Path(nx,ny, path.count+1));
                    }
                }
            }
        }
        return -1; //모든 값이 도달 하지 않았을때
        
    }
	
	
	
	
	//최단 경로의 문제시 BFS을 사용해야 한다
//	private void dfs(int[][] maps, int depth, int x, int y){
//        if(x==maps.length-1 && y==maps[0].length-1){ //끝에 도달 했을 경우
//            if(answer > depth)
//                answer=depth;
//            return;            
//        }else{
//            for(int i=0; i<4; i++){
//                int nx = x+dx[i];
//                int ny = y+dy[i];
//                
//                if(nx < 0 || ny < 0 || nx>= maps.length || ny>=maps[0].length )
//                    continue;
//                if(!check[nx][ny] && maps[nx][ny]==1){
//                    check[nx][ny] = true;
//                    dfs(maps, depth+1, nx, ny);
//                    check[nx][ny] = false;
//                }    
//            
//            }
//        }
//    
//    }
}
class Path{
    int x;
    int y;
    int count;
    
    public Path(int x, int y, int count){
        this.x=x;
        this.y=y;
        this.count=count;
    }
    
    
}

