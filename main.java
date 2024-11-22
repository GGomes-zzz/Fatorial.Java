import java.util.Scanner;
import java.util.Locale;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long fat = 1;

        for (int i = 2; i <= N; i++) {
            fat *= i;

        }
        System.out.println(fat);
    }
}