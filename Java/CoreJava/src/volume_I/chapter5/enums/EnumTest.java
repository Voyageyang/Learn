package volume_I.chapter5.enums;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String s = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, s);
        System.out.println("size = " + size);
        System.out.println("abbreviation = " + size.getAbbr());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job -- you paid attention to the _.");
        }
    }
}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String abbr;

    private Size(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }
}
