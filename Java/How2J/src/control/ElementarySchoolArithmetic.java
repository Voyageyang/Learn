package control;

public class ElementarySchoolArithmetic {

	public static void main(String[] args) {
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				for(int k = 0; k < 15; k++) {
					for(int l = 0; l < 11; l++) {
						if(i + j == 8 && k - l == 6 && i + k == 14 && j + l == 10) {
							System.out.println(i + " " + j + " " + k + " " + l);
						}
					}
				}
			}
		}
	}

}
