package Codility;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


public class Q2_odd {

    public int solution(int[] A) {
        // write your code in Java SE 8

        int result = 0;

        java.util.Arrays.sort(A);

        for(int i=0;i<A.length;i=+2){
            if(i+1 == A.length){
                result = A[i];
                break;
            }

            if(A[i] != A[i+1]){
                result = A[i];
                break;
            }
        }

        return result;
    }
}

