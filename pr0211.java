import java.util.Scanner;
//몇 월인지 입력받아 계절을 출력하기
public class pr0211 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("몇 월인지 입력하세요.");
		int num = scan.nextInt();

		switch (num) {

		case 3:	case 4:	case 5:
			System.out.println("봄");
			break;

		case 6:	case 7:	case 8:
			System.out.println("여름");
			break;

		case 9:	case 10: case 11:
			System.out.println("가을");
			break;

		case 12: case 1: case 2:
			System.out.println("겨울");
			break;

		default:
			System.out.println("잘못입력");

		}
		scan.close();

	}

}
