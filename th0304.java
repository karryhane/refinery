
public class th0304 {
//Á¤´ã: i == 50
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
			while(true) {
				if(i == 51)//<-ºóÄ­
					break;
				sum += i;
				i++;
			}
System.out.println(sum);
	}

}
