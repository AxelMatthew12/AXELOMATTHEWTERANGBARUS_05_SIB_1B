package Jobsheet4;
import java.util.Scanner;
public class Lingkaran05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //Rumus lingkaran 
        int r;
        double keliling, luas;
        System.out.println("Masukkan jari-jari lingkaran");
        r=input.nextInt();
        keliling=2*3.14*r; 
        luas=3.14*r*r;
        System.out.println(keliling);
        System.out.println(luas);

    }
    
}