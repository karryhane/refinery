import java.util.Scanner;
public class pr0201 {
//Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸고//

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위:원)>>");
		int num = scan.nextInt();
		double dollar = num / 1100;
		System.out.println(num + "원은 $" + dollar + "입니다.");
		scan.close();
	}

}
