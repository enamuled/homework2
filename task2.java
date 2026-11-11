
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] residents = new int[n];

        int total = 0;
        int left = 0;
        int right = 0;

        // Read all data into an array
        for (int i = 0; i < n; i++) {
            residents[i] = sc.nextInt();
        }

        // Calculate residents on each side
        for (int i = 0; i < n; i++) {

            total += residents[i];

            if ((i + 1) % 2 == 1) {
                left += residents[i];
            } else {
                right += residents[i];
            }
        }

        int leftHouses = (n + 1) / 2;
        int rightHouses = n / 2;

        System.out.println("Total residents: " + total);
        System.out.println("Residents on the left: " + left);
        System.out.println("Residents on the right: " + right);

        if (leftHouses > 0) {
            System.out.println("Average per house on the left: " + (left / leftHouses));
        } else {
            System.out.println("Average per house on the left: N/A");
        }

        if (rightHouses > 0) {
            System.out.println("Average per house on the right: " + (right / rightHouses));
        } else {
            System.out.println("Average per house on the right: N/A");
        }

        sc.close();
    }
}
