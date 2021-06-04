import java.util.Scanner;

public class AnagramMethod3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word : ");
        String a = sc.nextLine();
        String b = sc.nextLine();

        boolean isAnagram = true;

        int[] arr = new int[256];

        for (char c: a.toCharArray()) {
            int index = (int)c;
            arr[index]++;
        }
        for (char c: b.toCharArray()) {
            int index = (int)c;
            arr[index]--;
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i] != 0) {
                isAnagram = false;
            }
        }
        if (isAnagram) {
            System.out.println("Anagram!");
        } else {
            System.out.println("Not Anagram!");
        }
    }
}
