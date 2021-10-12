package control;

public class NarcissisticNumber {

	public static void main(String[] args) {
		for(int i = 100; i < 1000; i++) {
			int onesPlace3 = (int)Math.pow(i%10, 3);
			int tensPlace3 = (int)Math.pow(i/10%10, 3);
			int hundredsPlace3 = (int)Math.pow(i/100, 3);
			if(onesPlace3 + tensPlace3 + hundredsPlace3 == i) 
				System.out.println(i);
		}
	}

}
