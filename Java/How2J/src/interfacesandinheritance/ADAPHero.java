package interfacesandinheritance;

import classandobject.Hero;

public class ADAPHero extends Hero implements AP,AD,Mortal {
	@Override
	public void die() {
		System.out.println("ADAPHero����");
	}
	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}

	@Override
	public void physicAttack() {
		System.out.println("����������");
	}

	@Override
	public void attack() {
		System.out.println("��������ħ������");
	}
}
