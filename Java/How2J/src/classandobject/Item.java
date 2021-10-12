package classandobject;

public abstract class Item {
	
	String name;
	int price;
	
	public void effect() {
		System.out.println("��Ʒʹ�ú󣬿�����Ч��");
	}
	
	public String toString() {
		return this.name + " "+ this.price; 
	}
	
	public void finalize() {
		System.out.println("��ǰ�������ڱ�����");
	}
	
	public boolean equals(Object o) {
		if(o instanceof Item) {
			Item i = (Item) o;
			return this.name == i.name && this.price == i.price;
		}
		return false;
	}

	public abstract boolean disposable();
	
	public static void main(String[] args) {
		/*
		Item blood = new Item();
		blood.name = "Ѫƿ";
		blood.price = 50;
		
		Item strawSandals = new Item();
		strawSandals.name = "��Ь";
		strawSandals.price = 300;
		
		Item longSword = new Item();
		longSword.name = "����";
		longSword.price = 350;
		*/
		/*
		Item h = new Item();
		h.name = "�̽�";
		h.price = 150;
		System.out.println(h.toString());
		System.out.println(h);
		*/
		/*
		Item h;
		for(int i = 0; i < 1000000; i++) {
			h = new Item();
		}
		*/
		/*Item h1 = new Item();
		h1.name = "����"; h1.price = 50;
		Item h2 = new Item();
		h2.name = "����"; h2.price = 50;
		Item h3 = new Item();
		h3.name = "���Ӽ�"; h3.price = 150;
		
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));*/
		Armor a = new Armor();
		System.out.println(a.disposable());

		Item i = new Item() {
			public boolean disposable() {
				return true;
			}
		};
		System.out.println(i.disposable());
	}

}
