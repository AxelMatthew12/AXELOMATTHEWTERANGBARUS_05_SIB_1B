package Jobsheet14;
import java.util.Scanner;

public class Fungsirekrusi {
    static int hitungPenjumlahan(int n) {
        if (n == 1) {
            System.out.print("1 ");
            return 1;
        } else {
            int hasil = n + hitungPenjumlahan(n - 1);
            System.out.print("+ " + n + " ");
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai bilangan (f): ");
        int f = sc.nextInt();

        System.out.print("Deret penjumlahan dari 1 sampai " + f + " = ");
        int hasil = hitungPenjumlahan(f);
        System.out.println("= " + hasil);
    }
}
