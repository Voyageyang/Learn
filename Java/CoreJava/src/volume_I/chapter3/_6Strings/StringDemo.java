package volume_I.chapter3._6Strings;

public class StringDemo {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting.length());

        String s = "\uD835\uDD46 is the set of octonions";
        System.out.println(s.codePointAt(s.offsetByCodePoints(1,-1)));

        char ch = s.charAt(1);
        System.out.println(ch);

    }
}
