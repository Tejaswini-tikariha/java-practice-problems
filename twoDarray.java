import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows and Cols : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr1[][] = new int[rows][cols];
        int arr2[][] = new int[rows][cols];

        System.out.println("Enter the values for 1st Array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the values for 2nd Array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int arr3[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("This is your 1st Array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("This is your 2nd Array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of 1st and 2nd Arrays : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("ThankYou!");
    }
}
