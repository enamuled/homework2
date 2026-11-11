
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int radius = sc.nextInt();

            if (radius > max) {
                max = radius;
                count = 1;
            } else if (radius == max) {
                count++;
            }
        }

        System.out.println(max + " - " + count);

        sc.close();
    }
}
