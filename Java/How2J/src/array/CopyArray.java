package array;

public class CopyArray {

	public static void main(String[] args) {
		
		int a_length = (int)(Math.random() * 10);
		int b_length = (int)(Math.random() * 10);
		int c_length = a_length + b_length;
		int[] a = new int[a_length];
		int[] b = new int[b_length];
		int[] c = new int[c_length];
		System.out.println("数组a的内容：");
		for(int i = 0; i < a_length; i++) {
			a[i] = (int)(Math.random() * 100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("数组b的内容：");
		for(int i = 0; i < b_length; i++) {
			b[i] = (int)(Math.random() * 100);
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.arraycopy(a, 0, c, 0, a_length);
		System.arraycopy(b, 0, c, a_length, b_length);
		System.out.println("数组c的内容：");
		for(int i = 0; i < c_length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
	}

}
