import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Attempt : ");

        int numberOfAttempts = sc.nextInt();
        int[] idNumber = new int[numberOfAttempts];

        for (int i = 0; i < numberOfAttempts; i++) {
            System.out.println("Please Enter the ID " + (i + 1) + " : ");
            idNumber[i] = sc.nextInt();
        }
        for (int j = 0; j < numberOfAttempts; j++) {
            System.out.println("The ID " + (j + 1) + " is : " + idNumber[j]);
        }
    }

}

