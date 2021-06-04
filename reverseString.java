import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence : ");
        String sentence = sc.nextLine();
        int i = sentence.length()-1;
        String ans = "";

        while (i >= 0) {
            while (i >= 0 && sentence.charAt(i) == ' ') i--;
            int j = i;
            if (i < 0) break;
            while (i >= 0 && sentence.charAt(i) != ' ')i--;
            if (ans.isEmpty()) {
                ans = ans.concat(sentence.substring(i+1, j+1));
            } else {
                ans = ans.concat(" " + sentence.substring(i+1, j+1));
            }
        }
        System.out.println(ans);
    }
}
