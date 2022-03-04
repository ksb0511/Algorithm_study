package Codility;

import java.util.*;

public class Q4_permcheck {
    //66%
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        for(int i=0;i<A.length-1;i++){
            if(A[i+1]-A[i]!=1)
                return 0;
                
        }

        return 1;
    }

    //100%
    public int solution2(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        int num=0;

        for(int i=0;i<A.length;i++){
            if(A[i]==++num) continue;
            else
                return 0;
                
        }

        return 1;
    }
}