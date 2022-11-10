import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList l = new ArrayList();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0)
                l.add(arr[i]);
                
        }
        if(l.size()==0)
            l.add(-1);
        else l.sort(Comparator.naturalOrder());
        return l.stream().mapToInt(i -> Integer.parseInt(i.toString())).toArray();
    }
}

class Divisible {
    public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}
