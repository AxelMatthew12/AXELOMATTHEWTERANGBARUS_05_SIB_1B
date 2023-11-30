package Jobsheet14;
import java.util.Scanner;

public class Percobaan2 {
    static int hitungpangkat(int x, int y){
        if (y == 0) {
            System.out.print("1 "); // Cetak nilai 1 ketika pangkat 0
            return 1;
        } else {
            int hasil = x * hitungpangkat(x, y-1);
            System.out.print(hasil + " "); // Cetak nilai hasil perhitungan
            return hasil;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;

        System.out.println("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.println("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println("Hasil pangkat: " + hitungpangkat(bilangan, pangkat));
    }
}
