package operator;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入身高（m）：");
		double height = sc.nextDouble();
		System.out.println("请输入体重（kg）：");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("当前的BMI是：" + bmi);
		sc.close();
	}

}
