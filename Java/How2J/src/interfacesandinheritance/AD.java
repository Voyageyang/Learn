package interfacesandinheritance;

public interface AD {
    public void physicAttack();

    public default void attack() {
        System.out.println("ÎïÀí¹¥»÷");
    }
}
