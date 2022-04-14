package Codility;

import java.util.LinkedList;


//다시풀기
public class Q10_Flags {

    public int solution(int[] A) {
        LinkedList<Integer> l = new LinkedList<>();

        for(int i=1;i<A.length-1;i++){
            if(A[i-1]<A[i]&&A[i]>A[i+1])
                l.add(i);
        }
        
        int flag_distance = l.size();

        if(flag_distance==0)
            return 0;
        else if(flag_distance==1)
            return 1;

        int j=1;
        while(j!=flag_distance-1){
            if(l.get(j)-l.get(j-1)<flag_distance)
                l.remove(j);   
        }

        return l.size();
    }

}


