import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        long[] nums = new long[(Long.toString(n)).length()];
        for(int i=nums.length-1;i>=0;i--){
            nums[i]=n%10;
            n = n/10;
        }
        Arrays.sort(nums);
        
        for(int i=nums.length-1;i>=0;i--){
            answer += Long.toString(nums[i]);
        }
        return Long.parseLong(answer);
    }
}

public class ReverseInt {
    String res = "";
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }

    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
