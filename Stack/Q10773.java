package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;

public class Q10773 {
	public static int n, A[], result=0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());

		A = new int[n];

		Stack<Integer> s= new Stack<>();

		for(int i=0;i<n;i++){
			A[i]=Integer.parseInt(br.readLine());
			if(A[i]==0){
				result -= s.peek();
				s.pop();
			}
			else {s.push(A[i]); result+=s.peek();}
		}

		System.out.println(result);
		
	}

}
