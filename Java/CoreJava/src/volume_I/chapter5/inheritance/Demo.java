package volume_I.chapter5.inheritance;

public class Demo {
    public static void main(String[] args) {
        Manager[] managers = new Manager[10];

        Employee[] staff = managers;

        staff[0] = new Employee("Harry", 80000, 1985, 10, 15);
        System.out.println(staff[0].getName() + " " + staff[0].getSalary());

    }
}
