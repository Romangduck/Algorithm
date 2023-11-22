import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (b >= 45) {
            System.out.print(a + " " + (b - 45));
        } else if (a > 0) {
            System.out.print((a - 1) + " " + (b + 15));
        } else {
            System.out.print(23 + " " + (b + 15));
        }
    }
}
