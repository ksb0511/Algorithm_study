package Private.skill.LEVEL2;

public class Problem_1_2 {
    public static int zero = 0;
	public static int one = 0;
	public static int[][] board;
    
    public int[] solution(int[][] arr) {
        
		board = new int[arr.length][arr.length];
        board = arr;
		
		partition(0, 0, arr.length);
		
        int answer[] = new int[2];
        
        answer[0] = zero;
        answer[1] = one;
        return answer;
		
	}
	
	public static void partition(int row, int col, int size) {
		
		if(Check(row, col, size)) {
			if(board[row][col] == 0) {
				zero++;
			}
			else {
				one++;
			}
			return;
		}
		
		int newSize = size / 2;	// 절반 사이즈
		// 재귀 호출
		partition(row, col, newSize);						// 2사분면
		partition(row, col + newSize, newSize);				// 1사분면
		partition(row + newSize, col, newSize);				// 3사분면
		partition(row + newSize, col + newSize, newSize);	// 4사분면
	}
	
	
	public static boolean Check(int row, int col, int size) {
	
		int color = board[row][col];
		
		for(int i = row; i < row + size; i++) {
			for(int j = col; j < col + size; j++) {
				if(board[i][j] != color) {
					return false;
				}
			}
		}

		return true;
	}
}
