package Codility;

import java.util.*;

public class Q4_max_counter {
    public static int result[];
    public static int MAX = Integer.MIN_VALUE;

    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        result = new int[N];

        for(int i=0;i<A.length;i++){
            if(A[i]>N)
                Arrays.fill(result, MAX);
            else{
                result[A[i]-1]++;
                MAX = Math.max(MAX, result[A[i]-1]);
            }
        }

        return result;

    }

    public int[] solution2(int N, int[] A) {
        // write your code in Java SE 8
        int[] counter = new int[N];
        int max = 0;
        int check = 0;
        

        for(int i = 0 ; i < A.length ; i++){
            if(A[i] == N+1) max = check;
            else{
                if(counter[A[i]-1] < max)  counter[A[i]-1] = max;
                counter[A[i]-1]++;
                if(check < counter[A[i]-1]) check = counter[A[i]-1];
            }
        }

        for(int i = 0 ; i < counter.length ; i++) if(counter[i] < max)  counter[i] = max;
        return counter;

    }
}
