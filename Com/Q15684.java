package Com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 다시

public class Q15684 {
    static int arr[][];
	public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        arr= new int[m+1][m+1];

        if(m!=0){
            for(int i=0;i<m;i++){
                st = new StringTokenizer(br.readLine());
                
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
    
                arr[x][y]=y+1;
                arr[x][y+1]=y;
            }
        }

        for(int j=1;j<n+1;j++){
            int i=1;
            while(i<=5){
                // System.out.println(arr[i][j]);
                if(arr[i][j]==0)
                    i++;
                else {
                    j = arr[i][j];
                    i++;
                }
            }
            System.out.println(j==i);
        }
        
        


       
        
    }
}
