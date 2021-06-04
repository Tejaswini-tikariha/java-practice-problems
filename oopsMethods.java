import java.util.Scanner;

public class oopsMethods {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sayHi();
        System.out.println("Enter numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result  = maxOf(a, b);
        System.out.println(result + " is greater.");
    }
    static void sayHi() {
        System.out.println("Hi!");
        System.out.println("Greetings of the Day..!");
    }
    static int maxOf(int a, int b) {
        return a > b ? a : b;
    }

}
