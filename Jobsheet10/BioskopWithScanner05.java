package Jobsheet10;
import java.util.Scanner;
public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] penonton= new String[4][2];
        while (true) {
            System.out.print("Masukkan nama: ");
             String nama= scan.nextLine();
             System.out.print("Masukkan baris:");
             int baris= scan.nextInt();
             System.out.print("Masukkan kolom :");
             int kolom= scan.nextInt();
             scan.nextLine();

             penonton[baris-1][kolom-1]= nama;
             System.out.println("input penonton lainnya? (y/n):");
             String next= scan.nextLine();

             if (next.equalsIgnoreCase("n")) {
                break;
                
             }
             
            
        }
    }
    
}
