package interfacesandinheritance;

import classandobject.Hero;

public class ADAPHero extends Hero implements AP,AD,Mortal {
	@Override
	public void die() {
		System.out.println("ADAPHero死亡");
	}
	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}

	@Override
	public void attack() {
		System.out.println("进行物理魔法攻击");
	}
}
