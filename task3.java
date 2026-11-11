
import java.util.Scanner;
import java.text.DecimalFormat;

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subjects = sc.nextInt();
        int students = sc.nextInt();

        int[][] grades = new int[students][subjects];
        double[] averages = new double[students];

        int total = 0;

        // Read all students' grades
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                grades[i][j] = sc.nextInt();
                total += grades[i][j];
            }
        }

        DecimalFormat df = new DecimalFormat("0.##");

        // Calculate student averages
        System.out.println("Student averages:");

        double highest = 0;

        for (int i = 0; i < students; i++) {

            int sum = 0;

            for (int j = 0; j < subjects; j++) {
                sum += grades[i][j];
            }

            averages[i] = (double) sum / subjects;

            System.out.println(df.format(averages[i]));

            if (averages[i] > highest) {
                highest = averages[i];
            }
        }

        // Calculate group average
        double groupAverage = (double) total / (subjects * students);

        System.out.println();
        System.out.println("Group average:");
        System.out.println(df.format(groupAverage));

        // Find highest-performing students
        System.out.println();
        System.out.println("Highest-performing student:");

        for (int i = 0; i < students; i++) {
            if (averages[i] == highest) {
                System.out.println(i + 1);
            }
        }

        // Find students with grades below 5
        System.out.println();
        System.out.println("Students with at least one grade below 5:");

        boolean found = false;

        for (int i = 0; i < students; i++) {

            boolean hasLowGrade = false;

            for (int j = 0; j < subjects; j++) {
                if (grades[i][j] < 5) {
                    hasLowGrade = true;
                    break;
                }
            }

            if (hasLowGrade) {
                System.out.println(i + 1);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }

        sc.close();
    }
}
