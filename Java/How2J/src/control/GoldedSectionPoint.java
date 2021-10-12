package control;

public class GoldedSectionPoint {

	public static void main(String[] args) {
		double min = 20;
		int mini = 0;
		int minj = 0;
		for(int i = 1; i <= 20; i++) {
			for(int j = 1; j <= 20; j++) {
				if(i % 2 == 0 && j % 2 == 0) continue;
				if(Math.abs(1.0 * i / j - 0.618) < Math.abs(min - 0.618)) {
					mini = i;
					minj = j;
					min = 1.0 * mini / minj;
				}
			}
		}
		System.out.println("离黄金分割点(0.618)最近的两个数是：" + mini +"/" + minj + "=" + min);
	}

}
