package Jobsheet13;
import java.util.Scanner;

public class UcapatanTerimakasih_05 {
    private static Scanner sc = new Scanner(System.in);

    public static String PenerimaUcapan() {
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
        
        String tambahan = UcapanTambahan("Your dedication is truly inspiring!"); // Memanggil fungsi UcapanTambahan()
        System.out.println(tambahan);
    }

    public static String UcapanTambahan(String tambahan) {
        return "Additional message: " + tambahan;
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        sc.close();
    }
}
