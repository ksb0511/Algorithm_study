package Com;

import java.io.*;
import java.util.StringTokenizer;

// 다시 풀어야 할 문제,,,,
public class Q14890 {
    public static int n,l, map[][], checked1[], checked2[], result;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
            
        n = Integer.parseInt(st1.nextToken());
        l = Integer.parseInt(st1.nextToken());

        map = new int[n][n];
        checked1 = new int[n];
        checked2 = new int[n];

        result = n*2;

        // 숫자 입력받기
        for(int i=0;i<n;i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(st2.nextToken());
            }

        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                checked1[i] = map[i][j] - map[i][j+1];
                checked2[i] = map[j][i] - map[j+1][i];
            }
            possible();
        }

        System.out.println(result);
    }

	static void possible() {

        //System.out.println(checked1[0]);

		for(int i=0;i<n-1;i++){
            if((checked1[i] ==1 && checked1[i+1] !=1) ||(checked1[i] ==-1 && checked1[i+1] !=-1)|| checked1[i]>1 || checked1[i]<-1){
                result--;
                return;
            }
            //if(checked2[i] != 0 && checked2[i+1] !=0 || checked2[i]>1 || checked2[i]<-1){
            if((checked2[i] ==1 && checked2[i+1] !=1) ||(checked2[i] ==-1 && checked2[i+1] !=-1)|| checked2[i]>1 || checked2[i]<-1){
                result--;
                return;
            }
            
        }
	}
 

}