package Com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14500 {
    
    static int n, m, map[][], result=0;

    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer stz = new StringTokenizer(br.readLine());

        n=Integer.parseInt(stz.nextToken());
        m=Integer.parseInt(stz.nextToken());
        
        map = new int[n][m];
        
        for(int i=0;i<n;i++){
            StringTokenizer stz2 = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j]=Integer.parseInt(stz2.nextToken());
            }
        }

        boolean[][] visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visit[i][j] = true;
                dfs(i, j, 1, map[i][j], visit);
                visit[i][j] = false;
                check(i, j);
            }
        }
        System.out.println(result);
    }
    
    static void dfs(int y, int x, int cnt, int sum, boolean[][] visit) {

        if (cnt >= 4) {
            result = Math.max(result, sum);
            return;
        }

        for (int k = 0; k < 4; k++) {
            int ny = y + dy[k];
            int nx = x + dx[k];

            if (ny < 0 || nx < 0 || ny >= n || nx >= m || visit[ny][nx]) {
                continue;
            }

            visit[ny][nx] = true;
            dfs(ny, nx, cnt + 1, sum + map[ny][nx], visit);
            visit[ny][nx] = false;
        }
    }

    static void check(int y, int x) {
        if (y < n - 2 && x < m - 1)
            result = Math.max(result, map[y][x] + map[y + 1][x] + map[y + 2][x] + map[y + 1][x + 1]);

        if (y < n - 2 && x > 0)
            result = Math.max(result, map[y][x] + map[y + 1][x] + map[y + 2][x] + map[y + 1][x - 1]);

        if (y < n - 1 && x < m - 2)
            result = Math.max(result, map[y][x] + map[y][x + 1] + map[y][x + 2] + map[y + 1][x + 1]);

        if (y > 0 && x < m - 2)
            result = Math.max(result, map[y][x] + map[y][x + 1] + map[y][x + 2] + map[y - 1][x + 1]);
    }
    
    
    
    
}
