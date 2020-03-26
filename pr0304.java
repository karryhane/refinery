
public class pr0304 {

	public static void main(String[] args) {

		String[] n = {"a","b","c","d","e"};
		
		int i = 0;
		int j = 0;
		
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				if(i + j < 5) {
					System.out.print(n[j]);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
