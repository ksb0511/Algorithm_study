package Codility;

public class Q5_countdiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int init =0;
        for (int i=A; i<=B;i++){
            if(i%K==0){
                init = i;
                break;
            }
        }

        if(A==B) return A%K == 0? 1 : 0;
        int result = B/K - init/K +1;
        return result;
    }
}
