package operator;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ߣ�m����");
		double height = sc.nextDouble();
		System.out.println("���������أ�kg����");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("��ǰ��BMI�ǣ�" + bmi);
		sc.close();
	}

}
