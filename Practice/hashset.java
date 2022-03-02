package Practice;

import java.io.IOException;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) throws IOException {
        


        HashSet<Integer> set = new HashSet<Integer>();//HashSet생성
        set.add(1); //값 추가
        set.add(2);
        set.add(3);

        System.out.println(set);

        //HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3));//HashSet생성
        System.out.println(set.contains(1)); //set내부에 값 1이 있는지 check : true

    }

}
