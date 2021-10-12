package interfacesandinheritance;

import classandobject.Hero;

public class ADHero extends Hero implements AD {
	/*@Override
	public void die() {
		System.out.println("ADHero死亡");
	}

	public static void battleWin() {
		System.out.println("ad hero battle win");
	}

	public static void main(String[] args) {
		Hero h = new ADHero();
		h.battleWin();
	}*/
	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
}
