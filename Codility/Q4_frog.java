package Codility;

import java.util.*;

public class Q4_frog {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8

        //HashSet은 중복은 없앤다.
        HashSet<Integer> check = new HashSet<>();

        for(int i=0;i<A.length;i++){
            check.add(A[i]);

            if(check.size()==X)
                return i;
                
            
        }
        return -1;
    }
}
