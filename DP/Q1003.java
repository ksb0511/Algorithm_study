package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {
    static int n, zero_count=0, one_count=0;
    static StringBuilder sb= new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            fib(Integer.parseInt(br.readLine()));
            sb.append(zero_count).append(" ").append(one_count).append("\n");
            zero_count =0; one_count=0;
        }

        System.out.println(sb);
    }

    public static void fib(int num){

        int temp1 = 0;
        int temp2 =1;
        int temp = 0;

        if(num==0){
            zero_count++;
            return;
        }else if(num==1){
            one_count++;
            return;
        }else if(num<0)
            return;
        else {
            for(int i=1;i<num;i++){
                temp = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp;
            }

            zero_count = temp1;
            one_count = temp2;
        }
    }
}
