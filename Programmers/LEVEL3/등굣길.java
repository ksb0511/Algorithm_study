import java.util.*;

// DFS 시간 초과
class Solution {
    int limit_x, limit_y, count=0;
    int[] dx = {0,1};
    int[] dy = {1,0};
    boolean[][] puddles_arr;
    
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        limit_x = m;
        limit_y = n;
        puddles_arr = new boolean[m+1][n+1];
        
        for(int i=0;i<puddles.length;i++){
            puddles_arr[puddles[i][0]][puddles[i][1]] = true;
        }
        
        dp(1,1);
        
        return count;
    }
    
    private void dp(int x, int y){
        if(limit_x==x && limit_y==y){
            count++;
        }
        else if(x>limit_x||y>limit_y){
            return;
        }
        
        for(int i=0;i<2;i++){
            if(x+dx[i]<=limit_x&&y+dy[i]<=limit_y && puddles_arr[x+dx[i]][y+dy[i]]==false){
                dp(x+dx[i], y+dy[i]);
            }
        }
    }
}

//DP 통과
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int mod = 1000000007;
        
        int[][] board = new int[n + 1][m + 1];
        for(int i = 0; i < puddles.length; i++) {
            board[puddles[i][1]][puddles[i][0]] = -1; 
        }
        
        board[1][1] = 1;
        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                if(board[i][j] == -1) continue;
                if(board[i - 1][j] > 0) board[i][j] += board[i - 1][j] % mod;
                if(board[i][j - 1] > 0) board[i][j] += board[i][j - 1] % mod;
            }
        }
        return board[n][m] % mod;
    }
}
