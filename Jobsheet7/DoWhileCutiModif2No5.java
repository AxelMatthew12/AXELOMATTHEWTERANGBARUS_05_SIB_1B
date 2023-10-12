package Jobsheet7;
import java.util.Scanner;

public class DoWhileCutiModif2No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.println("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("t")) {
                break; // Hentikan program jika "t" dimasukkan
            }

            if (konfirmasi.equalsIgnoreCase("y")) {
                do {
                    System.out.println("Jumlah hari: ");
                    jumlahHari = sc.nextInt();

                    if (jumlahHari <= jatahCuti) {
                        jatahCuti -= jumlahHari;
                        System.out.println("Sisa jatah cuti: " + jatahCuti);
                        break;
                    } else {
                        System.out.println("Maaf, jumlah hari yang diminta melebihi jatah cuti. Masukkan kembali.");
                    }
                } while (true);
            }
        } while (jatahCuti > 0);
    }
}