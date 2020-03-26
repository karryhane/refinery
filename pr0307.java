//랜덤음로 정수 1개짜리 배열 만들고 평균출력
public class pr0307 {

	public static void main(String[] args) {
		int n[] = new int[10]; 

		for (int i = 0; i < n.length; i++) { 
			int r = (int) (Math.random() * 10 + 1);
			n[i] = r;
		}

		int sum = 0;
		for (int i = 0; i < n.length; i++) 
			sum += n[i];

		System.out.print("임의의 정수 10개 : ");
		for (int i = 0; i < n.length; i++)
			System.out.print(n[i] + " ");

		System.out.println("\n평균: " + (double) sum / n.length);
	}

}
