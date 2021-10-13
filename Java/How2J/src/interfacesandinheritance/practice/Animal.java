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
        System.out.println("用" + this.legs + "条腿行走");
    }
}

class Spider extends Animal {


    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("吃");
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
        System.out.println("玩");
    }

    @Override
    public void eat() {
        System.out.println("吃猫粮");
    }
}

class Fish extends Animal implements Pet {
    private String name;

    public Fish() {

    }

    @Override
    public void walk() {
        System.out.println("鱼没有腿，无法行走！");
    }

    @Override
    public void eat() {
        System.out.println("吃鱼饵");
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
        System.out.println("游");
    }

}
