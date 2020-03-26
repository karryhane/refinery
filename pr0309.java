//4X4 2차원 배열을 만들고 1~10사이의 숫자를 랜덤하게 출력

public class pr0309 {
	public static void main (String[] args) {
		int[][]n = new int[4][4];
		
		for (int i = 0; i < n.length; i++)
			for (int j = 0; j < n[i].length; j++)
				n[i][j] = (int)(Math.random() * 10 + 1); 
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++)
				System.out.print(n[i][j] + "\t");
			System.out.println();
		}
	}
}
