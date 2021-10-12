package classandobject;

/**
 *  方法的重载指的是方法名一样，但是参数类型不一样
 *  在调用重载的方法的时候，会根据传递的参数类型以及数量，自动调用对应的方法
 * @author Yang Hang
 *
 */

public class SupportHero extends Hero {
	
	public void heal() {
		System.out.println(name + "进行了一次治疗，但不确定治疗了谁");
	}
	
	public void heal(Hero h) {
		System.out.println(name + "为" + h.name + "加了血，但不知道加了多少");
	}
	
	public void heal(Hero h, int healHp) {
		System.out.println(name + "为" + h.name + "加了" + healHp + "的血");
		hp = hp + healHp;
	}
	
	public static void main(String[] args) {
		SupportHero bh = new SupportHero();
		bh.name = "赏金猎人";
		
		Hero h1 = new Hero();
		h1.name = "盖伦";
		
		bh.heal();
		bh.heal(h1);
		bh.heal(h1, 20);
	}
}
