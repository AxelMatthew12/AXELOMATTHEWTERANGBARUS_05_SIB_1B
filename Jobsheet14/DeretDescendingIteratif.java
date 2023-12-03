package Jobsheet14;
import java.util.Scanner;
public class DeretDescendingIteratif {
    public static void printCountDown(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Masukkan nilai-n: ");
        int n= sc.nextInt();
        System.out.println("Countdown dari " + n + " sampai 0:");
        printCountDown(n);
    }
}

