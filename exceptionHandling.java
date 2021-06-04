import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int c = a / b;
            System.out.println("The division is : " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + " problem");
        }
        finally {
            System.out.println("I am like a default for switch case haha funny, I am gonna print anyway!");
        }
        System.out.println("Heyy!");
        System.out.println("Hello!");

//        throw : we use throws to handle throw, to handle use try catch.
        try {
            Thread.sleep(1000);
            boolean isDanger = true;
            if (isDanger) {
                throw new Exception("It is danger");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " occurred.");
        }
        System.out.println("Use google!");
    }
}
