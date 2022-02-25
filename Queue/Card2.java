package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//2164
public class Card2 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<Integer> q = new ArrayDeque<>();
		
		for(int i=1;i<n+1;i++)
			q.offer(i);

		while(q.size()!=1){
			q.removeFirst();
			q.offer(q.getFirst());
			q.removeFirst();
		}

		System.out.println(q.getFirst());
			
	}
}