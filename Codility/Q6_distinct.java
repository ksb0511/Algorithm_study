package Codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Q6_distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(A).boxed().collect(Collectors.toList());


        int aFrequency=0;
        int i=0;

        while(aFrequency!=1){
            i++;
            aFrequency = Collections.frequency(integerArray, i);
        }

        return i;
    }

    public int solution100(int[] A) {
        // write your code in Java SE 8

        Set<Integer> nums = new HashSet<>();
 
        for (int a : A) {
            nums.add(a);
        }
 
        return nums.size();
    }
}
