import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[][] result = new String[n][n];
        String[] answer = new String[n];
        for(int i=0;i<n;i++){
            int num1 = arr1[i];
            int num2 = arr2[i];
            int j = n-1;
            while(j>-1){
                if(num1 % 2==1 || num2 % 2==1){
                    result[i][j] = "#";
                }else {
                    result[i][j] = " ";
                }
                num1 /= 2;
                num2 /= 2;
                j--;
                
            }
        }
        
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++) sb.append(result[i][j]);
            answer[i] = sb.toString();
        }
        return answer;
    }
}
