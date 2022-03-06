package Codility;

import java.util.Arrays;

//혼자 풀어서 100점
public class Q6_MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        if(A[0]<0&&A[1]<0)
            return Math.max(A[0]*A[1]*A[A.length-1],A[A.length-3]*A[A.length-2]*A[A.length-1]);
        else
            return (A[A.length-3]*A[A.length-2]*A[A.length-1]);
    }
}
