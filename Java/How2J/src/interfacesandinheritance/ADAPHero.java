package interfacesandinheritance;

import classandobject.Hero;

public class ADAPHero extends Hero implements Mortal {
	@Override
	public void die() {
		System.out.println("ADAPHeroËÀÍö");
	}

}
