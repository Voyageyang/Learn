package lec01.lec02.assignments;

public class FooCorporation {
    public static void main(String[] args) {
        getPaid(7.50, 35);
        getPaid(8.20, 47);
        getPaid(10.00, 73);
    }
    public static void getPaid(double basePay, double workHour) {
        System.out.println("Your base pay is $" + basePay + ".");
        System.out.println("Your working hour is " + workHour + " hours.\n");
        if(basePay < 8) System.out.println("Base pay so little!!!");
        if(workHour > 60) System.out.println("Work too long!!!");
        boolean flag = (basePay >= 8) && (workHour < 60);
        if(flag) {
            double getPay = 0;
            if(basePay <= 40) {
                System.out.println("Your total pay is $" + workHour * basePay + ".");
            } else {
                System.out.println("Your total pay is $" + 40 * basePay + (workHour - 40) * basePay * 1.5 + ".");
            }
        }
        System.out.println("=====================================================");
        System.out.println("\n");
    }
}
