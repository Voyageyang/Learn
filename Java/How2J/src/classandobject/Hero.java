package classandobject;

import interfacesandinheritance.*;


public class Hero {

	/*
	{
        name = Hero.getName("��ʼ����");
    }
    
    public Hero(){
        name = Hero.getName("���췽��");
    }
    */
	public String name; // =Hero.getName("��������") ;
	
	float hp; //Ѫ��
	
	float armor; // ����
	
	int moveSpeed; // �ƶ��ٶ�
	
	static String copyright;
	
	/*
	 * ��������ģʽ
	private Hero() {
		
	}
	
	private static Hero Instance = new Hero();
	
	public static Hero getInstance() {
		return Instance;
	}
	*/
	
	/*
	 * ��������ģʽ
	private Hero() {
		
	}
	
	private static Hero Instance;
	
	public static Hero getInstance() {
		if(null == Instance) {
			Instance = new Hero();
		}
		return Instance;

	}
	*/
	
	/*
	public Hero(String heroName, float heroHp, float heroArmor, int heroMoveSpeed) {
		name = heroName;
		hp = heroHp;
		armor = heroArmor;
		moveSpeed = heroMoveSpeed;
	}

	 Hero(String name, float hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public Hero(String name, float hp, float armor, int moveSpeed) {
		this(name, hp);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
	}
	*/
	
	public static String getName(String pos){
        String result= "name "+pos;
        System.out.println(result);
        return result;
    }
	
	// �Ӷ���
	void keng() {
		System.out.println("�Ӷ��ѣ�");
	}
	
	// ��ȡ����ֵ
	float getArmor() {
		return armor;
	}
	
	// �����ƶ��ٶ�
	void addSpeed(int speed) {
		moveSpeed += speed;
	}
	
	void legendary() {
		System.out.println("����");
	}
	
	float getHp() {
		return hp;
	}
	
	void recovery(float blood) {
		hp += blood;
	}
	
	int i = 1;
	public void method1(int i) {
		System.out.println(i);
	}
	
	public void kill(Mortal m) {
		m.die();
	}
	
	public static void battleWin() {
		System.out.println("hero battle win");
	}
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		Hero a = new ADHero();
		Hero b = new APHero();
		Hero c = new ADAPHero();
		
		garen.kill((Mortal)a);
		garen.kill((Mortal)b);
		garen.kill((Mortal)c);
	}
	
}
