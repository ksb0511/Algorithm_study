package Codility;

import java.util.Arrays;

//혼자 풀어서 100점
public class Q6_Triangle {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        for(int i=0;i<A.length-2;i++)
            if(A[i]+A[i+1]-A[i+2]>0)
                return 1;

        return 0;
    }
}
