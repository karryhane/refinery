
public class th0208 {
//���� ������ ���ǽ����� ��Ÿ����
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
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("���Դϴ�.");
		}
	}

}
