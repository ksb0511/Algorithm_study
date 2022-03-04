package Codility;

public class Q3_tape {
    public static int total=0;
    public static int MIN = Integer.MAX_VALUE;


    public int solution(int[] A) {
        // write your code in Java SE 8

        for(int i=0;i<A.length;i++){
            total+=A[i];
        }

        for(int i=0;i<A.length-1;i++){
            total-=(A[i]*2);         
            MIN = Math.min(MIN, Math.abs(total));
        }

        return MIN;
    }
}
