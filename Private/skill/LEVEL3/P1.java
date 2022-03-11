package Private.skill.LEVEL3;

//35.7
public class P1 {
    public int solution(int[][] triangle) {
        int MAX = 0;
        int answer = 0;

        int dp[][] = new int[triangle.length][triangle.length];

        dp[0][0] = triangle[0][0];

        for(int i=1;i<triangle.length;i++){
            dp[i][0] += dp[i-1][0] + triangle[i][0];
            dp[i][triangle.length-1] += dp[i-1][i-1] + triangle[i][i];
        }

        answer = dp[triangle.length-1][0];


        for(int i=2;i<triangle.length;i++){
            for(int j=1;j<i;j++){
                dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j])+triangle[i][j];

                if(i==triangle.length-1)
                    answer = Math.max(dp[triangle.length-1][j], answer);
            }
        }

        answer = Math.max(dp[triangle.length-1][triangle.length-1], answer); 



        return answer;
    } 
}
