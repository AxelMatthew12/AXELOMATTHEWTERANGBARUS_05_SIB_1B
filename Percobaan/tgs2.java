package Percobaan;
import java.util.Scanner;

public class tgs2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai N= ");
        int N = scan.nextInt();

        // Cetak setengah segitiga terbalik
        for (int i = 1; i <= N; i++) {
            // Cetak spasi untuk penyejajaran di sebelah kiri
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            // Cetak bintang untuk setiap baris
            for (int k = i; k <= N; k++) {
                System.out.print("* ");
            }

            System.out.println(); // Pindah ke baris berikutnya setelah setiap baris
        }
    }
}