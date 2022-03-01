package Codility;
import java.util.Queue; //import
import java.util.LinkedList; //import

public class Q2_CyclicRotation {


    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int num;

        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=A.length-1;i>=0;i--)
            q.offer(A[i]);

        for(int i=0;i<K;i++){
            num = Integer.parseInt(q.peek().toString());
            q.poll();
            q.offer(num);
        }

        for(int i=A.length-1;i>=0;i--){
            A[i] = Integer.parseInt(q.peek().toString());
            q.poll();
        }

        return A;

    }

}
