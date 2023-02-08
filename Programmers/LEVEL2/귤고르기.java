import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int[] arr = new int[tangerine.length];
        Arrays.sort(tangerine);
        int j=0;
        arr[0] = 1;
        for(int i=1;i<tangerine.length;i++){
            if(tangerine[i-1]==tangerine[i]){
                arr[j] += 1;
            }else {
                arr[++j] = 1;
            }
        }
        Arrays.sort(arr);
        int biggest = arr.length-1;
        while(k>0){
            k-=arr[biggest];
            biggest--;
        }
        return arr.length-biggest-1;
    }
}
