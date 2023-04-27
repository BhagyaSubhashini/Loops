public class Increment {
    public static void main(String[] args) {
        System.out.println("this is post increment");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("this is pre increment");
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i);
        }
        System.out.println("this is post decrement");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("this is pre decrement");
        for (int i = 10; i >= 1; --i) {
            System.out.println(i);
        }
    }
}