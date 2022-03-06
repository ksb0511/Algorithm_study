package Codility;

public class Q5_GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8

        int aa, bb, cc;

        int a [][] = new int[3][S.length()+1];
        int result[] = new int[P.length]; 

        for(int i=0;i<S.length();i++){
            aa=0; bb=0; cc=0;
            if(S.charAt(i)=='A')
                aa=1;
            else if(S.charAt(i)=='C')
                bb=1;
            else if(S.charAt(i)=='G')
                cc=1;

            a[0][i+1] = a[0][i] + aa;
            a[1][i+1] = a[1][i] + bb;
            a[2][i+1] = a[2][i] + cc;
        }

        for(int i=0;i<P.length;i++){
            int fromIndex = P[i]+1;
            int toIndex = Q[i]+1;

            if(a[0][toIndex]-a[0][fromIndex-1]>0)
                result[i]=1;
            else if(a[1][toIndex]-a[1][fromIndex-1]>0)
                result[i]=2;
            else if(a[2][toIndex]-a[2][fromIndex-1]>0)
                result[i]=3;
            else
                result[i]=4;
        }

        return result;
    }
}
