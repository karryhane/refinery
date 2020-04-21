
import static org.junit.Assert.assertTrue;

import java.util.Vector;

import org.junit.Test;

public class BingoTest2 {

// 2차원 배열 arr의 빙고 갯수를 세어서 반환. 아래의 메서드를 완성하고 테스트하시오.
	int bingoCheck(int[][] arr) {
		int cnt = 0;
		//행,열 체크
		for(int i = 0; i < arr.length; i++) {
			int row_sum = 0;
			int col_sum = 0;
			for(int j = 0; j < arr.length; j++) {
				row_sum = row_sum + arr[i][j];
				col_sum = col_sum + arr[j][i];
			}
			if(row_sum == 5) {
				cnt = cnt +1;
			}
			if(col_sum == 5) {
				cnt = cnt +1;
			}
		}
		//대각선 체크
		int diag_asc_sum = 0;
		int diag_desc_sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == j) {
					diag_asc_sum = diag_asc_sum + arr[i][j];
				}
				if(i + j == 4) {
					diag_desc_sum = diag_desc_sum + arr[i][j];
				}
			}
		}
		if(diag_asc_sum == 5) {
			cnt = cnt + 1;
		}
		if(diag_desc_sum == 5) {
			cnt = cnt +1;
		}
		// 2차원 배열 arr에서 빙고갯수를 센다.
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
