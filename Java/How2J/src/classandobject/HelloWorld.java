package classandobject;

public class HelloWorld {

	public static void main(String[] args) {
		
		HeroType hero = HeroType.WIZARD;
		switch(hero) {
			case TANK: System.out.println("̹��");break;
			case WIZARD: System.out.println("��ʦ");break;
			case ASSASSIN: System.out.println("�̿�");break;
			case ASSIST: System.out.println("����");break;
			case WARRIOR: System.out.println("��ս");break;
			case RANGED: System.out.println("Զ��");break;
			case PUSH: System.out.println("�ƽ�");break;
			case FARMING: System.out.println("��Ұ");break;
		}
	}

}