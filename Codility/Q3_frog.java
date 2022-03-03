package Codility;

public class Q3_frog {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int num = Y-X;
        // if(num%D==0)
        //     return num/D;
        // else
        //     return num/D+1;

        return num%D == 0 ? (num/D):(num/D+1);

        
    }
}
