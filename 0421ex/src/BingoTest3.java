
import static org.junit.Assert.assertTrue;

import java.util.Vector;

import org.junit.Test;

public class BingoTest3 {

// 2���� �迭 arr�� ���� ������ ��� ��ȯ. �Ʒ��� �޼��带 �ϼ��ϰ� �׽�Ʈ�Ͻÿ�.
	int bingoCheck(int[][] arr) {
		int cnt = 0;
		//�� üũ
		for(int i = 0; i < arr.length; i++) {
			int tmp = 0;
			for(int j = 0; j < arr.length; j++) {
				tmp = tmp + arr[i][j];
			}
			if(tmp == 5) {
				cnt = cnt +1;
			}
		}
		
		//�� üũ
		for(int j = 0; j < arr.length; j++) {
			int tmp = 0;
			for(int i = 0; i < arr.length; i++) {
				tmp = tmp + arr[i][j];
			}
			if(tmp == 5) {
				cnt = cnt +1;
			}
		}
		int tmp2 = 0; int tmp3 = 0;
		
		//�밢�� üũ
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == j) {
					tmp2 = tmp2 + arr[i][j];
				}
				if(i + j == 4) {
					tmp3 = tmp3 + arr[i][j];
				}
			}
		}
		
		if(tmp2 == 5) {
			cnt = cnt +1;
		}
		if(tmp3 == 5) {
			cnt = cnt +1;
		}
		// 2���� �迭 arr���� �������� ����.
		return cnt;
	}

	@Test
	public void test4() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0 }, { 1, 0, 0, 1, 0 },
				{ 1, 0, 0, 0, 1 }, };

		assertTrue(bingoCheck(arr) == 3);
	}

	@Test
	public void test3() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 }, { 1, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0 }, };

		assertTrue(bingoCheck(arr) == 2);
	}

	@Test
	public void test2() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 }, };

		assertTrue(bingoCheck(arr) == 1);
	}

	@Test
	public void test() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1 }, };

		assertTrue(bingoCheck(arr) == 12);
	}

}
