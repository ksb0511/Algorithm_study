package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2579 {
    static int n, score=0;
    static int [] arr;

    static int MAX = 0;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //System.out.println(upstair(0, 1));
        //upstair(1, 1)
        upstair(0,-1,0);

        System.out.println(score);
 
	}
 
	public static void upstair(int x, int y, int score){

        if(x==n){
            MAX = Math.max(MAX, score);
        }
        else if(x>n)
            return;

        if(y==1)
            upstair(x+2,2, score+arr[x+2]);
        else {
        upstair(x+1,1, score+arr[x+1]);
        upstair(x+2,2, score+arr[x+2]);
        }
        
    }
}
