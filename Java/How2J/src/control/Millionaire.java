package control;

public class Millionaire {

	public static void main(String[] args) {
		double r = 0.2;
		double F = 0;
		int n = 1;
		while(F < 1e6) {
			F = F + 12000 * Math.pow(1+r, n);
			System.out.println(n + "年后，总收入为：" + F);
			n++;
		}
		System.out.println("总共需要: " + (n-1));
	}

}
