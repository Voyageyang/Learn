package interfacesandinheritance;

import classandobject.Hero;

public class APHero extends Hero implements Mortal {
	@Override
	public void die() {
		System.out.println("APHeroËÀÍö");
	}

}
