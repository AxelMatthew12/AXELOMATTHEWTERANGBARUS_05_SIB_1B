package Percobaan;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMahasiswa = 5; // Jumlah mahasiswa
        int jumlahTugas = 5; // Jumlah tugas

        // Membuat array untuk menyimpan nilai tugas mahasiswa
        double[][] nilaiTugas = new double[jumlahMahasiswa][jumlahTugas];

        // Memasukkan nilai tugas untuk setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai tugas untuk Mahasiswa ke-" + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Masukkan nilai tugas " + (j + 1) + ": ");
                nilaiTugas[i][j] = scanner.nextDouble();
            }
        }

        // Menampilkan nilai tugas untuk setiap mahasiswa
        System.out.println("\nNilai tugas lima mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiTugas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


