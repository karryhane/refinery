
public class th0303 {
	
//����: continue;

	public static void main(String[] args) {
		int sum = 0; 
		int i = 0;
		while(i < 100) {
			if(i%3 != 0) {
				i++;
				//��ĭ//
			continue;
			}
			else sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
