package array;

public class TwoDimension {

	public static void main(String[] args) {

		int[][] a = new int[5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				a[i][j] = (int)(Math.random() * 100);
				System.out.printf("%-6d", a[i][j]);
			}
			System.out.println();
		}
		int maxi = 0;
		int maxj = 0;
		int max = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
					maxi = i;
					maxj = j;
				}
			}
		}
		System.out.println("�ҳ��������ǣ�" + max);
		System.out.println("��������" + "[" + maxi + "]" + "[" + maxj + "]");
		

	}

}
