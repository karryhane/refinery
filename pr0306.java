import java.util.Scanner;
public class pr0306 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액: ");
		int num = scan.nextInt();
		
		int[] n = {50000,10000,1000,500,100,50,10,1};
		
		int i = 0; 
		int k = 0;
		
		for(i = 0; i < n.length; i++) {
			k = num / n[i];
			if(k != 0) 
				System.out.println(n[i] + "원짜리: " + k + "개");
				num -= n[i] * k;
		}
		
	}

}
