package Codility;

public class Q3_frog {
    public static int count=0;
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8

        while(X<Y){
            X+=D;
            count++;
        }

        return count;

        
    }
}
