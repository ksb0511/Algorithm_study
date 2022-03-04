package Com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13458 {
    
    static int n, a[], b, c;
    static long result_num = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        StringTokenizer stz = new StringTokenizer(br.readLine());

        a = new int[n];

        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(stz.nextToken());
        }

        StringTokenizer stz2 = new StringTokenizer(br.readLine());
        b = Integer.parseInt(stz2.nextToken());
        c = Integer.parseInt(stz2.nextToken());
        
        for(int i=0;i<n;i++){
            result_num += result(a[i]);
        }
        System.out.println(result_num);
    }
    
    public static int result(int count) {
        
        int c_num = count - b;

        int num;
        if(c_num<0){
            return 1;
        }else {
            if(c_num%c==0){
                num = c_num/c;
            }else{
                num = c_num/c +1;
            }
    
        }
        return num+1;
    }
    
    
    
    
}