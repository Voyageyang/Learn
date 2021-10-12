package array;

import java.util.Arrays;

public class TwoDimensionSort {

	public static void main(String[] args) {
		int[][] a = new int[5][8];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 8; j++) {
				a[i][j] = (int)(Math.random() * 100);
			}
		}
		int[] b = new int[40];
		int position = 0;
		for(int i = 0; i < 5; i++) {
			System.arraycopy(a[i], 0, b, position, 8);
			position += 8;
		}
		Arrays.sort(b);
		position = 0;
		for(int i = 0; i < 5; i++) {
			a[i] = Arrays.copyOfRange(b, position, position + 8);
			position += 8;
		}

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.printf("%-6d", a[i][j]);
			}
			System.out.println();
		}

	}

}
