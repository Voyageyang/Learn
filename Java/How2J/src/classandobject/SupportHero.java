package classandobject;

/**
 *  ����������ָ���Ƿ�����һ�������ǲ������Ͳ�һ��
 *  �ڵ������صķ�����ʱ�򣬻���ݴ��ݵĲ��������Լ��������Զ����ö�Ӧ�ķ���
 * @author Yang Hang
 *
 */

public class SupportHero extends Hero {
	
	public void heal() {
		System.out.println(name + "������һ�����ƣ�����ȷ��������˭");
	}
	
	public void heal(Hero h) {
		System.out.println(name + "Ϊ" + h.name + "����Ѫ������֪�����˶���");
	}
	
	public void heal(Hero h, int healHp) {
		System.out.println(name + "Ϊ" + h.name + "����" + healHp + "��Ѫ");
		hp = hp + healHp;
	}
	
	public static void main(String[] args) {
		SupportHero bh = new SupportHero();
		bh.name = "�ͽ�����";
		
		Hero h1 = new Hero();
		h1.name = "����";
		
		bh.heal();
		bh.heal(h1);
		bh.heal(h1, 20);
	}
}
