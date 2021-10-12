package classandobject;

public class Armor extends Item {
	int ac;
	
	public static void main(String[] args) {
		Armor clothArmor = new Armor();
		clothArmor.name = "²¼¼×";
		clothArmor.price = 200;
		clothArmor.ac = 15;
		
		Armor chainMail = new Armor();
		chainMail.name = "Ëø×Ó¼×";
		chainMail.price = 500;
		chainMail.ac = 40;
	}
}
