package operator;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个整数");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a+b));
		sc.close();
	}

}
