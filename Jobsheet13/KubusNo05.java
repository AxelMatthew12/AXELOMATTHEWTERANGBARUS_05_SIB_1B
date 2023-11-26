package Jobsheet13;
import java.util.Scanner;

public class KubusNo05 {
    static Scanner input = new Scanner(System.in);

    static void inputNilaiTugas() {
        int jumlahMahasiswa = 5;
        int jumlahTugas = 5;

        String[] namaMahasiswa = new String[jumlahMahasiswa];
        double[][] nilaiTugas = new double[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama Mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input.nextLine();

            System.out.println("Masukkan nilai tugas untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Masukkan nilai tugas " + (j + 1) + ": ");
                nilaiTugas[i][j] = input.nextDouble();
            }
            input.nextLine(); 
        }

        // Menampilkan nilai tugas untuk setiap mahasiswa
        System.out.println("\nNilai tugas lima mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + namaMahasiswa[i] + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiTugas[i][j] + "\t");
            }
            System.out.println();
        }

        // Memanggil fungsi untuk menampilkan nilai per minggu
        tampilkanNilaiPerMinggu(nilaiTugas, namaMahasiswa, jumlahMahasiswa, jumlahTugas);
    }

    static void tampilkanNilaiPerMinggu(double[][] nilaiTugas, String[] namaMahasiswa, int jumlahMahasiswa, int jumlahTugas) {
        System.out.println("\nNilai per minggu:");
        for (int minggu = 0; minggu < jumlahTugas; minggu++) {
            System.out.println("Minggu " + (minggu + 1) + ":");
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("Mahasiswa " + namaMahasiswa[i] + ": " + nilaiTugas[i][minggu]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inputNilaiTugas();
        input.close(); 
    }
}
