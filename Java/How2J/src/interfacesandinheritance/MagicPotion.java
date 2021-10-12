package interfacesandinheritance;

import classandobject.Item;

public class MagicPotion extends Item {
	@Override
	public boolean disposable() {
		return true;
	}

	public void effect() {
		System.out.println("蓝瓶使用后，可以回魔法");
	}
}
