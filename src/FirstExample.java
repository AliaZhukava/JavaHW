package lesson11;

public class FirstExample {

    public static void main(String[] args) {
        String value = null;
        try {
            System.out.println(value.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("some code");
        System.out.println("444");
        System.out.println("second branch");
        System.out.println("third branch");
    }
}
