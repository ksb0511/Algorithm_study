package Private.Another;

public class coin_dp {
    public int solution(int money, int[] costs) {

        int dp[] = new int[money+1];

        dp[0] = 0;
        
        for(int i=1;i<5;i++)
            dp[i] = dp[i-1]+costs[0];

        for(int i=5;i<10;i++)
            dp[i] = Math.min(dp[i-1]+costs[0],dp[i-5]+costs[1]);            

        for(int i=10;i<50;i++){
            dp[i] = Math.min(Math.min(dp[i-1]+costs[0],dp[i-5]+costs[1]), dp[i-10]+costs[2]);
        }

        for(int i=50;i<100;i++){
            dp[i] = Math.min(Math.min(dp[i-1]+costs[0],dp[i-5]+costs[1]), Math.min(dp[i-10]+costs[2],dp[i-50]+costs[3]));
        }

        for(int i=100;i<500;i++){
            dp[i] = Math.min(Math.min(dp[i-1]+costs[0],dp[i-5]+costs[1]), Math.min(dp[i-10]+costs[2],dp[i-50]+costs[3]));
            dp[i] = Math.min(dp[i],dp[i-100]+costs[4]);
        }

        for(int i=500;i<=money;i++){
            dp[i] = Math.min(Math.min(dp[i-1]+costs[0],dp[i-5]+costs[1]), Math.min(dp[i-10]+costs[2],dp[i-50]+costs[3]));
            dp[i] = Math.min(dp[i],Math.min(dp[i-100]+costs[4],dp[i-500]+costs[5]));
        }

        
        return dp[money];
    }
}