package Private.Another;

import java.util.Arrays;
import java.util.Collections;

public class clock {
    public int[][] solution(int n, boolean clockwise) {

        int arr[][] = new int[n][n];

        if(clockwise){
            int j=0;
            for(int i=1;i<n-1;i++){
                    arr[1][i-1] = n-2+i;
                    arr[i-1][n-2] = n-2+i; 
                    arr[n-2][Math.abs(i-n)] = n-2+i;
                    arr[Math.abs(i-n)][1] = n-2+i;
                }

            while(arr[n/2][n/2]==0){

                if(j==1) j=2;

                for(int i=j;i<((j<1)?n-1:n-2);i++){
                    arr[j][i] = i+j+(j<1?1:3);
                    arr[i][n-1-j] = i+j+(j<1?1:3); 
                    arr[n-1-j][Math.abs(i-n+1)] = i+j+(j<1?1:3);
                    arr[Math.abs(i-n+1)][j] = i+j+(j<1?1:3);
                }
                j++;

            } 
            
        }

        if(!clockwise){
            int j=2;
            
            for(int i=0;i<n-1;i++){
                    arr[0][Math.abs(n-i-1)] = i+1;
                    arr[Math.abs(n-i-1)][n-1] = i+1;
                    arr[n-1][i]=i+1;
                    arr[i][0]= i+1;
            }


            for(int i=1;i<n-1;i++){
                    arr[1][Math.abs(n-i)] = Math.abs(n-2+i);
                    arr[Math.abs(n-i)][n-2] = Math.abs(n-2+i);
                    arr[n-2][i-1] = Math.abs(n-2+i);
                    arr[i-1][1] =Math.abs(n-2+i);
            }

            while(arr[n/2][n/2]==0){

                for(int i=j;i<n-3;i++){
                    arr[j][Math.abs(n-i-1)] = arr[j][Math.abs(n-i-1)]!=0?arr[j][Math.abs(n-i-1)]:n+i-1;//Math.abs(n-2+i);
                    arr[Math.abs(n-i-1)][i+1] = arr[Math.abs(n-i-1)][i+1]!=0?arr[Math.abs(n-i-1)][i+1]:n+i-1;
                    arr[n-1][i]=arr[n-1][i]!=0?arr[n-1][i]:n+i-1;
                    arr[i][j]= arr[i][j]!=0?arr[i][j]:n+i-1;
                }

                int count = Collections.frequency(Arrays.asList(arr), 0);
                if(count<5)
                    break;

                j++;
            }

            if(n%2==0){
                arr[n/2-1][n/2-1] = arr[n/2][n/2-1] = arr[n/2-1][n/2] = arr[n/2][n/2] = n+j+1;

            }else if(n%2!=0){
                arr[n/2][n/2]= n+j+1;
            }
            
        }

        return arr;
    }
}
