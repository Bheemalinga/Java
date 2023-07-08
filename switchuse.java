import java.util.Scanner;

public class switchuse {
    public static void main(String a[]){

        Scanner input = new Scanner(System.in);

        int month;
        System.out.println("Enter month : ");
        month  = input.nextInt();

        switch(month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            default:
                System.err.println("Out of Assumption Bound, Add them to the code on your own!!!");
        }
    }
}
