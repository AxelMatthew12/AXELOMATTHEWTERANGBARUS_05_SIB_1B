package Jobsheet14;
import java.util.Scanner;
public class DeretDescendingRekursif {
    
    static int menampilkanangka(int n){
        if (n==0) {
            System.out.print(" ");
            return 0;

            
        }else{
            int hasil = menampilkanangka(n-1);
            System.out.println(n+" ");
            return hasil;
        }

    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan nilai bilangan (n): ");
        int masukkan= input.nextInt();

        System.out.println("Urutan bilangan dari n sampai 0 adalah: "+masukkan);
        int hasil=menampilkanangka(masukkan);
        System.out.println(hasil);

    }
    
}
