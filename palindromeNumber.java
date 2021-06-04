import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int temp = n;
        int reverseNumber = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            temp /= 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
        }
        System.out.println("The reverse number of " + n + " is : " + reverseNumber);
        if (n == reverseNumber) {
            System.out.println("The number is Palindrome!");
        } else {
            System.out.println("The number is not Palindrome!");
        }
    }
}
