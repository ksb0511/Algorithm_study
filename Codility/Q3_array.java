package Codility;

import java.util.*;

public class Q3_array {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        
        for(int i=0;i<A.length;i++)
            if(A[i+1]-A[i]!=1)
                return A[i]+1;
        

        return 0;
    }


    public int solution2(int[] A) {
        // write your code in Java SE 8

        boolean []array = new boolean[A.length+2];

        for(int i=0;i<A.length;i++){
            array[A[i]] = true;
        }

        for(int i=1;i<array.length;i++){
            if(array[i]==false)
                return i;
        }

        return 0;
    }
}
