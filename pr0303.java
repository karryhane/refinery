import java.util.Scanner;

public class pr0303 {

	public static void main(String[] args) {
		 System.out.println("������ �Է��Ͻÿ�>>"); 
		 Scanner scan =new Scanner(System.in); 
		 
		 int n = 0;
		 n = scan.nextInt(); 
		 
		 for(int i = 0; i < n; i++) { 
			 for(int j = 0; j < n-i; j++) { 
				 System.out.print("*"); 
				 } 
			 System.out.println(); } 
		 
		 scan.close(); 
		 } 
	}


	


