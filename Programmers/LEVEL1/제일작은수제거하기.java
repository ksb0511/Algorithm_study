import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        if(arr.length==1) return answer;
        int[] copy_arr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy_arr[i] = arr[i];
        }
        Arrays.sort(arr);
        
        ArrayList al = new ArrayList();
        for(int i=0;i<copy_arr.length;i++){
            if(copy_arr[i]!=arr[0])
                al.add(copy_arr[i]);
        }
        return  al.stream().mapToInt(i -> (int)i).toArray();
    }
}
