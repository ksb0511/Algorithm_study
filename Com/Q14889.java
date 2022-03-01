package Com;

import java.io.*;
import java.util.StringTokenizer;

public class Q14889 {
    public static int n, map[][];
    public static boolean[] checked ;
    //public static int MAX = Integer.MIN_VALUE;	// 최댓값 
	public static int MIN = Integer.MAX_VALUE;	// 최솟값 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        checked = new boolean[n];

        // 숫자 입력받기
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        dfs(0,0);

        

        System.out.println(MIN);
    }

	static void dfs(int idx, int count) {
		// 팀 조합 하나가 완성된 경우, 조합이 안된 나머지는 그들끼리 팀
		if(count == n / 2) {
			diff();
			return;
		}
 
		for(int i = idx; i < n; i++) {
			if(!checked[i]) {
				checked[i] = true;
				dfs(i + 1, count + 1);	// 재귀 호출
				checked[i] = false;	// 재귀가 끝나면 비방문으로 변경
			}
		}
	}
 
	// 두 팀의 능력치 차이를 계산하는 함수 
	static void diff() {
		int team_start = 0;
		int team_link = 0;
 
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				// i 번째 사람과 j 번째 사람이 true라면 스타트팀으로 점수 플러스 
				if (checked[i] == true && checked[j] == true) {
					team_start += map[i][j];
					team_start += map[j][i];
				}
				// i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스 
				else if (checked[i] == false && checked[j] == false) {
					team_link += map[i][j];
					team_link += map[j][i];
				}
			}
		}
		// 두 팀의 점수 차이 (절댓값)
		int val = Math.abs(team_start - team_link);
		
		/*
		  두 팀의 점수차가 0이라면 가장 낮은 최솟값이기 때문에
		  더이상의 탐색 필요없이 0을 출력하고 종료하면 된다.
		 */
		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		MIN = Math.min(val, MIN);
				
	}
 

}