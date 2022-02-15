import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
 
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); // 숫자를 입력받음

		//<<[Array로 넣기 위한 과정]>>
		String temp = Integer.toString(num);
        int[] digits = new int[temp.length()];
    	for (int i = 0; i < temp.length(); i++)
			digits[i] = temp.charAt(i) - '0';
		
		//<<짝수번째 자리만 따로 추출해서 string에 붙이기>>
		temp = "";
		for (int i = 0; i < digits.length; i+=2) { 
			temp += Integer.toString(digits[i]);
		}

		//<<2진수 변환 과정>>
		int tobinary = Integer.parseInt(temp);
		temp = Integer.toBinaryString(tobinary);

		System.out.print(temp);

		// 좀 더 간단하게 Array에 넣는 법
        // int[] digits = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        // System.out.print( Arrays.toString(digits) ); // [1, 2, 3, 4, 5]  
		
	}
}
