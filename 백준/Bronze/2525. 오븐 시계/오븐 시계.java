import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();  // Corrected the typo here

        a += c / 60;
        b += c % 60;

        if (b >= 60) {
            a += 1;
            b -= 60;
        }

        if (a >= 24) {
            a -= 24;
        }

        System.out.print(a + " " + b);

    }
}
