package Jobsheet9;
import java.util.Scanner;

public class LinearSearch05 {
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

        System.out.print("Masukkan nilai kunci yang ingin dicari: ");
        int key = scan.nextInt();

        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Kunci " + key + " ditemukan pada indeks " + hasil);
        } else {
            System.out.println("Kunci " + key + " tidak ditemukan dalam array");
        }
    }
}
