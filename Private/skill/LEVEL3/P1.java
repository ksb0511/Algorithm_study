package Private.skill.LEVEL3;

import java.util.Arrays;

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

    //50점(만점)
    public int solution2(int[][] triangle) {
        int answer = 0;

        int result[][] = new int[triangle.length][triangle.length];

        result[0][0] = triangle[0][0];

        for(int i=1;i<triangle.length;i++){
            result[i][0] = result[i-1][0] + triangle[i][0];
            result[i][i] = result[i-1][i-1] + triangle[i][i];
        }

        for(int i=2;i<triangle.length;i++){
            for(int j=1;j<triangle[i].length-1;j++)
                result[i][j] = Math.max(result[i-1][j-1], result[i-1][j])+triangle[i][j];
        }

        Arrays.sort(result[triangle.length-1]);
        return result[triangle.length-1][triangle.length-1];
    }
}
