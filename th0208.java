
public class th0208 {
//다음 문장을 조건식으로 나타내라
	public static void main(String[] args) {
		int age = 10;
		int b = 20;
		int c = 5;
		if(age <= 12) {
			System.out.println(age);
		}
		
		if(age <= b && age >c ) {
			System.out.println(age);
		}
		
		boolean d = (age-5 == 10)?true:false;
		System.out.println(d);
		
		if((age != b)||(age == c)) {
			System.out.println("거짓입니다.");
		}else {
			System.out.println("참입니다.");
		}
	}

}
