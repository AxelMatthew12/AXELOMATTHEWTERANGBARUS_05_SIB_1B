import java.util.Scanner;
public class PemilihanPercobaan1No5{
    public static void main(String[] args) {
        Scanner input00= new Scanner(System.in);

        //menginput nilai
        System.out.println("Masukkan angka:  ");
        int angka = input00.nextInt();

        //Menghitung nilai
        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan genap" :"Bilangan ganjil";
        System.out.println(angka + "===adalah===" +hasil);




        
    }
}