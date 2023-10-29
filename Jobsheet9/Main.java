package Jobsheet9;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = scan.nextInt();

        int[] arrayInt = new int[n];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen " + (i + 1) + ": ");
            arrayInt[i] = scan.nextInt();
        }

        // Inisialisasi nilai tertinggi, nilai terendah, dan total
        int nilaiTertinggi = arrayInt[0];
        int nilaiTerendah = arrayInt[0];
        int total = arrayInt[0];

        // Menghitung nilai tertinggi, nilai terendah, dan total
        for (int i = 1; i < n; i++) {
            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            }
            if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }
            total += arrayInt[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / n;

        // Menampilkan hasil
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}

