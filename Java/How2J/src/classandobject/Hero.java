package classandobject;

import interfacesandinheritance.*;


public class Hero {

	/*
	{
        name = Hero.getName("初始化块");
    }
    
    public Hero(){
        name = Hero.getName("构造方法");
    }
    */
	public String name; // =Hero.getName("属性声明") ;
	
	float hp; //血量
	
	float armor; // 护甲
	
	int moveSpeed; // 移动速度
	
	static String copyright;
	
	/*
	 * 饿汉单例模式
	private Hero() {
		
	}
	
	private static Hero Instance = new Hero();
	
	public static Hero getInstance() {
		return Instance;
	}
	*/
	
	/*
	 * 懒汉单例模式
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
	
	// 坑队友
	void keng() {
		System.out.println("坑队友！");
	}
	
	// 获取护甲值
	float getArmor() {
		return armor;
	}
	
	// 增加移动速度
	void addSpeed(int speed) {
		moveSpeed += speed;
	}
	
	void legendary() {
		System.out.println("超神！");
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
