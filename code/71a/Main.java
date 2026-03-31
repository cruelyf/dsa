public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        
        sc.nextLint();

        String[] strs = new String[w];

        for ( int i = 0; i < w; i++ ) {
            String word = strs[i]
            int len = word.length();
            if ( len > 10 ) {
                System.out.println("" + word.charAt(0) + len + word.charAt(len - 1))
            }
        }
    }
}