package Jobsheet4;
import java.util.Scanner;
public class Hargabayar05{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Masukkan merk buku:");
        String merkBuku = input.nextLine();
        System.out.println("Masukkan jumlah halaman buku");
        String jumlahhalbuku = input.nextLine();
        int harga, jumlah;
        double dis=0.1, total, bayar, jmlDis;
        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
        jumlah=input.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
      
        System.out.println("Informasi buku:");
        System.out.println("===MerkBuku===\n" +merkBuku);
        System.out.println("===jumlah halaman===\n" +jumlahhalbuku);
        System.out.println("==Diskon yang anda dapatkan adalah==\n" +jmlDis);
        System.out.println("==Jumlah yang harus di bayarkan adalah==\n" +bayar);







    }
}