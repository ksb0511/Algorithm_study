package Codility;

import java.util.*;

//55
public class Q4_demo_task {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        A = Arrays.stream(A).distinct().toArray();

        if(A[A.length-1]<=0)
            return 1;
        else if(A[0]>0){
            for(int i=0;i<A.length;i++){
                if(A[i]==(i+1))
                    continue;
                else 
                    return (i+1);
            }
            return A.length+1;
        }else{
            int num = 1;
            for(int i=0;i<A.length;i++){
                if(A[i]<=0) continue;
                else{
                    for(int j=i;j<A.length;j++){
                        if(A[i]==num){
                            num++;
                            continue;
                        }
                        else 
                            return num;
                    }
                }
            }       
        }
        return 1;
    }
}
