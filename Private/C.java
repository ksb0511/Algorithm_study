package Private;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class C {
	static char a[];
	static int result=0;
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		a = new char[N];
		String s = br.readLine();

		a = s.toCharArray();

		for(int i=0;i<a.length;i++){	
			if(a[i]=='W'){
				func_H(i);
			}
		}

		System.out.println(result);
	}

	public static void func_H(int n){
		for(int i=n;i<a.length-1;i++)
			if(a[i]=='H'){
				System.out.println("H : "+i+" 번 째");
				func_E(i+1,0);
			}
	}

	public static void func_E(int n, int zero_num){
		// System.out.println("%%%%%%%"+zero_num);
		if(zero_num>=2){
			// System.out.println("&&&&&&"+zero_num);
			result++;
		}

		if(n==a.length-1)
			return;

		for(int i=n;i<a.length;i++)
			if(a[i]=='E'){
				// System.out.println("E : "+i+" 번 째");
				// zero_num++;
				func_E(i+1,++zero_num);
			}
				
	}
}