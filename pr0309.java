//4X4 2���� �迭�� ����� 1~10������ ���ڸ� �����ϰ� ���

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
