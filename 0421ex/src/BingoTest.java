
import static org.junit.Assert.assertTrue;

import java.util.Vector;

import org.junit.Test;

public class BingoTest {

// 2���� �迭 arr�� ���� ������ ��� ��ȯ. �Ʒ��� �޼��带 �ϼ��ϰ� �׽�Ʈ�Ͻÿ�.
	int bingoCheck(int[][] arr) {
		int cnt = 0;
		int diag_asc_sum = 0;
		int diag_desc_sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int row_sum = 0;
			int col_sum = 0;
			for (int j = 0; j < 5; j++) {
				row_sum = row_sum + arr[i][j];
				col_sum = col_sum + arr[j][i];
				if (i == j) {
					diag_asc_sum = diag_asc_sum + arr[i][j];
				}
				if (i + j == 4) {
					diag_desc_sum = diag_desc_sum + arr[i][j];
				}
			}
			cnt = cnt + ((row_sum == 5) ? 1 : 0) + ((col_sum == 5) ? 1 : 0) +
					((diag_asc_sum == 5) ? 1 : 0) + ((diag_desc_sum == 5) ? 1 : 0);
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
