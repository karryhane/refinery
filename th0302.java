
public class th0302 {
	
	//����: 3���� ���ప�� 0�� ������ 0���� �����ε� 10�̻��̶�� �س��� ����������ξȵ�

	public static void main(String[] args) {
		int i, j, k, l;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
//1//
		for(i = 0; i < 10; i++) 
			sum1 += i;
		System.out.println(sum1);
	
//2//
		for(j = 9; j > 0; j--) 	
			sum2 += j;
		System.out.println(sum2);
		
		
//3//
		for(k = 0; k > 10; k++) 
			sum3 ++;
		System.out.println(sum3);

//4//
		for(l = 0; l < 10; sum4 += l, l++) ;
			System.out.println(sum4);
		
	}

}
