public class function {

    static void greetings() {
        System.out.println("Hello, welcome to the Method !!!\n");
    }

    static String greetings(String name) {
        return "Hello, " + name;
    }

    static int greetings(int num) {
        return num + 5;
    }

    public static void main(String[] args) {

        greetings();
        System.out.println(greetings("Java"));
        System.out.println(greetings(10));

        System.out.println("Hello and Welcome to Main !\n");

    }
}
