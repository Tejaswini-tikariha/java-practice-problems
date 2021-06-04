import java.util.Scanner;

public class whileSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        int totalDigits = (int)Math.log10(n) + 1;
        System.out.println("The total digits in " + n + " is : " + totalDigits);
        while(temp > 0) {
            int num = temp % 10;
            temp = temp / 10;
            sum = sum + num;
        }
        System.out.println("The sum of " + n + " is : " + sum);
    }
}
