
public class pr030201 {

	public static void main(String[] args) {
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };
		
		int i = 0;
		int sum = 0;
		for (int j = 0; j < n[i].length; j++) {
			System.out.print(n[i][j] + "\t");
			sum += n[i][j];
		}
		System.out.println((double) sum / n[i].length);
	}
}
