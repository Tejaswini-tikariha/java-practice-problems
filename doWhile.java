import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number...");
        int num2 = sc.nextInt();
        int num = 0;
        do {
            System.out.println("Enter again to Confirm : ");
            num = sc.nextInt();
            if (num == num2) {
                System.out.println("Congratulations!!!");
                break;
            } else {
                System.out.println("Sorry...");
                System.out.println("Please try again!");
            }
        } while (num != num2);
    }
}
