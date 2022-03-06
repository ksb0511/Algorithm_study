package Codility;

public class Q5_MinAvgTwoSlice {
    static double MIN = Integer.MAX_VALUE;
    static int start=0;

    public int solution(int[] A) {
        // write your code in Java SE 8

        int[][] B = new int[A.length][A.length+1];

        for(int i=0;i<A.length;i++)
            for(int j=1;j<=A.length-i;j++){

                B[i][j] = B[i][j-1] + A[j+i-1];
                if(j!=1&&MIN>(double)B[i][j]/j){
                    MIN = (double)B[i][j]/j;
                    start = i;
                }

            }

        return start;
    }

    public int solution100(int[] A) {
        // write your code in Java SE 8

        int answer = 0;
        double avg = Double.MAX_VALUE;

        for(int i=0;i<A.length-2;i++){
            double avg2 = (A[i]+A[i+1])/2.0;
            double avg3 = (A[i]+A[i+1]+A[i+2])/3.0;

            if(avg>Math.min(avg2, avg3)){
                avg=Math.min(avg2, avg3);
                answer = i;
            }
        }

        if(avg>(A[A.length-2]+A[A.length-1])/2.0){
            avg=(A[A.length-2]+A[A.length-1])/2.0;
            answer = A.length -2;
        }

        return answer;
    }
}
