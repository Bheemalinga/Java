import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = obj.nextLine();
        System.out.println("Entered Name is "+name);
    }
}