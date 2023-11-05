package Jobsheet10;
import java.util.Scanner;

public class BioskopWithScannerModif05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");

            int choice = scan.nextInt();
            scan.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    inputDataPenonton(scan, penonton);
                    break;
                case 2:
                    tampilkanDaftarPenonton(penonton);
                    break;
                case 3:
                    System.out.println("Terima kasih. Exit program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }

    private static void inputDataPenonton(Scanner scan, String[][] penonton) {
        System.out.print("Masukkan nama: ");
        String nama = scan.nextLine();

        while (true) {
            System.out.print("Masukkan nomor kursi (format: baris-kolom, contoh: 2-1): ");
            String[] kursiInput = scan.nextLine().split("-");
            
            try {
                int baris = Integer.parseInt(kursiInput[0]);
                int kolom = Integer.parseInt(kursiInput[1]);

                if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil diinput.\n");
                        break;
                    } else {
                        System.out.println("Maaf, kursi sudah terisi. Silakan pilih kursi lain.");
                    }
                } else {
                    System.out.println("Invalid row or column. Silakan masukkan nomor kursi kembali.\n");
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Format nomor kursi tidak valid. Silakan masukkan nomor kursi kembali.\n");
            }
        }
    }

    private static void tampilkanDaftarPenonton(String[][] penonton) {
        System.out.println("Daftar Nama Penonton:");

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                if (penonton[i][j] != null) {
                    System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                } else {
                    System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                }
            }
        }

        System.out.println();
    }
}
