package string.immutable;

public class Ex01StringImmutableDemo {
    public static void main(String[] args) {
        String o1 = new String("Hello");
        String o2 = new String("Hello");
        String o3 = new String("Vietnam");

        hashing("o1", o1);
        hashing("o2", o2);
        hashing("o3", o3);

        System.out.println("---------------------------");

        String l1 = "hi";
        String l2 = "hi";
        String l3 = "Vietnam";
        String l4 = "hi";

        l2 = "hello";

        hashing("l1", l1);
        hashing("l2", l2);
        hashing("l3", l3);
        hashing("l4", l4);

    }

    private static void hashing(String text, String o) {
        System.out.println(text + "-->" + System.identityHashCode(o));
    }
}
