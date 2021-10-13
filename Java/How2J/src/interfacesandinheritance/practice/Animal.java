package interfacesandinheritance.practice;

public abstract class Animal {
    protected int legs;

    protected Animal() {

    }

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("��" + this.legs + "��������");
    }
}

class Spider extends Animal {


    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("��");
    }
}

class Cat extends Animal implements Pet {
    String name;

    public Cat() {
        this("");
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("��");
    }

    @Override
    public void eat() {
        System.out.println("��è��");
    }
}

class Fish extends Animal implements Pet {
    private String name;

    public Fish() {

    }

    @Override
    public void walk() {
        System.out.println("��û���ȣ��޷����ߣ�");
    }

    @Override
    public void eat() {
        System.out.println("�����");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("��");
    }

}
