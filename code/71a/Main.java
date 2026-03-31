import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < w; i++) {
            String word = sc.nextLine();
            int len = word.length();

            if (len > 10)
                System.out.println("" + word.charAt(0) + (len - 2) + word.charAt(len - 1));
            else
                System.out.println(word);
        }
    }
}