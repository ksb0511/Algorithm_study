package DFS_BFS;

public class target_num {
    public static int answer=0;
    public static int[] table = {1, 0};
    public int solution(int[] numbers, int target) {
        dfs(0,0,numbers,target);
        return answer;
    }

    public static void dfs(int depth,int sum,int[] numbers,int target){
        if(depth==numbers.length){

            if(sum==target){
                answer++;
            }
            return;
        }

        for(int i=0;i<2;i++){
            int num = table[i];
            if(num==1){
                sum+=numbers[depth];
            }else {
                sum-=numbers[depth];
            }
            
            System.out.println("1 ) "+sum);

            dfs(depth+1,sum,numbers,target);

            if(num==1){
                sum-=numbers[depth];
            }else {
                sum+=numbers[depth];
            }
            System.out.println("2 ) "+sum);

        }
    }
}
