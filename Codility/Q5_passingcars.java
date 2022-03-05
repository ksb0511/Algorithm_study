package Codility;

public class Q5_passingcars {
    static int sum=0, result=0;

    public int solution(int[] A) {
        // write your code in Java SE 8

        for(int i=0;i<A.length;i++){
            if(A[i]==0)
                sum++;
            else   
                result+=sum;
        }

        if(result>1000000000 || result<0) return -1;

        return result;
    } 
}
