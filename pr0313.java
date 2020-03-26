
public class pr0313 {

	public static void main(String[] args) {

		String str[] = {" ¹Ú¼öÂ¦", " ¹Ú¼öÂ¦Â¦"};
		
		int num = 0;
		int n3 = 0;
		int res = 0;

		for (int i = 1; i < 100; i++) {
			num = i;
			for (res = num % 10; num > 0; res = num % 10) {
				if (res == 3 || res == 6 || res == 9) n3++; 
				num = num / 10;
			}
			if (n3 >0)
				System.out.println(i + str[n3-1]); 
			n3 = 0;
		}

	}

}
