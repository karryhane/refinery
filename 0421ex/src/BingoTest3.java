
import static org.junit.Assert.assertTrue;

import java.util.Vector;

import org.junit.Test;

public class BingoTest3 {

// 2차원 배열 arr의 빙고 갯수를 세어서 반환. 아래의 메서드를 완성하고 테스트하시오.
	int bingoCheck(int[][] arr) {
		int cnt = 0;
		//행 체크
		for(int i = 0; i < arr.length; i++) {
			int tmp = 0;
			for(int j = 0; j < arr.length; j++) {
				tmp = tmp + arr[i][j];
			}
			if(tmp == 5) {
				cnt = cnt +1;
			}
		}
		
		//열 체크
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
		
		//대각선 체크
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
