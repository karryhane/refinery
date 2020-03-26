//몇 개짜리 배열을 만들지 숫자 입력받고 , 1~100사이의 정수를 랜덤하게 삽입. 중복X
import java.util.Scanner;
public class pr0308 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 개의 배열을 생성할까요?: ");
		int n = scan.nextInt();
		int[]arr = new int[n];
		
		int a = 0; 
		int i = 0; 
		int j = 0;
		
		for(i = 0; i < n;  i++) {
			a = (int)(Math.random() * 100 + 1);
			
			if(i == 0) {
				arr[i] = a;
				System.out.print(arr[i] + " ");
			}
			
			for(j = 0; j < i; j++) {
				if(arr[j] == a) {
					i--;
					break;
				}
				if(j == i - 1) {
					arr[i] = a;
					System.out.print(arr[i] + " ");
					if((i%10 == 9))
						System.out.println();
				}
			}
			
			
		}
		
		
	}

}
