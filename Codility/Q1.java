package Codility;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.*;

class Q1 {
    public static int MAX = Integer.MIN_VALUE;

    public int solution(int N) {
        
        int count=0, num;
        String bin;
        
        LinkedList<Integer> l = new LinkedList<Integer>();
        bin = Integer.toBinaryString(N);
        char result[] = bin.toCharArray();

        for(int i=0;i<result.length;i++){
            if(result[i]=='1'){
                count++;
                l.add(i);
            }
        }

        if(count>1){
            for(int i=0;i<l.size()-1;i++){
                num = l.get(i+1) - l.get(i);
                MAX = Math.max(num, MAX);
            }
        }else
            return 0;

        return MAX-1;

    }
}
