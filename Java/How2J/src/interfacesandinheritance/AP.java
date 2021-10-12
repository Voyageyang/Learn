package interfacesandinheritance;

public interface AP {
    public void magicAttack();

    public default void attack() {
        System.out.println("Ä§·¨¹¥»÷");
    }
}
