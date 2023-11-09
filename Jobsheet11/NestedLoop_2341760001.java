package Jobsheet11;
import java.util.Scanner;

public class NestedLoop_2341760001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scan.nextDouble();
            }
            System.out.println();
        }

        System.out.println("Data temperatur:");

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double total = 0;

            for (double temp : temps[i]) {
                System.out.print(temp + " ");
                total += temp;
            }

            double average = total / temps[i].length;
            System.out.println("\nRata-rata: " + average);
        }
    }
}
