import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int res = 0;

        int n = sc.nextInt();

        for ( int i = 0; i < n; i++ ) {

            int count = 0;
            for ( int j = 0; j < 3; j++ ) if ( sc.nextInt() == 1 ) count++;

            if ( count > 1 ) res++;
            
        }

        System.out.println(res);
    }
}