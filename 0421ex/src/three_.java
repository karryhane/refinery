
public class three_ {
public static void main(String[] args) {
	
	int row_sum = 5;
	int col_sum = 5;
	int diag_asc_sum = 5;
	int diag_desc_sum = 5;
	int cnt = 0;
	
	int s1 = (row_sum == 5) ? 1 : 0;
	int s2 = (col_sum == 5) ? 1 : 0;
	int s3 = (diag_asc_sum == 5) ? 1 : 0;
	int s4 = (diag_desc_sum == 5) ? 1 : 0;
	cnt = s1 + s2 + s3 + s4;


	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(cnt);
}
}
