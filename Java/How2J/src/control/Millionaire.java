package control;

public class Millionaire {

	public static void main(String[] args) {
		double r = 0.2;
		double F = 0;
		int n = 1;
		while(F < 1e6) {
			F = F + 12000 * Math.pow(1+r, n);
			System.out.println(n + "���������Ϊ��" + F);
			n++;
		}
		System.out.println("�ܹ���Ҫ: " + (n-1));
	}

}
