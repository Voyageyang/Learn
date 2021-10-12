package classandobject;

public class Armor extends Item {
	int ac;

	@Override
	public boolean disposable() {
		return false;
	}
	
	public static void main(String[] args) {
		/*Armor clothArmor = new Armor();
		clothArmor.name = "²¼¼×";
		clothArmor.price = 200;
		clothArmor.ac = 15;
		
		Armor chainMail = new Armor();
		chainMail.name = "Ëø×Ó¼×";
		chainMail.price = 500;
		chainMail.ac = 40;*/
	}
}

class LifePotion extends Item {
	@Override
	public boolean disposable() {
		return true;
	}
}

class Weapon extends Item {
	@Override
	public boolean disposable() {
		return false;
	}
}

